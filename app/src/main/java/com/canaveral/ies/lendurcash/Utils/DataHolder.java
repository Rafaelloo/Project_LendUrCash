package com.canaveral.ies.lendurcash.Utils;

import com.canaveral.ies.lendurcash.Entities.User;

import java.util.ArrayList;

public class DataHolder {
    public static DataHolder instance = new DataHolder();

    public FirebaseManager firebaseManager;
    public User user;

    public DataHolder () {
        firebaseManager = new FirebaseManager();
        ArrayList<User> friends = new ArrayList<User>();
        friends.add(new User ( "rafa", "rafa@rafa.com", "123456", null));
        friends.add(new User ( "vic", "vic@vic.com", "123456", null));

        user = new User("admin", "admin@admin.com", "123456", friends);

    }
}