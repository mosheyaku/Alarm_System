/*The class is used to handle errors that occur
when an alarm is set with invalid parameters.*/
public class BadAlarm extends Exception {
    /*This constructor accepts a string representing an
    error message and creates a new instance of the trigger.*/
    public BadAlarm(String message) {
        super(message);
    }

}
