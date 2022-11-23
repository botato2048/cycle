package com.example.cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Appel de On Create", Toast.LENGTH_LONG ) .show();

    }

    public MainActivity() {
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(getApplicationContext(),"Appel de On post resume", Toast.LENGTH_LONG ) .show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Appel de On stop", Toast.LENGTH_LONG ) .show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Appel de On destroy", Toast.LENGTH_LONG ) .show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Appel de On pause", Toast.LENGTH_LONG ) .show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Appel de On resume", Toast.LENGTH_LONG ) .show();

    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"Appel de On start", Toast.LENGTH_LONG ) .show();

    }
}