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
        items.add(new Item(R.drawable.balboa_after_dark, "Balboa Park After Dark", "The Fleet Science Center", "Friday, Jun 23, 2017 6:00 pm to 8:00 pm", "(619) 238-1233"));
        items.add(new Item(R.drawable.tron_dance_party, "Tron Dance Party", "Blonde Bar", "Friday, June 30, 9 p.m", "blondebarsd@gmail.com"));
        items.add(new Item(R.drawable.san_diego_pride_weekend, "San Diego Pride Weekend", "Hillcrest", "July 15-16th", ""));
        items.add(new Item(R.drawable.taste_of, "Taste of", "Liberty Station", "June 21, 5-9 p.m", ""));
        items.add(new Item(R.drawable.berry_good_night, "Berry Good Night", "La Jolla oceanview estate", "July 15", "info@berrygoodfood.org"));
        items.add(new Item(R.drawable.san_diego_county_fair, "San Diego County Fair", "Del Mar", "June 2 - July 4", "(858)755-1161"));
        items.add(new Item(R.drawable.music_in_the_gardens, "Music in the Gardens", "Escondido", "June 22", ""));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
