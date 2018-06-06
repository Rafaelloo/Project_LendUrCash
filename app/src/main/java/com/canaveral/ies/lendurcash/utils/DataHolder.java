package com.canaveral.ies.lendurcash.utils;
import com.canaveral.ies.lendurcash.entities.Deuda;
import com.canaveral.ies.lendurcash.entities.Deuditas;
import com.canaveral.ies.lendurcash.entities.User;

import java.util.ArrayList;

public class DataHolder {
    public static DataHolder instance = new DataHolder();

    public com.canaveral.ies.lendurcash.utils.FirebaseManager firebaseManager;
    public User user;
    public ArrayList<User> listUsers;

    public DataHolder () {
        firebaseManager = new com.canaveral.ies.lendurcash.utils.FirebaseManager();
        ArrayList<User> friends = new ArrayList<User>();
        listUsers = new ArrayList<User>();

        friends.add(new User ( "rafa", "rafa@rafa.com", "123456", null, null));
        friends.add(new User ( "vic", "vic@vic.com", "123456", null, null));

        listUsers.add(friends.get(0));
        listUsers.add(friends.get(1));
        ArrayList<Deuda> deudas = new ArrayList<>();
        ArrayList<Deuditas> deuditas = new ArrayList<>();
        deuditas.add(new Deuditas("por putas",56.4,true));
        deudas.add(new Deuda("rafa",24.3, deuditas));

        deuditas = new ArrayList<>();
       // deuditas.add(new Deuditas("por droga",5.4,false));
        deudas.add(new Deuda("vic", 5.5,deuditas));

        user = new User("admin", "admin@admin.com", "123456", friends, deudas);

    }
}