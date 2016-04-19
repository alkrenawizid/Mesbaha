 package com.zdeve.zid.ahmad;

 import android.app.ActionBar;
 import android.content.Context;
 import android.graphics.Color;
 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.view.View;
 import android.widget.Button;
 import android.widget.ProgressBar;
 import android.widget.TextView;
 import android.widget.Toast;

 public class mesbha extends AppCompatActivity {
        ActionBar actionBar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mesbha);


        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnReset = (Button) findViewById(R.id.btnReset);
        final TextView lblResult = (TextView) findViewById(R.id.lblResult);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(lblResult.getText().toString());
                val++;
                lblResult.setText("" + val);
                if ( val != 0 && val > 99){
                    lblResult.setTextColor(Color.RED);

                    Context context = getApplicationContext();
                    CharSequence text = "Great!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = 0;
                lblResult.setText("" + val);
                lblResult.setTextColor(Color.BLACK);
            }
        });
        }
    }