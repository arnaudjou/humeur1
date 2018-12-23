package com.example.nono.humeur.controller.controller.fragment.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


import com.example.nono.humeur.R;

import java.util.Calendar;

import static android.widget.Toast.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class View1Fragment extends Fragment {

    public View1Fragment() {
    }


    public static View1Fragment newInstance() {
        return (new View1Fragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view1, container, false);
    }
}


//    mHappy = getContext().getSharedPreferences(PREF_DATE, Context.MODE_PRIVATE);
        // Inflate the layout for this fragment

     /**

        View view = inflater.inflate(R.layout.fragment_view1, container, false);

        ImageButton commentaryButton = view.findViewById(R.id.CommentaryButton);
        commentaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(View1Fragment.this.getActivity());
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

        ImageButton view1;
        view1 = view.findViewById(R.id.View1);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int cDay = c.get(Calendar.DAY_OF_WEEK);
                if (cDay >= Calendar.SUNDAY && cDay <= Calendar.SATURDAY) {
                    if (mHappy.getInt(PREF_DATE, 8) == 0){
                        mHappy.edit().putInt(PREF_DATE, cDay).apply();
                    Toast.makeText(getActivity(), "your mood is record",
                            LENGTH_SHORT).show();}
                            else {makeText(getActivity(), "your mood is not record",
                            LENGTH_SHORT).show();}

                } else {
                    makeText(getActivity(), "your mood is not record",
                            LENGTH_SHORT).show();
                }
            }
        });

        ImageButton historyButton;
        historyButton = view.findViewById(R.id.HistoryButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int defaultValue = 0;
                int day = mHappy.getInt(PREF_DATE, defaultValue);

                makeText(getActivity(), "ok", LENGTH_SHORT).show();
            }
        });
*/
