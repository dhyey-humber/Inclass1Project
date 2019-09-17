package com.ceng319.inclass1project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textBox(View view) {
        Toast.makeText(getApplicationContext(),"Hello, This is my first Android APP",Toast.LENGTH_SHORT).show();
    }
}
