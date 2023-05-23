import java.util.Date;

/*This is an abstract class intended to represent all 3 types of alarms.*/
public abstract class Alarm {
    protected Date activationTime;
    protected String address;

    /*A constructor that receives a string representing an address, (checks that the address
    is not empty) creates a new instance of the alarm and saves the alarm activation time.
    If the string address is empty, an error message will be received (and the instance will not be created).*/
    public Alarm(String address) throws BadAlarm {
        if (address == null || address == "")
            throw new BadAlarm("Address cannot be empty");

        this.activationTime = new Date();
        this.address = address;
    }

    /*abstract class action.*/
    public abstract void action();
}
