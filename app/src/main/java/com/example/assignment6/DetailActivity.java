package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Get extra data from intent (string)
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String faculty_name = title.replace(" ","_");
        int detaild = getResources().getIdentifier(faculty_name,"array",this.getPackageName());
        //obtain the array which id is detailId
        String[] detailArray = getResources().getStringArray(detaild);

        /*Title*/
        //Set textview text to the sting
        TextView tv = (TextView)findViewById(R.id.textviewDetailTitle);
        tv.setText(title);

        /*Content*/
        //Set textview text to the sting
        TextView tvc = (TextView)findViewById(R.id.textviewDetailContent);
        tvc.setText(detailArray[2]);

        /*Image*/
        String imgName = detailArray[0];
        //find the image id in drawable folder
        int ImageId= getResources().getIdentifier(imgName,"drawable",this.getPackageName());
        //find image source
        Drawable detailImg = getDrawable(ImageId);

        //put image source in ImageView
        ImageView imageView = (ImageView)findViewById(R.id.imageviewDetailImage);
        imageView.setImageDrawable(detailImg);
    }

    public void onclickShare (View view){
//        Toast.makeText(this, "onclickShare work", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND); // sharing data
        intent.setType("text/plain"); // mime type = plain text

        TextView content = (TextView) findViewById(R.id.textviewDetailContent);
        String contentText = (String) content.getText();

//        intent.putExtra(Intent.EXTRA_TEXT, "some plain text data");
        intent.putExtra(Intent.EXTRA_TEXT, contentText);
        startActivity(intent);
    }

}
