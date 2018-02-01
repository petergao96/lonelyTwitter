package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 *  Tweet class represents tweets
 *  @author dezfuli
 *  @version 1.0
 *  @see Tweet
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructs a ImportantTweet object without a date
     *
     * @param message ImportantTweet message
     */

    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs a NormalTweet object
     *
     * @param message NormalTweet message
     * @param date NormalTweet date
     */

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Overrides Boolean from Tweet and return TRUE
     *
     * @return Boolean.TRUE
     */

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
