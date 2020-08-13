package com.aditya.experiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //here the buttons clicked functions are dealt through java programming language (Programical method) this method should be preferred
    private Button button;
    View view;
    String Tag ="Main Activity";
    TextView textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_2);
        Log.i(Tag, "----on create----");
        textView7 = (TextView) findViewById(R.id.textView7); //IMPORTANT STEP
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }
public void clk(View view)
{   //EditText widget:-
    // this piece of code will only take and display numbers
    //it will crash if you try to enter the alphabets in the input field
    /* EditText textView5= (EditText) findViewById(R.id.textView5);
    String namea = textView5.getText().toString();
    Double doublenamea = Double.parseDouble(namea);
    Double output = doublenamea;
    String toasttext = output.toString();
    textView7.setText(toasttext); */

    // Under this is a piece of code that will take String as well as integer values an input and display it
    EditText textView5= (EditText) findViewById(R.id.textView5);
    String namea = textView5.getText().toString();
    String toasttext = namea;
    textView7.setText(toasttext);
}
    @Override
    public void onStart()
    {
        super.onStart();
        Log.i(Tag, "----on Start----");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i(Tag, "----on Restart----");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.i(Tag, "----on Resume----");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.i(Tag, "----on Pause----");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.i(Tag, "----on Stop----");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.i(Tag, "----on Destroy----");
    }
    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.button2:
                Intent intent2 = new Intent(this, Activity3.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, Activity4.class);
                startActivity(intent3);
                break;
        }
    }
}
