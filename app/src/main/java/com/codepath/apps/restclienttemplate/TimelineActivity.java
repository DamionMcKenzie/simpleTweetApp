package com.codepath.apps.restclienttemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.codepath.apps.restclienttemplate.models.Tweet;
import com.github.scribejava.apis.TwitterApi;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class TimelineActivity extends AppCompatActivity {

    private RestClient client;
    RecyclerView rvTweets;
    private TweetsAdapter adapter;
    private List<Tweet> tweets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        client = RestApplication.getRestClient(this);

        // Find the recycler view
           rvTweets = findViewById(R.id.rvTweets);
        // initialize the list of tweets and adapter from the data source
        tweets = new ArrayList<>();
        adapter = new TweetsAdapter(this,tweets);
        //  set up recycler view: setting layout manager and adapter
          rvTweets.setAdapter(adapter);
          rvTweets.setLayoutManager(new LinearLayoutManager(this));
        populateHomeTimeline();
    }

    private void populateHomeTimeline() {

        client.getHomeTimeline(new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
//               Log.d("TwitterClient", response.toString());

                // iterate through the list of tweets
                for (int i=0; i < response.length(); i++){
                    try {
                        // convert each JSON object into a tweet object
                    JSONObject jsonTweetObject = response.getJSONObject(i);
                     Tweet tweet = Tweet.fromJson(jsonTweetObject);
                        // Add the tweet into our data source
                        tweets.add(tweet);
                        // notify the adapter
                        adapter.notifyItemInserted(tweets.size()-1);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

            }


            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.e("TwitterClient", responseString);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                Log.e("TwitterClient", errorResponse.toString());
            }
        });

    }
}
