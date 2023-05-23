/*The class represents Fire alarms.*/
public class Fire extends Smoke {
    private boolean active;

    /*A constructor that receives an address and a name activates and
    initializes the variables. The active variable is initialized to true.
    If the string address is empty, an error message will be received
    (and the instance will not be created).*/
    public Fire(String address, String operatorName) throws BadAlarm {
        super(address, operatorName);
        this.active = true;
    }

    /*The method changes the value of the variable active to false and in addition it
    prints the details of the alarm (address, activation time and operator's name).*/
    public void action() {
        this.active=false;
        System.out.println("Fire alarm activated at " + this.address + " at " + this.activationTime + " by " + this.operatorName);
    }
}
