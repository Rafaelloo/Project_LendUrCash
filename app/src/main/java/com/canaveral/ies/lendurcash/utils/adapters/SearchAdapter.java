package com.canaveral.ies.lendurcash.utils.adapters;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.canaveral.ies.lendurcash.entities.User;
import com.canaveral.ies.lendurcash.R;
import com.canaveral.ies.lendurcash.utils.DataHolder;
import java.util.ArrayList;

public class SearchAdapter extends BaseAdapter {
    private ArrayList<User> friends;
    private Context context;
    private int layout;

    public SearchAdapter(Context context, int layout) {
        this.context = context;
        this.friends = DataHolder.instance.user.getAmigos();
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return this.friends.size();
    }

    @Override
    public Object getItem(int position) {
        return this.friends.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v = convertView;
        final EditText etBuscador = (EditText) v.findViewById(R.id.tvLVFRUserNameSearch);
        etBuscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s, Context context, View v, int position) {
                for (User user: friends) {
                    if (etBuscador.getText().equals(user.getUser())){
                        LayoutInflater layoutInflater = LayoutInflater.from(context);
                        v = layoutInflater.inflate(R.layout.item_listview_search, null);

                        String userName = friends.get(position).getUser();

                        ImageView ivPhoto = (ImageView) v.findViewById(R.id.ivLVFRPhotoSearch);
                        TextView tvUserName = (TextView) v.findViewById(R.id.tvLVFRUserNameSearch);

                    }else{
                        LayoutInflater layoutInflater = LayoutInflater.from(context);
                        v = layoutInflater.inflate(R.layout.empty_listview, null);
                    }
                }
            }
        });



        return v;
    }
}