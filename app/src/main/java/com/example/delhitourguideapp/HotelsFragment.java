package com.example.delhitourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HotelsFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view =  inflater.inflate(R.layout.list_view, container, false);

        // Created ArrayList of type ItemList to store data for place and address
        ArrayList<ItemList> placesDetails = new ArrayList<>();
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item1),getResources().getString(R.string.hotel_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item2),getResources().getString(R.string.hotel_address2)));
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item3),getResources().getString(R.string.hotel_address3)));
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item4),getResources().getString(R.string.hotel_address4)));
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item5),getResources().getString(R.string.hotel_address5)));
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item6),getResources().getString(R.string.hotel_address6)));
        placesDetails.add(new ItemList(getResources().getString(R.string.hotel_item7),getResources().getString(R.string.hotel_address7)));

//        placesDetails.add(new ItemList("The Leela Palace New Delhi","South Delhi, Delhi"));
//        placesDetails.add(new ItemList("Taj Palace","Chanakyapuri, Delhi"));
//        placesDetails.add(new ItemList("Hotel Arch","Mahipalpur, New Delhi"));
//        placesDetails.add(new ItemList("Lemon Tree Premier, Delhi Airport","Aerocity, New Delhi"));
//        placesDetails.add(new ItemList("Hotel Shanti Plaza","Paharganj, New Delhi"));
//        placesDetails.add(new ItemList("Red Carmine","Near Badarpur Border, Indrapuri, Delhi"));
//        placesDetails.add(new ItemList("Gour White House","Near Tara Apartments, Alaknanda Market, Delhi"));

        // Use custom adaptor to display data
        TourItemAdapter adapter = new TourItemAdapter(getActivity(), placesDetails);
        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        // Returns view object
        return root_view;
    }
}