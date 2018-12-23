package com.example.nono.humeur.controller.controller.fragment.fragments;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.sip.SipAudioCall;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.nono.humeur.R;

import java.util.Calendar;
import java.util.Date;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * A simple {@link Fragment} subclass.
 */
public class View5Fragment extends Fragment {

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
        final View view = inflater.inflate(R.layout.fragment_view5, container, false);

        ImageButton view5;
        view5 = view.findViewById(R.id.View5);
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(View5Fragment.this.getActivity());
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
        });



        return view;

    }
}








