package com.example.nono.humeur.controller.controller.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nono.humeur.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class View1Fragment extends Fragment {


    public static View1Fragment newInstance () {
        return (new View1Fragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view1, container, false);
    }

}
