package com.example.guilherme.mynewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Log.i("HomeActivity", "On Create");


        textViewHelloWorld = findViewById(R.id.textViewHelloWorld);
        setAnotherHelloWorldText("Hello World 2!");
    }

    private void setAnotherHelloWorldText(String newHelloWorldText) {
        textViewHelloWorld.setText(newHelloWorldText);
    }

    @Override
    protected void onStart() {
        Log.i("HomeActivity", "On Start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("HomeActivity", "On Resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("HomeActivity", "On Pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("HomeActivity", "On Stop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("HomeActivity", "On Destroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.i("HomeActivity", "On Restart");
        super.onRestart();
    }
}
