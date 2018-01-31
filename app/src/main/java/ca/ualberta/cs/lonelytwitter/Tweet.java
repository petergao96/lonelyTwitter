


/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright © 2018 Team X, CMPUT301, University of Alberta -- All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at university of Alberta
 * You can find a copy of the licence in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  Tweet class represents tweets
 *  @author dezfuli
 *  @version 1.0
 *  @see NormalTweet
 *  @see ImportantTweet
 */



public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet object without a date
     *
     * @param message
     */

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets a string message
     *
     * @return message as a String
     */

    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException The tweet is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    public String toString() {
        return date.toString() + " | " + message;
    }

}
