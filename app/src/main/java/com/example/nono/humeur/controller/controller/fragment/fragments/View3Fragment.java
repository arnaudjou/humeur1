package com.example.nono.humeur.controller.controller.fragment.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nono.humeur.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class View3Fragment extends Fragment {


    public static View3Fragment newInstance () {
        return (new View3Fragment());
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view3, container, false);
    }

}
