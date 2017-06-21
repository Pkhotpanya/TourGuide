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

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /// Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.layout_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.gualbertos_taco_shop, getString(R.string.qualbertos_taco_shop), getString(R.string.imperial_ave),getString(R.string.gualbertos_hours), getString(R.string.gualbertos_number)));
        items.add(new Item(R.drawable.rolandos_taco_shop, getString(R.string.rolandos_taco_shop), getString(R.string.paradise_valley), getString(R.string.rolandos_hours), getString(R.string.rolandos_numbers)));
        items.add(new Item(R.drawable.eibertos_taco_shop, getString(R.string.eibertos_taco_shop), getString(R.string.meadowbrook_dr), getString(R.string.eibertos_hours), getString(R.string.eibertos_number)));
        items.add(new Item(R.drawable.dao_fu, getString(R.string.dao_fu), getString(R.string.adams_ave), "", getString(R.string.dao_fu_number)));
        items.add(new Item(R.drawable.caritas_snack_shack, getString(R.string.carnitas_snack_shack), getString(R.string.university_ave), getString(R.string.snack_shack_hours), getString(R.string.snack_shack_number)));
        items.add(new Item(R.drawable.sushi_ota, getString(R.string.sushi_ota), getString(R.string.mission_bay), "", getString(R.string.ota_number)));
        items.add(new Item(R.drawable.cucina_enoteca, getString(R.string.cucina_enoteca), getString(R.string.newport_center_dr), getString(R.string.cucina_hours), getString(R.string.cucina_number)));
        items.add(new Item(R.drawable.rockys_crown_pub, getString(R.string.rockys_crown_pub), getString(R.string.ingraham_st), getString(R.string.rockys_hours), getString(R.string.rockys_number)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
