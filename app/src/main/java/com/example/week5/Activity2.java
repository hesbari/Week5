package com.example.week5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView textView = findViewById(R.id.order);

        Intent intent = getIntent(); // I recieve the intent I created on previous page
        String fruit = intent.getExtras().getString("fruit");

        textView.setText("you ordered \n"+fruit);

    }


    // this is final call you receive before you destroy your activity
    protected void onDestroy(){

        super.onDestroy();
        Log.d("Main activity2", "onDestroy: 2");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Main activity2", "onPause: 2");

    }

    protected void onStart(){
        super.onStart();
        Log.d("Main activity2", "onStart: 2");

    }

    protected void onStop(){

        super.onStop();
        Log.d("Main Activity2", "onStop: 2");
    }

    protected void onRestart(){
        super.onRestart();

        Log.d("Main Activity2", "onRestart: 2");
    }

    protected void onResume(){
        super.onResume();

        Log.d("Main Activity2", "onResume:2 ");
    }

}
