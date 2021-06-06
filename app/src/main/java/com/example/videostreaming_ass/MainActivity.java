package com.example.videostreaming_ass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4");

            }
        });

    }
    public void intent(String url){
        Intent i =new Intent(this,MainActivity2.class);
        i.putExtra("Url",url);
        startActivity(i);
    }
}