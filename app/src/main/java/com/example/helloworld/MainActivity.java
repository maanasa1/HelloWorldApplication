package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //user can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //change the text color of the label
                textView.setTextColor(getResources().getColor(R.color.teal_700));
            }
        });

        //user can tap a button to change the color of the background view
        findViewById(R.id.changeBackground).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.cream));
            }
        });

        //user can tap a button to change the text string of the label - "Android is Awesome!"
        findViewById(R.id.changeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Android is Awesome!");
            }
        });

        //user can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Reset the text to "Hello from Maanasa" id - @id/text
                textView.setText("Hello from Maanasa");

                // Reset the text color to the original text color
                // Original text color - white; text id - @id/text
                textView.setTextColor(getResources().getColor(R.color.white));

                // Reset the background color
                // original background color - light maroon
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_maroon));
            }
        });

        findViewById(R.id.changeCustomText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // If the text entered is empty, update the label with default text string
                if(userEnteredText.isEmpty())
                    textView.setText("Enter your own text!");
                else
                    textView.setText(userEnteredText);
            }
        });
    }
}