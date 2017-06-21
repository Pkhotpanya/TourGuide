package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pkhotpanya on 6/20/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    private String tabTitles[] = new String[] { "Shows", "Food", "Places", "Events" };

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionFragment();
            case 1:
                return new RestaurantFragment();
            case 2:
                return new PlacesFragment();
            default:
                return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
