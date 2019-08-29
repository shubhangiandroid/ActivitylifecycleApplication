package com.spp.activitylifecycleapplication;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String tag = "LifeCycleEvents ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "In the onStart() event");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume() event");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop() event");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");

    }

    public void ClickOnopenlifecycle(View view) {
        Intent Intent = new Intent(this,Activity2.class);
        startActivity(Intent);

    }
}
