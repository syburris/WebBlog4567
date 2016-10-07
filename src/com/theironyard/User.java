package com.theironyard;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by stevenburris on 10/3/16.
 */
public class User {
    String name;
    String password;
    ArrayList<Message> messages = new ArrayList<>();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String password, ArrayList<Message> messages) {
        this.name = name;
        this.password = password;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
