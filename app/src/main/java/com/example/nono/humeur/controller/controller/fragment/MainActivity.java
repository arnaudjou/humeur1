package com.example.nono.humeur.controller.controller.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import com.example.nono.humeur.R;
import com.example.nono.humeur.controller.adapter.PageAdapter;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Date currentTime = Calendar.getInstance().getTime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.configureViewPager ();


    }


    private void configureViewPager (){
        ViewPager pager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        pager.setAdapter (new PageAdapter(getSupportFragmentManager()));

    }


}
