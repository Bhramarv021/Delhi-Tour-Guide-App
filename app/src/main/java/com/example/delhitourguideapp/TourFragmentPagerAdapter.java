package com.example.delhitourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourFragmentPagerAdapter(Context context, FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new EventsFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.places);
        }if(position == 1){
            return mContext.getString(R.string.restaurants);
        }if(position == 2){
            return mContext.getString(R.string.hotels);
        }else{
            return mContext.getString(R.string.events);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
