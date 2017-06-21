package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.layout_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.book_of_mormon, "The Book of Mormon", "San Diego Civic Theater", "July 25-30, 2017", "(619) 564-3000"));
        items.add(new Item(R.drawable.les_miserables, "Les Miserables", "San Diego Civic Theater", "May 29 – June 3, 2018", "619) 564-3000"));
        items.add(new Item(R.drawable.wwe_smackdown, "WWE Smackdown Live", "Valley View Casino Center", "June 27, 2017", "(619) 224-417"));
        items.add(new Item(R.drawable.the_game, "The Game", "The Observatory North Park", "Jun 23, 2017", "(619) 239-8836"));
        items.add(new Item(R.drawable.linkin_park, "Linkin Park and Machine Gun Kelly", "Mattress Firm Amphitheater", "Friday, October 20, 7:30 p.m", "619-671-3600"));
        items.add(new Item(R.drawable.idena_menzel, "Idena Menzel", "Pechanga Resort and Casino", "Friday, September 1, 8 p.m", "951-693-1819"));
        items.add(new Item(R.drawable.padres_petco_park, "Tigers at Padres", "Petco Park", "June 23", "tickets.com"));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
