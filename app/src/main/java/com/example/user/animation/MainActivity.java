package com.example.user.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonTranslate;
    private Button mButtonAlpha;
    private Button mButtonScale;
    private Button mButtonRotate;
    private Button mButtonComplex;
    private Animation mAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        final Animation animRotate = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        mButtonTranslate = (Button) findViewById(R.id.translate);
        mButtonAlpha = (Button) findViewById(R.id.alpha);
        mButtonScale = (Button) findViewById(R.id.scale);
        mButtonRotate = (Button) findViewById(R.id.rotate);
        mButtonComplex = (Button) findViewById(R.id.complex);


        mButtonTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
            }
        });

        mButtonAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animAlpha);
            }
        });

        mButtonScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animScale);
            }
        });

        mButtonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animRotate);
            }
        });

        mButtonComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationSet mAnimationSet = new AnimationSet(false);
                mAnimationSet.addAnimation(animAlpha);
                mAnimationSet.addAnimation(animScale);
                mAnimationSet.addAnimation(animRotate);
                mAnimationSet.addAnimation(animTranslate);
                view.startAnimation(mAnimationSet);
            }
        });


    }
}
