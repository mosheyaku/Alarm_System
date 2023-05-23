import java.util.ArrayList;

public class TestAlarms {

    /*The method receives an ArrayList containing alarms of different types.
    The method scans the array and activates the action method of the appropriate alarm.
    In addition, the method counts and prints the number of Smoke type alarms and resets
    the floor number in the case of an Elevator type alarm.
    Note that Fire is Smoke and therefore Fire occurrences are also counted.*/
    public static void process(ArrayList<Alarm> alarms) {
        int smokeCount = 0;

        for (Alarm alarm : alarms) {
            alarm.action();
            if (alarm instanceof Smoke)
                smokeCount++;

            if (alarm instanceof Elevator)
                ((Elevator) alarm).reset();
        }
        System.out.println(("Number of smoke alarms: " + smokeCount));
    }
}
