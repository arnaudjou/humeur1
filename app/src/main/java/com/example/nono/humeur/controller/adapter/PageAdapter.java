package com.example.nono.humeur.controller.adapter;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.nono.humeur.controller.controller.fragment.fragments.View1Fragment;
import com.example.nono.humeur.controller.controller.fragment.fragments.View2Fragment;
import com.example.nono.humeur.controller.controller.fragment.fragments.View3Fragment;
import com.example.nono.humeur.controller.controller.fragment.fragments.View4Fragment;
import com.example.nono.humeur.controller.controller.fragment.fragments.View5Fragment;


public class PageAdapter extends FragmentPagerAdapter {


    public PageAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return (5);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return View1Fragment.newInstance();
            case 1:
                return View2Fragment.newInstance();
            case 2:
                return View3Fragment.newInstance();
            case 3:
                return View4Fragment.newInstance();
            case 4:
                return View5Fragment.newInstance();
            default:
                return null;
        }
    }


}

