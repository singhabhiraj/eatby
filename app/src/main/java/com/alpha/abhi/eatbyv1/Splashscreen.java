package com.alpha.abhi.eatbyv1;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.alpha.abhi.eatbyv1.R;

public class Splashscreen extends MapsActivity {
    ImageView eb1;
    private Animation Animation_1;
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        final ImageView eb1 = (ImageView) findViewById(R.id.eb1);
        Animation_1 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        eb1.startAnimation(Animation_1);
        Animation_1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                eb1.startAnimation(Animation_1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(Splashscreen.this,MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }}