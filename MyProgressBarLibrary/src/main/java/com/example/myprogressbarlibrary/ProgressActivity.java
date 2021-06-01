package com.example.myprogressbarlibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {
    ProgressBar mProgressSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        mProgressSpin= findViewById(R.id.ProgressBar01);

        mProgressSpin.getIndeterminateDrawable()
                .setColorFilter(ContextCompat.getColor(this, R.color.Tomato), PorterDuff.Mode.SRC_IN );
    }
    }