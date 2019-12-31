package com.codepath.apps.restclienttemplate.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.R;
import com.codepath.apps.restclienttemplate.models.tweetClass;

import java.util.List;

public class TweetsAdapter extends RecyclerView.Adapter<TweetsAdapter.viewHolder> {

    private Context context;
    private List<tweetClass>tweets;

    //pass in context and list of tweets
    public TweetsAdapter(Context context, List<tweetClass> tweets) {
        this.context = context;
        this.tweets = tweets;
    }

    //for each row, inflate the layout
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.item_tweet, parent, false);
        return new viewHolder(view);

    }

    // bind values based on the position of the element
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        tweetClass tweet = tweets.get(position);
      holder.tvBody.setText(tweet.body);
      holder.tvScreenName.setText(tweet.user.screenName);
        Glide.with(context).load(tweet.user.profileImageUrl).into(holder.ivProfileImage);
    }

    @Override
    public int getItemCount() {
        return tweets.size();
    }

    // define the view holder
     public class viewHolder extends RecyclerView.ViewHolder{
          public ImageView ivProfileImage;
          public TextView tvScreenName;
          public TextView tvBody;

        public viewHolder(View itemView) {
            super(itemView);
            ivProfileImage = itemView.findViewById(R.id.ivProfileImage);
            tvScreenName = itemView.findViewById(R.id.tvScreenName);
            tvBody = itemView.findViewById(R.id.tvBody);



        }
    }
}
