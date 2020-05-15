package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickStart (View view){

//        Toast.makeText(this, "onclickStart work", Toast.LENGTH_SHORT).show();

        // Create new intent for ListActivity
        Intent intent = new Intent(this, ListActivity.class);

        // Start the activity with the intent
        startActivity(intent);

    }
}
