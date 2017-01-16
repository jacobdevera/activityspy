package edu.washington.gjdevera.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String savedStateString = (savedInstanceState == null) ? "no saved state" : savedInstanceState.toString();
        Log.i(TAG, "onCreate event fired; savedInstanceState: " + savedStateString);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        Log.i(TAG, "onStart event fired");
        super.onStart();
    }

    protected void onRestart() {
        Log.i(TAG, "onRestart event fired");
        super.onRestart();
    }

    protected void onResume() {
        Log.i(TAG, "onResume event fired");
        super.onResume();
    }

    protected void onPause() {
        Log.i(TAG, "onPause event fired");
        super.onPause();
    }

    protected void onStop() {
        Log.i(TAG, "onStop event fired");
        super.onStop();
    }

    protected void onDestroy() {
        Log.e(TAG, "We're going down, Captain!");
        super.onDestroy();
    }
}
