package com.aditya.experiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.ImageView;

public class Activity3 extends AppCompatActivity
{
private Button button; //initializing button
String Tag = "Activity3";
ImageView imageView ; //initializing imageview
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.i(Tag, "---On create---");
        imageView = findViewById(R.id.imageView); // declaring imageview

        button = findViewById(R.id.button4);//declaring button
        button.setOnClickListener(new View.OnClickListener() //setting onclicklistener on a single button individually
                                                             //not implementing on clicklistener on the entire Activity view
        {
            @Override
            public void onClick(View view) {
            //code that will change the image when the button is clicked
                imageView.setImageResource(R.drawable.socialmedia_ii);
            }
        });//setting onclick listener on to the button4

       Button button2 = findViewById(R.id.button5);
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //code that will change the image when the button is clicked
               imageView.setImageResource(R.drawable.socialmedia_iii);
           }
       });//setting onclick listener on to the button5

        Button button3 = findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code that will change the image when the button is clicked
                imageView.setImageResource(R.drawable.socialmedia_i);
            }
        });//setting onclick listener on to the button6
    }
}
