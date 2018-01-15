package com.example.android.scorekeeper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {
            "Football", "Basketball", "Volleyball", "Hockey" };

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
        } else {
            return new HockeyFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
