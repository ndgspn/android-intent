package com.dicoding.picodiploma.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    TextView tvDataReceived;
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvDataReceived = findViewById(R.id.tv_data_received);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Name : " + name + "\nAge : " + age;
        tvDataReceived.setText(text);

    }
}
