package com.example.nono.humeur.controller.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nono.humeur.R;

import java.util.Calendar;
import java.util.Date;

public class Commentary extends AppCompatActivity {

    public Commentary() {
        d = new Date();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentary);
    }

    Date d;

    /**
//premier jours de la semaine
    d.setDate(d.getDate() - d.getDay()); //si c'est le 2eme jours soit mardi 2-2 = 0 on tombe sur dimanche
//dernier jours de la semaine :
    d.setDate(d.getDate() + 6 - d.getDay()); /
     */
}

