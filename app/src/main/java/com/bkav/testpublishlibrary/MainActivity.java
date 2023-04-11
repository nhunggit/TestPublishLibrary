package com.bkav.testpublishlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bkav.librarytest.ModuleTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ModuleTest.test();
    }
}