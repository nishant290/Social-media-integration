package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {


    TextView designed,name,name1;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        logo=findViewById(R.id.logo);
        designed=findViewById(R.id.designed);
        name=findViewById(R.id.name);
        name1=findViewById(R.id.app_name);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 5500);
    }

    private void startEnterAnimation() {
        name1.startAnimation(AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.bottom));
        logo.startAnimation(AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.p_in));
        logo.setVisibility(View.VISIBLE);
        designed.setVisibility(View.VISIBLE);
        name.setVisibility(View.VISIBLE);
        name1.setVisibility(View.VISIBLE);
    }
}