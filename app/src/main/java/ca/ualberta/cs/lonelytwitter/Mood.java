package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by peter on 2018-01-17.
 */

public abstract class Mood {
    private boolean mood;
    private Date date;

    Mood(boolean mood)
    {
        this.mood = mood;
        date = new Date();
    }

    Mood(boolean mood, Date date)
    {
        this.mood = mood;
        this.date = date;
    }


    public void setMood(boolean mood)
    {
        this.mood = mood;
    }



}
