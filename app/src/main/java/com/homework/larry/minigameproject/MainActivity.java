package com.homework.larry.minigameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        GamePanel d = new GamePanel(this);
        setContentView(d);

//        setContentView(R.layout.activity_main);
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Looptest", "huy thread");
    }
}