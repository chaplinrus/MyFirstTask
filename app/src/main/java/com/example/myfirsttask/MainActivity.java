package com.example.myfirsttask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        TextView text3 = findViewById(R.id.text3);
        EditText editText = findViewById(R.id.edit_text);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                text.setText("Cпасибо что нажали");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text3.setText(editText.getText());
            }
        });
    }
}