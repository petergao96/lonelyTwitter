package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by peter on 2018-01-17.
 */

public class goodMood extends Mood{

    goodMood(boolean mood)
    {
        super(mood);
    }
    goodMood(boolean mood, Date date)
    {
        super(mood, date);
    }
    public String printMood()
    {
        return("Good Mood\n");
    }

}
