/*The class represents Elevator alarms.*/
public class Elevator extends Alarm {

    private int floor;

    /*A constructor that receives the address and floor number and initializes the variables accordingly.
    If the string address is empty, an error message will be received
    (and the instance will not be created).*/
    public Elevator(String address, int floor) throws BadAlarm {
        super(address);
        this.floor = floor;
    }

    /*This method prints the alarm details (address, activation time and floor number).*/
    public void action() {
        System.out.println("Elevator alarm activated at " + this.address + " at " + this.activationTime + " on floor " + this.floor);
    }

    /*The method resets the floor number to 0.*/
    public void reset() {
        this.floor = 0;
    }

}
