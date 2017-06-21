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
        items.add(new Item(R.drawable.balboa_park, getString(R.string.balboa_park), "",getString(R.string.hours_24), getString(R.string.balboa_numbers)));
        items.add(new Item(R.drawable.sea_world, getString(R.string.seaworld), "", getString(R.string.seaworld_hours), getString(R.string.seaworld_number)));
        items.add(new Item(R.drawable.san_diego_zoo, getString(R.string.zoo), getString(R.string.zoo_dr), getString(R.string.zoo_hours), getString(R.string.zoo_number)));
        items.add(new Item(R.drawable.la_jolla_cove, getString(R.string.la_jolla_cove), "", "", ""));
        items.add(new Item(R.drawable.seaport_village, getString(R.string.seaport_village), getString(R.string.harbor_dr), getString(R.string.seaport_hours), getString(R.string.seaport_number)));
        items.add(new Item(R.drawable.old_town, getString(R.string.old_town), getString(R.string.wallace_st), getString(R.string.old_town_hours), getString(R.string.old_town_numbers)));
        items.add(new Item(R.drawable.belmont_park, getString(R.string.belmont_park), "", getString(R.string.belmont_hours), getString(R.string.belmont_number)));
        items.add(new Item(R.drawable.birch_aquarium, getString(R.string.birch_aquarium), getString(R.string.expedition_way), getString(R.string.birch_hours), getString(R.string.birch_number)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
