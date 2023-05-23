/*The class represents Smoke alarms.*/
public class Smoke extends Alarm {
    protected String operatorName;

    /*A constructor that receives an address and a name
    activates and initializes the data accordingly.
    If the string address is empty, an error message will
    be received (and the instance will not be created).*/
    public Smoke(String address, String operatorName) throws BadAlarm {
        super(address);
        this.operatorName = operatorName;
    }

    /*The method prints the alarm details (address, activation time and operator name).*/
    public void action() {
        System.out.println("Smoke alarm activated at " + this.address + " at " + this.activationTime + " by " + this.operatorName);
    }
}
