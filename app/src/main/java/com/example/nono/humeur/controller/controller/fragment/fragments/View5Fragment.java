package com.example.nono.humeur.controller.controller.fragment.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.nono.humeur.R;

import java.util.Calendar;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class View5Fragment extends Fragment {

    ImageButton HistoryButton;
    ImageButton CommentaryButton;
    private EditText mCommentary;
    private SharedPreferences mPreferences;
    public static final String PREF_KEY_COMMENTARY = "PREF_KEY_COMMENTARY";

    Date currentTime = Calendar.getInstance().getTime();


    public static View5Fragment newInstance() {
        return (new View5Fragment());
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view5, container, false);
    }

    private void addListenerOnButton() {

        HistoryButton = (ImageButton) HistoryButton.findViewById(R.id.HistoryButton);

        HistoryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        CommentaryButton = (ImageButton) CommentaryButton.findViewById(R.id.CommentaryButton);

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
}
