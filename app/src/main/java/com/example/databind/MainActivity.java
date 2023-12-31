package com.example.databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.widget.EditText;

import com.example.databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
       activityMainBinding.setViewModel(new MainViewModel());


    }
}