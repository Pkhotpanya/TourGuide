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

public class PlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.layout_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.balboa_park, "Balboa Park", "","24 Hours", "(619) 239-0512"));
        items.add(new Item(R.drawable.sea_world, "SeaWorld", "", "10am to 10pm", "(619) 222-4732"));
        items.add(new Item(R.drawable.san_diego_zoo, "Zoo", "Zoo Dr", "9am to 8pm", "619-231-1515"));
        items.add(new Item(R.drawable.la_jolla_cove, "La Jolla Cove", "", "", ""));
        items.add(new Item(R.drawable.seaport_village, "Seaport Village", "Harbor Dr", "10am to 10pm", "(619) 235-4014"));
        items.add(new Item(R.drawable.old_town, "Old Town", "Wallace St", "10am to 4pm", "(619) 220-5422"));
        items.add(new Item(R.drawable.belmont_park, "Belmont Park", "", "11am to 11pm", "(858) 488-1549"));
        items.add(new Item(R.drawable.birch_aquarium, "Birch Aquarium", "Expedition Way", "9am to 5pm", "(858) 534-3474"));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
