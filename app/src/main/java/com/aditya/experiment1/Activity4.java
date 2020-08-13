package com.aditya.experiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() { //setting an onclick Listener on an individual button
            @Override
            public void onClick(View view) {
                editText = findViewById(R.id.editText);
                String numa = editText.getText().toString(); //value of pound
                Double doublenuma = Double.parseDouble(numa);
                Double doubleresult = doublenuma * 0.45359237 ;
                String result ="pound to kg" + doubleresult.toString();
                textView.setText(result);
            }
        });
    }
}
