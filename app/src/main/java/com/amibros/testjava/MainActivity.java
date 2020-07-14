package com.amibros.testjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Variables
    Animation topAnim,bottomAnim;
    ImageView splashLogo;
    TextView splashText;
    private static int SPLASH_SCREEN_DURATION=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_down);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_up);

        //Hooks
        splashLogo=findViewById(R.id.splash_image);
        splashText=findViewById(R.id.splashName);

        splashLogo.setAnimation(topAnim);
        splashText.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DURATION);

    }
}