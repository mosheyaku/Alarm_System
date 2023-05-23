import java.util.ArrayList;

/*Main class where we will run the program.*/
public class Main {

    /*A main method that creates an ArrayList of alarms and initializes it with
    several alarms of the different types (and activates the process method).*/
    public static void main(String[] args) {
        ArrayList<Alarm> alarms = new ArrayList<>();

        try {
            /*Adding Smoke alarms*/
            alarms.add(new Smoke("30 Ben Gurion St", "David"));
            alarms.add(new Smoke("120 Derech HaShalom St", "Yair"));

            /*Adding Fire alarms*/
            alarms.add(new Fire("17 Harushot St", "Shlomo"));
            alarms.add(new Fire("20 Yigal Alon St", "Keren"));

            /*Adding Elevator alarms*/
            alarms.add(new Elevator("144 Hamasger St", 5));
            alarms.add(new Elevator("15 Derech Hashaked St", 20));


        } catch (BadAlarm e) {
            System.out.println(e.getMessage());
        }
        TestAlarms.process(alarms);


    }
}