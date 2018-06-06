package com.canaveral.ies.lendurcash.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.canaveral.ies.lendurcash.R;
import com.canaveral.ies.lendurcash.utils.adapters.SearchAdapter;


public class SearchFragment extends Fragment {
    private ListView lvUsers;
    private TextView tvUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        lvUsers = (ListView) v.findViewById(R.id.lvFSUsers);
        tvUser = (TextView) v.findViewById(R.id.etFSSearch);
        SearchAdapter adapter = new SearchAdapter(v.getContext(),R.layout.item_listview_home);
        lvUsers.setAdapter(adapter);
        return v;
    }
}
