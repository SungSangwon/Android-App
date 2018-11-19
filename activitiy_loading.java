package com.bist.sangwon.googlemapsandroidapiexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activitiy_loading  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_loading);

        startLoading();
    }

    //startactivity를 사용하여 처음 액티비티화면을 activitiy_loading으로 지정한뒤 2초뒤에 MainActivity로 Intent되게 지정해준다.
    
    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }

}
