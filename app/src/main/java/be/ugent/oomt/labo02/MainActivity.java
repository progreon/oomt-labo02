package be.ugent.oomt.labo02;

import android.support.v4.app.FragmentManager;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Lifecycle", "MainActivity.onCreate()");
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            DetailFragment details = new DetailFragment();
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().add(R.id.container, details).commit();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "MainActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "MainActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "MainActivity.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "MainActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "MainActivity.onDestroy()");
    }
}
