package com.example.animation_bt;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();


        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

    }
}