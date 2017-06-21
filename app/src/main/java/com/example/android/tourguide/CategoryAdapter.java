package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pkhotpanya on 6/20/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    Context mContext;

    private String tabTitles[];
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
        tabTitles = new String[]{
                mContext.getString(R.string.shows),
                mContext.getString(R.string.food),
                mContext.getString(R.string.places),
                mContext.getString(R.string.events)};
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
