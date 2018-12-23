package com.example.nono.humeur.controller.controller.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


import com.example.nono.humeur.R;
import com.example.nono.humeur.controller.adapter.PageAdapter;
import com.example.nono.humeur.controller.controller.fragment.fragments.View1Fragment;
import com.example.nono.humeur.controller.controller.fragment.fragments.View5Fragment;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

 //   ImageButton view1Fragment = (ImageButton) findViewById(R.id.View1);

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**

        view1Fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_commentary, null);
                EditText mCommentary = mView.findViewById(R.id.edit_commentary);
                mBuilder.setView(mView).setNegativeButton("Later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });   */

        this.configureViewPager();
    }

    private void configureViewPager() {
        ViewPager pager = (ViewPager) findViewById(R.id.activity_main_viewpager);
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()));

    }


}



