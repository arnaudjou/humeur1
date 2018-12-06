package com.example.nono.humeur.controller.controller.fragment;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


import com.example.nono.humeur.R;
import com.example.nono.humeur.controller.adapter.PageAdapter;

public class MainActivity extends AppCompatActivity {

    ImageButton HistoryButton;
    ImageButton CommentaryButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.configureViewPager ();

        addListenerOnButton();

    }

    private void addListenerOnButton() {

        HistoryButton = (ImageButton) findViewById(R.id.HistoryButton);

        HistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        CommentaryButton = (ImageButton) findViewById(R.id.CommentaryButton);

        CommentaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    private void configureViewPager (){
        ViewPager pager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        pager.setAdapter (new PageAdapter(getSupportFragmentManager()));

    }


}
