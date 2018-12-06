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
public class View2Fragment extends Fragment {

    public static View2Fragment newInstance () {
        return (new View2Fragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view2, container, false);
    }

}
