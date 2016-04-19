package com.zdeve.zid.ahmad;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Adeaa extends AppCompatActivity {
 TextView Aldoaa;
boolean firstRun;
     SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adeaa);
        Aldoaa=(TextView)findViewById(R.id.Aldoaa);


    }

    @Override
    protected void onResume() {
        super.onResume();
       // sharedPreferences=getSharedPreferences("Athkaar",MODE_PRIVATE);
       // if (!sharedPreferences.contains("firstRun");
        {


        }
    }
}
