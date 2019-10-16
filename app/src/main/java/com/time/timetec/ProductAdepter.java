package com.time.timetec;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ProductAdepter extends FragmentPagerAdapter {
    int totalTab;
    public ProductAdepter(@NonNull FragmentManager fm,int totalTab) {
        super(fm);
        this.totalTab = totalTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                MobileFragment mobileFragment = new MobileFragment();
                return  mobileFragment;
            case 1:
                ComputerFragment computerFragment = new ComputerFragment();
                return computerFragment;
            case 2:
                TvFragment tvFragment = new TvFragment();
                return  tvFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTab;
    }
}
