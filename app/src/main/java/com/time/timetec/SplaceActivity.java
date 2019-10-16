package com.time.timetec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SplaceActivity extends AppCompatActivity {

    private ProgressBar mprogressBar;
    private boolean InternetCheck = true;
    private static int Splash_time_out = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace);

        mprogressBar = findViewById(R.id.progressBar);
        postDelayMethod();
    }

    private void postDelayMethod() {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final boolean InternetResult = checkConnection();
                if (InternetResult) {

                    Intent intent = new Intent(SplaceActivity.this, LoginActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_from_left_out);
                    finish();


                } else {

                    mprogressBar.setProgress(View.VISIBLE);
                    mprogressBar.setProgress(View.GONE);

                    Toast.makeText(SplaceActivity.this, "Please check Internet connection!", Toast.LENGTH_SHORT).show();

                }

            }
        }, Splash_time_out);
    }
    protected boolean isOnline(){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info!=null && info.isConnectedOrConnecting()){
            return true;

        }else {
            return false;
        }
    }
    public boolean checkConnection(){
        if (isOnline()){

            return InternetCheck;
        }else {

            InternetCheck = false;
            return InternetCheck;
        }
    }
}
