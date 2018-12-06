package com.example.nono.humeur.controller.controller.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;


import com.example.nono.humeur.R;
import com.example.nono.humeur.controller.adapter.PageAdapter;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ImageButton HistoryButton;
    ImageButton CommentaryButton;
    private EditText mCommentary;
    private SharedPreferences mPreferences;
    public static final String PREF_KEY_COMMENTARY = "PREF_KEY_COMMENTARY";

    Date currentTime = Calendar.getInstance().getTime();

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

        String commentary = mCommentary.getText().toString();

                /** try to edit commentary in bundle with date
                 * Need a "if" with existant commentary


        mPreferences.edit().putInt(PREF_KEY_COMMENTARY, int currentTime);
                 */
            }
        });
    }


    private void configureViewPager (){
        ViewPager pager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        pager.setAdapter (new PageAdapter(getSupportFragmentManager()));

    }


}
