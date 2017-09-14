package com.pakaking.sojun_0914;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by tlstk on 2017-09-14.
 */

public class NextActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latout_next);
        Intent intent = getIntent();
        String str = intent.getStringExtra("New");
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
