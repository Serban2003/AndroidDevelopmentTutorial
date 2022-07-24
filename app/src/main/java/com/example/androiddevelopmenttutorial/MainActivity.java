package com.example.androiddevelopmenttutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onButtonClick(View view){
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextEmailAddress);

        TextView messageFirstName = findViewById(R.id.textViewFirstName);
        TextView messageLastName = findViewById(R.id.textViewLastName);
        TextView messageEmail = findViewById(R.id.textViewEmail);

        messageFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        messageLastName.setText("Last Name: " + editTextLastName.getText().toString());
        messageEmail.setText("Email: " + editTextEmail.getText().toString());
    }
}