package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    // spinner  // textView

    Spinner sp;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.fruit_items);
        tv = findViewById(R.id.fruit_txt);
    }


    public void choose(View view){

        tv.setText(sp.getSelectedItem().toString());
    }

    public void order(View view){
        // we are going to go to the next activity!
        Intent intent =new Intent(this,Activity2.class);
        intent.putExtra("fruit", tv.getText().toString());
        startActivity(intent);
    }

    // this is final call you receive before you destroy your activity
    protected void onDestroy(){

        super.onDestroy();
        Log.d("Main activity", "onDestroy: 1");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Main activity", "onPause: 1");

    }

    protected void onStart(){
        super.onStart();
        Log.d("Main activity", "onStart: 1");

    }

    protected void onStop(){

        super.onStop();
        Log.d("Main Activity", "onStop: 1");
    }

    protected void onRestart(){
        super.onRestart();

        Log.d("Main Activity", "onRestart: 1");
    }

    protected void onResume(){
        super.onResume();

        Log.d("Main Activity", "onResume:1 ");
    }



}
