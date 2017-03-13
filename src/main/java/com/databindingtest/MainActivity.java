package com.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         final ActivityMainBinding  activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.text.setText("this is data binding test");
    }
}
