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
        items.add(new Item(R.drawable.book_of_mormon, getString(R.string.the_book_of_mormon), getString(R.string.san_diego_civic_theater), getString(R.string.july_25_30_2017), getString(R.string.mormon_phonenumber)));
        items.add(new Item(R.drawable.les_miserables, getString(R.string.les_miserables), getString(R.string.san_diego_civic_theater), getString(R.string.miserables_dates), getString(R.string.miserables_phonenumber)));
        items.add(new Item(R.drawable.wwe_smackdown, getString(R.string.wwe_smackdown_live), getString(R.string.valley_view_casino_center), getString(R.string.wwe_dates), getString(R.string.wwe_number)));
        items.add(new Item(R.drawable.the_game, getString(R.string.the_game), getString(R.string.the_observatory_north_park), getString(R.string.the_game_date), getString(R.string.the_game_number)));
        items.add(new Item(R.drawable.linkin_park, getString(R.string.linkin_park_mgk), getString(R.string.mattress_firm_amphitheater), getString(R.string.linkin_park_date), getString(R.string.linkin_park_number)));
        items.add(new Item(R.drawable.idena_menzel, getString(R.string.idena_menzel), getString(R.string.pechanga), getString(R.string.menzel_date), getString(R.string.menzel_number)));
        items.add(new Item(R.drawable.padres_petco_park, getString(R.string.tigers_at_padres), getString(R.string.petco_park), getString(R.string.tigers_date), getString(R.string.tigers_game_website)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
