package com.dicoding.picodiploma.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {
    TextView tvObjectReceived;
    public static final String EXTRA_PERSON = "extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObjectReceived = findViewById(R.id.tv_object_received);
        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name: " + person.getName() + "\nAge: " + person.getAge() + "\nEmail: " + person.getEmail() + "\nCity: " + person.getCity();
        tvObjectReceived.setText(text);
    }
}
