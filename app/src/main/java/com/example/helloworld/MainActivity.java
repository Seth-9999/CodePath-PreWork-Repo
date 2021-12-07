package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    // https://brightside.me/article/the-ultimate-color-combinations-cheat-sheet-92405/
    // https://www.color-hex.com/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textWording = ((TextView)findViewById(R.id.text));

        // change Text coor
        findViewById(R.id.btnChangeTextColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWording.setTextColor(getResources().getColor(R.color.red));
            }
        });

        // Change background color
        findViewById(R.id.btnChangeBackground).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.darker_green));
            }
        });


        // Change text in label
        findViewById(R.id.btnChangeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // Reset all views to default value
        // 1. Reset text to Hello from Jonathan!  id=text
        // 2. Reset text color to "@color/chocolate_brown" id=text
        // 3. Reset background to "@color/light_green" id=parent
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Hello from Jonathan!");
                textWording.setTextColor(getResources().getColor(R.color.chocolate_brown));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_green));
            }
        });

        // Set label to be custom text
        findViewById(R.id.btnChangeCustomText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customText = ((EditText)findViewById(R.id.editText)).getText().toString();

                if(customText.isEmpty()){
                    textWording.setText("Enter your own text!");
                } else {
                    textWording.setText(customText);
                }

            }
        });


    }
}