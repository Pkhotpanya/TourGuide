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

import butterknife.BindView;
import butterknife.ButterKnife;

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
        ViewHolder holder;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list_item, parent, false);
            holder = new ViewHolder(listItemView);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Item currentItem = (Item) getItem(position);

        // Check if an image is provided for this word or not
        if (currentItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.image.setImageResource(currentItem.getImageResourceId());
            // Make sure the view is visible
            holder.image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.image.setVisibility(View.GONE);
        }

        // Find the TextView in the list_view.xml layout with the ID version_name
        holder.name.setText(currentItem.getName());

        // Find the TextView in the list_view.xml layout with the ID version_number
        if (currentItem.hasAddress()){
            holder.address.setText(currentItem.getAdress());
            holder.address.setVisibility(View.VISIBLE);
        } else {
            holder.address.setVisibility(View.GONE);
        }

        // Find the TextView in the list_view.xml layout with the ID version_name
        if (currentItem.hasHours()){
            holder.hours.setText(currentItem.getHours());
            holder.hours.setVisibility(View.VISIBLE);
        } else {
            holder.hours.setVisibility(View.GONE);
        }

        // Find the TextView in the list_view.xml layout with the ID version_number
        if (currentItem.hasPhoneNumber()){
            holder.phoneNumber.setText(currentItem.getPhoneNumber());
            holder.phoneNumber.setVisibility(View.VISIBLE);
        } else {
            holder.phoneNumber.setVisibility(View.GONE);
        }

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

    // somewhere else in your class definition
    static class ViewHolder {
        @BindView(R.id.imageview_visual) ImageView image;
        @BindView(R.id.textview_name) TextView name;
        @BindView(R.id.textview_address) TextView address;
        @BindView(R.id.textview_hours) TextView hours;
        @BindView(R.id.textview_phone_number) TextView phoneNumber;

        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }
    }

}
