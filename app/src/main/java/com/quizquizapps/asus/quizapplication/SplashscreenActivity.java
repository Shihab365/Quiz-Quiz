package com.quizquizapps.asus.quizapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashscreenActivity extends AwesomeSplash {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
    }*/

    @Override
    public void initSplash(ConfigSplash configSplash) {
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //configSplash.setBackgroundColor(R.color.spback);
        //configSplash.setAnimCircularRevealDuration(3000);
        //configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);
        //configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);

        configSplash.setLogoSplash(R.drawable.animsplash);
        configSplash.setAnimLogoSplashDuration(5000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Pulse);

        //configSplash.setTitleSplash(getString(R.string.titletext));
        //configSplash.setTitleTextColor(R.color.titleback);
        //configSplash.setTitleTextSize(50f);
        //configSplash.setAnimTitleDuration(3000);
        //configSplash.setAnimTitleTechnique(Techniques.FlipInX);
    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(SplashscreenActivity.this,MainActivity.class));
    }
}
