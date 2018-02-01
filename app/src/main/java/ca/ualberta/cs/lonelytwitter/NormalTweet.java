package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
/**
 *  Tweet class represents tweets
 *  @author dezfuli
 *  @version 1.0
 *  @see Tweet
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs a NormalTweet object without a date
     *
     * @param message NormalTweet message
     */

    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a NormalTweet object
     *
     * @param message NormalTweet message
     * @param date NormalTweet date
     */

    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Overrides Boolean from Tweet and return FALSE
     *
     * @return Boolean.FALSE
     */

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
