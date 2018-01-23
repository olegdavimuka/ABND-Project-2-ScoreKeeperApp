package com.example.android.scorekeeper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{
            "Football", "Basketball", "Volleyball", "Hockey", "Sport News"};

    PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FootballFragment();
        } else if (position == 1) {
            return new BasketballFragment();
        } else if (position == 2) {
            return new VolleyballFragment();
        } else if (position == 3) {
            return new HockeyFragment();
        } else {
            return new NewsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
