package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sheilaannschoepp on 2018-02-13.
 */

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;
import org.junit.Test;

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddTweet(){
        boolean thrown = false;
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");

        tweets.add(tweet);
        try{
            tweets.add(tweet);
        }catch(IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    public void testHasTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }

    public void testGetTweet(){
        //Using index
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Hello");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        assertEquals(returnedTweet.getDate(),tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Hello");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }



}
