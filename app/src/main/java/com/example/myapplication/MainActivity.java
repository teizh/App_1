package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.cont);
        EditText editText = findViewById(R.id.email);
        EditText editText2 = findViewById(R.id.facebook);

        TextView textView = findViewById(R.id.or);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String text1 = editText.getText().toString();
                String text2 = editText2.getText().toString();
                if (text2!=null) {
                    textView.setText("Welcome " + text2);
                }else {
                textView.setText("Welcome " + text1);}
            }
        });


    }
}