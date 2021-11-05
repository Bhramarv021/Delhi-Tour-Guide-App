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
 * Use the {@link RestaurantsFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view =  inflater.inflate(R.layout.list_view, container, false);

        // Created ArrayList of type ItemList to store data for place and address
        ArrayList<ItemList> placesDetails = new ArrayList<>();
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item1),getResources().getString(R.string.rest_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item2),getResources().getString(R.string.rest_address2)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item3),getResources().getString(R.string.rest_address3)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item4),getResources().getString(R.string.rest_address4)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item5),getResources().getString(R.string.rest_address5)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item6),getResources().getString(R.string.rest_address6)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item7),getResources().getString(R.string.rest_address7)));
        placesDetails.add(new ItemList(getResources().getString(R.string.rest_item8),getResources().getString(R.string.rest_address8)));

//        placesDetails.add(new ItemList("DUM PUKHT","TC Maurya, Diplomatic Enclave, Sardar Patel Marg, Delhi"));
//        placesDetails.add(new ItemList("THE SPICE ROUTE","The Imperial Hotel, Janpath, Delhi"));
//        placesDetails.add(new ItemList("MOTI MAHAL DELUX","Greater Kailash 1, Delhi"));
//        placesDetails.add(new ItemList("1911 RESTAURANT","The Imperial Hotel, Janpath, Delhi"));
//        placesDetails.add(new ItemList("TRAVERTINO","Dr Zakir Hussain Marg, Delhi"));
//        placesDetails.add(new ItemList("THE YUM YUM TREE","First Floor, Community Centre, New Friends Colony, Delhi"));
//        placesDetails.add(new ItemList("MAGIQUE","Gate No. 3, Garden of 5 Senses, Westend Marg, Said ul Ajaib, Delhi"));
//        placesDetails.add(new ItemList("SAKURA","The Metropolitan Hotel, Bangla Sahib Road, Delhi"));

        // Use custom adaptor to display data
        TourItemAdapter adapter = new TourItemAdapter(getActivity(), placesDetails);
        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        // Returns view object
        return root_view;
    }
}