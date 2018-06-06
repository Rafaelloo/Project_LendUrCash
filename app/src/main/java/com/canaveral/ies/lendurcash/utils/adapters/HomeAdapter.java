package com.canaveral.ies.lendurcash.utils.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.canaveral.ies.lendurcash.entities.Deuda;
import com.canaveral.ies.lendurcash.entities.User;
import com.canaveral.ies.lendurcash.R;
import com.canaveral.ies.lendurcash.utils.DataHolder;
import java.util.ArrayList;

public class HomeAdapter extends BaseAdapter {
    private ArrayList<Deuda> deudas;
    private ArrayList<User> friends;
    private Context context;
    private int layout;

    public HomeAdapter(Context context, int layout){
        this.context = context;
        this.layout = layout;
        this.deudas = DataHolder.instance.user.getDeudas();
        this.friends = DataHolder.instance.user.getAmigos();
    }

    @Override
    public int getCount() {
        return this.deudas.size();
    }

    @Override
    public Object getItem(int position) {
        return this.deudas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v = convertView;

        if (!deudas.get(position).getDeuditas().isEmpty()) {
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            v = layoutInflater.inflate(R.layout.item_listview_home, null);

            String userName = deudas.get(position).getUsername();
            String money = deudas.get(position).getDineroTotal().toString();

            ImageView ivPhoto = (ImageView) v.findViewById(R.id.ivLVFRPhotoHome);
            TextView tvUserName = (TextView) v.findViewById(R.id.tvLVFRUserNameHome);
            TextView tvMoney = (TextView) v.findViewById(R.id.tvLVFRMoneyHome);

            //imagen
            tvUserName.setText(userName);
            tvMoney.setText(money);
        }else{
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            v = layoutInflater.inflate(R.layout.empty_listview, null);
        }
        return v;
    }
}