package com.example.delhitourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TourItemAdapter extends ArrayAdapter<ItemList> {

    TourItemAdapter(Activity context, ArrayList<ItemList> itemLists){
        super(context, 0, itemLists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_viewer, parent, false);
        }

        ItemList currentItemPosition = getItem(position);

        TextView itemTV = listItemView.findViewById(R.id.list_item_text_view);
        assert currentItemPosition != null;
        itemTV.setText(currentItemPosition.getItemName());

        TextView addressTV = listItemView.findViewById(R.id.list_item_address_view);
        addressTV.setText(currentItemPosition.getItemAddress());

        ImageView imageView = listItemView.findViewById(R.id.list_item_image_view);
        if (currentItemPosition.hasImage()) {
            imageView.setImageResource(currentItemPosition.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
