package com.infocorreia.guides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

    ImageButton compras = (ImageButton) findViewById(R.id.imageButton5);
        compras.setOnClickListener(new OnClickListener(){
        public void onClick(View view){
    startActivity(new Intent(getApplicationContext(),Compras.class));
                }
            });

    ImageButton dormir = (ImageButton) findViewById(R.id.imageButton6);
    dormir.setOnClickListener(new OnClickListener(){
        public void onClick(View view){
            startActivity(new Intent(getApplicationContext(),Dormir.class));
        }
    });


    }
    }


