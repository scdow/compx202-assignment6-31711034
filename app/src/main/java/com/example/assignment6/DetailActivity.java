package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Get extra data from intent (string)
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        //Set textview text to the sting
        TextView tv = (TextView)findViewById(R.id.textviewDetailTitle);
        tv.setText(title);
    }

}
