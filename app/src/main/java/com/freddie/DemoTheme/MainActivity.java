package com.freddie.DemoTheme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int mTheme = R.style.DarkTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(mTheme);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTheme = mTheme == R.style.DarkTheme ? R.style.LightTheme : R.style.DarkTheme;
                setTheme(mTheme);
                recreate();
            }
        });

    }
}
