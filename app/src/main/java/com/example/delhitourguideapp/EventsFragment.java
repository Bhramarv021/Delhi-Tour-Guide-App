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
 * Use the {@link EventsFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view =  inflater.inflate(R.layout.list_view, container, false);

        // Created ArrayList of type ItemList to store data for place and address
        ArrayList<ItemList> placesDetails = new ArrayList<>();
//        List<String> places = Arrays.asList(getResources().getStringArray(R.array.event_item1));
        placesDetails.add(new ItemList(getResources().getString(R.string.event_item1),getResources().getString(R.string.event_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.event_item1),getResources().getString(R.string.event_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.event_item1),getResources().getString(R.string.event_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.event_item1),getResources().getString(R.string.event_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.event_item1),getResources().getString(R.string.event_address1)));
        placesDetails.add(new ItemList(getResources().getString(R.string.event_item1),getResources().getString(R.string.event_address1)));
//        placesDetails.add(new ItemList("Scaling Tech with Microservices & Devops","TechGuru, Rohini, Delhi"));
//        placesDetails.add(new ItemList("Open Mic - Poetry","KC Studio, Delhi"));
//        placesDetails.add(new ItemList("Developing Framework of Labour Legislation in India","F-11, First Floor, Kalkaji , South Delhi, Delhi"));
//        placesDetails.add(new ItemList("Dance Show","Patel Nagar, Delhi"));
//        placesDetails.add(new ItemList("Bike Show","Connaught Place, Delhi"));

        // Use custom adaptor to display data
        TourItemAdapter adapter = new TourItemAdapter(getActivity(), placesDetails);
        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        // Returns view object
        return root_view;
    }
}