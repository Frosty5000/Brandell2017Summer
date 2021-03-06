package com.example.brandellpetty.brandell2017summer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.Pair;

import java.util.ArrayList;


/**
 * Created by brandellpetty on 6/19/17.
 */

public class ViewFragmentStateAdapter extends FragmentStatePagerAdapter {

    private final ArrayList<Pair<String, Fragment>> list;

    public ViewFragmentStateAdapter(FragmentManager fm, ArrayList<Pair<String, Fragment>> list ){
        super(fm);
        this.list = list;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return list.get(position).first;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position).second;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
