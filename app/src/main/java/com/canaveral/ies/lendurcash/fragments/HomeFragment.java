package com.canaveral.ies.lendurcash.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.canaveral.ies.lendurcash.R;
import com.canaveral.ies.lendurcash.utils.adapters.HomeAdapter;


public class HomeFragment extends Fragment {

    private ListView lvChats;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        lvChats = (ListView) v.findViewById(R.id.lvHMFChats);
        HomeAdapter adapter = new HomeAdapter(v.getContext(),R.layout.item_listview_home);
        lvChats.setAdapter(adapter);

        return v;
    }
}
