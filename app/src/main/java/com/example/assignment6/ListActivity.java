package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.List;

public class ListActivity extends AppCompatActivity {

//    String[] listArray = {"aa","cc","ll","kk","rr","ll","jj"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] listArray = getResources().getStringArray(R.array.listArray);

        // Create a new ArrayAdapter<String>
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listArray);

        // Get the ListView
        ListView lv = (ListView) findViewById(R.id.listView);

        //Set the adapter on the ListView
        lv.setAdapter(adapter);

    //Set a click event for each with OnItemClickListener - create a Toast with information on clicked item
        lv.setOnItemClickListener(new OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //get selected item text
            TextView tv = (TextView) view;
            String titleText = (String) tv.getText();

//            Toast.makeText(parent.getContext(), "Text: " + titleText + " Position: " + String.valueOf(position)+ " Id: " + String.valueOf(id), Toast.LENGTH_SHORT).show();

            // Create new intent for DetailActivity
            Intent intent = new Intent(parent.getContext(), DetailActivity.class);
            // Add text as intent extra data
            intent.putExtra("title", titleText);
            // Start the activity with the intent
            startActivity(intent);

        }
    });

    }

}

//Add an OnItemClickListener to your ListView that will start an explicit Intent that opens a DetailActivity when a list item is clicked.
// Make sure you pass the text content of the clicked item (i.e. the name of the programme) through the Intent,
// you will need to use this in the DetailActivity.