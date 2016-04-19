package com.zdeve.zid.ahmad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {
    Button Mespha,Adeaa;
    ImageButton Favorite,Setting;
    Intent intent=new Intent();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mespha=(Button)findViewById(R.id.Mespha);
        Adeaa=(Button)findViewById(R.id.Adeaa);
        Favorite=(ImageButton)findViewById(R.id.favorite);
        Setting=(ImageButton)findViewById(R.id.setting);

        Mespha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                intent=new Intent("com.zdeve.zid.ahmad.mesbha");
                startActivity(intent);
            }
        });
        Adeaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(context,Adeaa.class);
            }
        });
        Favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent=new Intent(context,Favorite.class);
            }
        });
        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(context,Setting.class);
            }
        });
    }
}
