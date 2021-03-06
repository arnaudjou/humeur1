package com.example.nono.humeur.controller.controller.fragment.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;


import com.example.nono.humeur.R;
import com.example.nono.humeur.controller.controller.fragment.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class View1Fragment extends Fragment {

    private ImageButton buttonH;
    private ImageButton historyButton;

    public View1Fragment() {
    }


    public static View1Fragment newInstance() {
        return (new View1Fragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
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
        return view;
    }
}
