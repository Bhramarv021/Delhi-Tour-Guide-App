package com.example.delhitourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlacesFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view = inflater.inflate(R.layout.list_view, container, false);

        // Created ArrayList of type ItemList to store data for place and address
        ArrayList<ItemList> placesDetails = new ArrayList<>();
	placesDetails.add(new ItemList(getResources().getString(R.string.place_item1),getResources().getString(R.string.place_address1),R.drawable.india_gate_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item2),getResources().getString(R.string.place_address2),R.drawable.bangla_sahib_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item3),getResources().getString(R.string.place_address3),R.drawable.cp_park_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item4),getResources().getString(R.string.place_address4),R.drawable.jhandewalan_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item5),getResources().getString(R.string.place_address5),R.drawable.majnu_ka_tila_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item6),getResources().getString(R.string.place_address6),R.drawable.humayuns_tomb_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item7),getResources().getString(R.string.place_address7),R.drawable.hauz_khas_village_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item8),getResources().getString(R.string.place_address8),R.drawable.qutab_minar_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item9),getResources().getString(R.string.place_address9),R.drawable.delhi_zoo_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item10),getResources().getString(R.string.place_address10),R.drawable.red_fort_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item11),getResources().getString(R.string.place_address11),R.drawable.akshardham_img));
        placesDetails.add(new ItemList(getResources().getString(R.string.place_item12),getResources().getString(R.string.place_address12),R.drawable.lotus_temp_img));

        // Use custom adaptor to display data
        TourItemAdapter adapter = new TourItemAdapter(getActivity(), placesDetails);
        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        // Returns view object
        return root_view;
    }
}
