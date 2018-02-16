package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sheilaannschoepp on 2018-02-13.
 */

import java.util.ArrayList;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {

        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet) {

        //return Boolean.FALSE;
        return tweets.contains(tweet);

    }

    public Tweet getTweet(int index) {

        return tweets.get(index);

    }

    public void delete(Tweet tweet) {

        tweets.remove(tweet);
    }
}
