package com.puki.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {
    TextView ivLogo, ivSubtitle, ivLogo1;
    Button ivBtn;
    Animation smalltobig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        smalltobig= AnimationUtils.loadAnimation(this,R.anim.smalltobig);

        ivLogo = (TextView) findViewById(R.id.ivLogo);
        ivLogo1= (TextView) findViewById(R.id.ivLogo1);
        ivSubtitle = (TextView) findViewById(R.id.ivSubtitle);
        ivBtn = (Button) findViewById(R.id.ivBtn);

        ivLogo.setTranslationX(400);
        ivLogo1.setTranslationX(400);
        ivSubtitle.setTranslationX(400);
        ivBtn.setTranslationX(400);

        ivLogo.setAlpha(0);
        ivLogo1.setAlpha(0);
        ivSubtitle.setAlpha(0);
        ivBtn.setAlpha(0);

        ivLogo.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        ivLogo1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        ivSubtitle.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        ivBtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();

        ivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(SplashAct.this,SignIn.class);
                startActivity(a);
            }
        });
    }
}