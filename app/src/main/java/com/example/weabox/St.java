package com.example.weabox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class St extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);
        getSupportActionBar().hide();
        //new Handler().postDelayed(new Runnable() {
        //    @Override
         //   public void run() {
         //       startActivity(new Intent(St.this, MainActivity.class));
          //      finish();
          //  }
        //}, 3000);
    }

    public void start_btn(View view) {
        startActivity(new Intent(St.this, MainActivity.class));
        finish();
    }
}
