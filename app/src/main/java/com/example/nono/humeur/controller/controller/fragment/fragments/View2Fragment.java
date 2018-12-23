package com.example.nono.humeur.controller.controller.fragment.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
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
public class View2Fragment extends Fragment {


    Date currentTime = Calendar.getInstance().getTime();

    public static View2Fragment newInstance() {
        return (new View2Fragment());
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view2, container, false);
                ImageButton view2   ;
        view2 = view.findViewById(R.id.View2);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(View2Fragment.this.getActivity());
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
