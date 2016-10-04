package com.theironyard;


import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    static HashMap<String, User> users = new HashMap<>();
    static User user;
    static ArrayList<String> messages = new ArrayList<>();

    public static void main(String[] args) {

        Spark.get(
                "/",
                (request, response) -> {
                    HashMap m = new HashMap();
                    if (user != null) {
                        m.put("name", user.name);
                    }
                    return new ModelAndView(m, "home.html");
                },
                new MustacheTemplateEngine()
        );

        Spark.post(
                "/login",
                (request, response) -> {
                    String name = request.queryParams("userName");
                    User user = users.get(name);
                    if (user == null){
                        user = new User(name);
                        users.put(name,user);
                    }

//                    Session session = request.session();
//                    session.attribute("userName", name);
                    users.put(name,user);
                    response.redirect("/");
                    return null;
                }
        );
        Spark.post(
                "/logout",
                (request, response) -> {
                    response.redirect("/");
                    return null;
                }
        );


    }
}
