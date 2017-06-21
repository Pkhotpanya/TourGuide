package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
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

    private final Context mContext;

    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
        mContext = context;
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

        Item currentItem = (Item) getItem(position);

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
        if (currentItem.hasAddress()){
            addressTextView.setText(currentItem.getAdress());
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_view.xml layout with the ID version_name
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.textview_hours);
        if (currentItem.hasHours()){
            hoursTextView.setText(currentItem.getHours());
            hoursTextView.setVisibility(View.VISIBLE);
        } else {
            hoursTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_view.xml layout with the ID version_number
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.textview_phone_number);
        if (currentItem.hasPhoneNumber()){
            phoneTextView.setText(currentItem.getPhoneNumber());
            phoneTextView.setVisibility(View.VISIBLE);
        } else {
            phoneTextView.setVisibility(View.GONE);
        }

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

}
