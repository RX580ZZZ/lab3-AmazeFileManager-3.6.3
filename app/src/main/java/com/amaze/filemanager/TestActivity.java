package com.amaze.filemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void onClick(View v){
        if (v.getId() == (R.id.button3) ) {
            Intent intent = new Intent(this, com.amaze.filemanager.ui.activities.AboutActivity.class);
            startActivity(intent);
        }
    }
}