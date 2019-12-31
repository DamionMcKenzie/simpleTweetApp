package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class tweetClass {

    public String body;
    private long uid;
    private String createdAt;
    public User user;

    public static tweetClass fromJson(JSONObject jsonObject) throws JSONException {

     tweetClass tweetClass = new tweetClass();
     tweetClass.body = jsonObject.getString("text");
     tweetClass.uid = jsonObject.getLong("id");
     tweetClass.createdAt = jsonObject.getString("created_at");
     tweetClass.user = User.fromJson(jsonObject.getJSONObject("user"));
     
     return tweetClass;

    }

    
}
