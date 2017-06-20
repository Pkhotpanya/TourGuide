package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pkhotpanya on 6/20/17.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Activity context, ArrayList<Item> items) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list_item, parent, false);
        }

        Item currentItem = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageview_visual);

        // Check if an image is provided for this word or not
        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentItem.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_view.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textview_name);
        nameTextView.setText(currentItem.getName());

        // Find the TextView in the list_view.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.textview_address);
        addressTextView.setText(currentItem.getAdress());

        // Find the TextView in the list_view.xml layout with the ID version_name
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.textview_hours);
        hoursTextView.setText(currentItem.getHours());

        // Find the TextView in the list_view.xml layout with the ID version_number
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.textview_phone_number);
        phoneTextView.setText(currentItem.getAdress());

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

}
