package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
TextView textElement;
ImageView imageElement;
boolean isOnHello = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textElement = (TextView) findViewById(R.id.textView);
        final ImageView imageElement = (ImageView) findViewById(R.id.imageView2);
        final Button button = (Button) findViewById(R.id.clickbutton);
        //final Button button2 = (Button) findViewById(R.id.button);
        imageElement.setImageDrawable(getResources().getDrawable(R.drawable.android_happy));
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOnHello)
                {
                textElement.setText("Goodbye!");
                textElement.setTextColor(Color.RED);
                    isOnHello = false;
                    imageElement.setImageDrawable(getResources().getDrawable(R.drawable.android_picture));
                }
                else {
                    textElement.setText("Hello");
                    textElement.setTextColor(Color.BLUE);
                    isOnHello = true;
                    imageElement.setImageDrawable(getResources().getDrawable(R.drawable.android_happy));
                }
            }
        });
        //button2.setOnClickListener(new View.OnClickListener() {
         //   public void onClick(View v) {
           //     imageElement.setImageDrawable(getResources().getDrawable(R.drawable.facebook_1475533512296));
          //  }
      //  });
    }
}