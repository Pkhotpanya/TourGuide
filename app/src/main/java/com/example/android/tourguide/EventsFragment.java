package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.layout_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.balboa_after_dark, getString(R.string.balboa_after_dark), getString(R.string.fleet_science_center), getString(R.string.after_dark_date), getString(R.string.fleet_number)));
        items.add(new Item(R.drawable.tron_dance_party, getString(R.string.tron_dance_party), getString(R.string.blonde_bar), getString(R.string.tron_date), getString(R.string.blonde_number)));
        items.add(new Item(R.drawable.san_diego_pride_weekend, getString(R.string.san_diego_pride_weekend), getString(R.string.hillcrest), getString(R.string.pride_date), ""));
        items.add(new Item(R.drawable.taste_of, getString(R.string.taste_of), getString(R.string.liberty_station), getString(R.string.taste_date), ""));
        items.add(new Item(R.drawable.berry_good_night, getString(R.string.berry_good_night), getString(R.string.la_jolla_oceanview), getString(R.string.berry_date), getString(R.string.berry_email)));
        items.add(new Item(R.drawable.san_diego_county_fair, getString(R.string.san_diego_county_fair), getString(R.string.del_mar), getString(R.string.fair_date), getString(R.string.fair_number)));
        items.add(new Item(R.drawable.music_in_the_gardens, getString(R.string.music_in_the_gardens), getString(R.string.escondido), getString(R.string.music_garden_date), ""));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
