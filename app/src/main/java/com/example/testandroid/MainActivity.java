package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateText(View view) {
        TextView tv1 = (TextView)findViewById(R.id.movement_text);
        tv1.setText("Clicking? Yes");
    }
}