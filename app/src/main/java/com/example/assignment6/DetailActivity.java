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

        String faculty_name = title.replace(" ","_");

        int detaild = getResources().getIdentifier(faculty_name,"array",this.getPackageName());
        //obtain the array which id is detailId
        String[] detailArray = getResources().getStringArray(detaild);

        //Set textview text to the sting
        TextView tvc = (TextView)findViewById(R.id.textviewDetailContent);
        tvc.setText(detailArray[2]);

        String imgName = detailArray[0];
        //find the image id in drawable folder
        int ImageId= getResources().getIdentifier(imgName,"drawable",this.getPackageName());
        //find image source
        Drawable detailImg = getDrawable(ImageId);

        //put image source in ImageView
        ImageView imageView = (ImageView)findViewById(R.id.imageviewDetailImage);
        imageView.setImageDrawable(detailImg);
    }

//    public void onclickSea(View view){
//        //Toast.makeText(this, "Mountain!", Toast.LENGTH_LONG).show();
//        //Get ImageView
//        ImageView iv = (ImageView)findViewById(R.id.imageviewLogo);
//
//        //Set image drawable
//        Drawable myImg = getDrawable(R.drawable.sea);
//        iv.setImageDrawable(myImg);
//
//        //Get TextView
//        TextView title = (TextView)findViewById(R.id.textviewTitle);
//
//        //Set text
//        String myTitle = getResources().getString(R.string.title_Sea);
//        title.setText(myTitle);
//    }

//    String titleMount = getResources().getString(R.string.title_Mount);
//    String titleHill = getResources().getString(R.string.title_Hill);
//    String titleSea = getResources().getString(R.string.title_Sea);
//
//    Drawable drawMount = getDrawable(R.drawable.mountain);
//    Drawable drawHill = getDrawable(R.drawable.hill);
//    Drawable drawSea = getDrawable(R.drawable.sea);
//
//    ImageView imageView = (ImageView)findViewById(R.id.imageviewLogo);
//    TextView textView = (TextView)findViewById(R.id.textviewTitle);
//    RadioButton radioButtonSea = (RadioButton)findViewById(R.id.radiobutton_sea);
//
//    // Set title to "Sea"
//        textView.setText(titleSea);
//
//    // Set drawable to sea
//        imageView.setImageDrawable(drawSea);
//
//    // Set radio checked sea
//        radioButtonSea.setChecked(true);
//
//    // Get checked radio button
//    RadioGroup radiogroup =  (RadioGroup)findViewById(R.id.radiogroupStyles);
//    int currentButtonId = radiogroup.getCheckedRadioButtonId();
//    RadioButton current = (RadioButton)findViewById(currentButtonId);
//        Log.i("EXAMPLE", (String)current.getText());

}
