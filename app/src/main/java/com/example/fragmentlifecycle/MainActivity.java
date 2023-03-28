package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Message", "First Activity");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message", " First Activity onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message"," First Activity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Message"," First Activity onPause");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Message"," First Activity onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message"," First Activity onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message"," First Activity onDestroy");
    }
}