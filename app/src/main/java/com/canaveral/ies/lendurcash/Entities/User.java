package com.canaveral.ies.lendurcash.entities;

import java.util.ArrayList;

public class User {
    private String user, mail, pass;
    private ArrayList<User> amigos;

    public User() {
    }

    public User(String user, String mail, String pass, ArrayList<User> amigos) {
        this.user = user;
        this.mail = mail;
        this.pass = pass;
        this.amigos = amigos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<User> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<User> amigos) {
        this.amigos = amigos;
    }
}
