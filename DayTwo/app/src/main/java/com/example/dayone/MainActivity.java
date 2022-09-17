package com.example.dayone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.dayone.databinding.ActivityMainBinding;
import com.example.dayone.models.Talabat;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Drawable img=getResources().getDrawable(R.drawable.cr7);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setTalabat(new Talabat("TEST DATA BINDING","Hell",img));
        binding.GS.setText("aaa");





    }
}