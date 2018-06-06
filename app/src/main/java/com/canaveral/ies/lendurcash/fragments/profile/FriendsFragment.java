package com.canaveral.ies.lendurcash.fragments.profile;

import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
import android.widget.ListView;

import com.canaveral.ies.lendurcash.R;
import com.canaveral.ies.lendurcash.Utils.Adapters.MyAdapter;

public class FriendsFragment extends Fragment {
    private ListView lvFriends;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friends, container, false);

        lvFriends = (ListView) view.findViewById(R.id.lvFRFFriends);

        MyAdapter adapter = new MyAdapter(view.getContext(),R.layout.item_listview_chat);

        lvFriends.setAdapter(adapter);

        return view;
    }
}
