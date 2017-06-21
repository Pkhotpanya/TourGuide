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
        items.add(new Item(R.drawable.gualbertos_taco_shop, "Gualberto's Taco Shop", "Imperial Ave","9:30am to 11pm", "(619) 264-4056"));
        items.add(new Item(R.drawable.rolandos_taco_shop, "Rolando's Taco Shop", "Paradise Valley", "8am to 10pm", "(619) 479-3624"));
        items.add(new Item(R.drawable.eibertos_taco_shop, "Eiberto's Taco Shop", "Meadowbrook Dr", "9am to 10pm", "(619) 399-5018"));
        items.add(new Item(R.drawable.dao_fu, "Dao Fu", "Adams Ave", "", "(619) 281-6888"));
        items.add(new Item(R.drawable.caritas_snack_shack, "Carnitas Snack Shack", "University Ave", "11am to 11pm", "(619) 294-7675"));
        items.add(new Item(R.drawable.sushi_ota, "Sushi Ota", "Mission Bay", "", "(858) 270-5670"));
        items.add(new Item(R.drawable.cucina_enoteca, "Cucina Enoteca", "Newport Center Dr", "11am to 10pm", "(949) 706-1416"));
        items.add(new Item(R.drawable.rockys_crown_pub, "Rocky's Crown Pub", "Ingraham St", "11am to 12am", "(858) 273-9140"));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
