package com.canaveral.ies.lendurcash.utils.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.canaveral.ies.lendurcash.entities.User;
import com.canaveral.ies.lendurcash.R;
import com.canaveral.ies.lendurcash.utils.DataHolder;
import java.util.ArrayList;

public class FriendsAdapter extends BaseAdapter{
    private ArrayList<User> friends;
    private Context context;
    private int layout;
    public  FriendsAdapter(Context context, int layout){
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
    public View getView(int position, View convertView, ViewGroup viewGroup){
        View v = convertView;
        return v;
    }
    /*public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.item_listview_home, null);
        String userName = friends.get(position).getUser();
        String money = "20€";

        ImageView ivPhoto = (ImageView) v.findViewById(R.id.ivLVFRPhoto);
        TextView tvUserName = (TextView) v.findViewById(R.id.tvLVFRUserName);
        TextView tvMoney = (TextView) v.findViewById(R.id.tvLVFRMoney);

        //imagen
        tvUserName.setText(userName);
        tvMoney.setText(money);
        return v;
    }*/
}
