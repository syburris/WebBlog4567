package com.theironyard;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by stevenburris on 10/3/16.
 */
public class User {
    String name;
    String password;


    public User(String name) {
        this.name = name;
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

}
