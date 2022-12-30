import org.testng.annotations.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class MainTest {

    @Test
    public static void main() {
        local();
        System.out.println("_______________________________________________");

        System.out.println("Print minute + one minute: "+addAmountToCurrentMinuteInReminder(1));
        System.out.println("Print hour: "+getTimeHourToString());

        System.out.println("___________________________________________");
    }
    public static void local(){
        LocalTime now = LocalTime.now();
        System.out.println("Current Date: " + now);
        LocalTime n = now.plusMinutes(1);
        System.out.println("Minutes +1: " + n.getMinute());
        int m = now.getMinute();
        int min = n.getMinute();
        String a = now.format(DateTimeFormatter.ofPattern("hh"));
        System.out.println("Time to print:  " + a +" "+ min);

    }
    public static String addAmountToCurrentMinuteInReminder(int amountAdd) {
        LocalTime timeNow = LocalTime.now();
        LocalTime updatedMinute = timeNow.plusMinutes(amountAdd);
        return String.valueOf(updatedMinute.getMinute());
    }
    public static String getTimeHourToString() {
        LocalTime timeNow = LocalTime.now();
        int minutes = timeNow.getMinute();
        if (minutes == 59) {
            timeNow.plusHours(1);
        }
        return timeNow.format(DateTimeFormatter.ofPattern("hh"));
    }
}