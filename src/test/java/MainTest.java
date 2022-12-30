import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class MainTest {

    @Test
    public static void main() {
        local();
        System.out.println("_______________________________________________");

        System.out.println("Print minute + one minute: "+addAmountToCurrentMinuteInReminder(1));
        System.out.println("Print hour: "+getTimeHourToString());

        System.out.println("___________________________________________");
        System.out.println("_____________________OLD METHODS____________");
        System.out.println("Print minute + one minute: "+addAmountToCurrentMinuteInRemind(1));
        System.out.println("Print hour: "+getTimeHourToStrin());
    }

    public static String addAmountToCurrentMinuteInRemind(int amountAdd) {
        Calendar calendar = Calendar.getInstance();// get current date

        calendar.add(Calendar.MINUTE, amountAdd); // add needed number of minutes
        Date date = new Date();
        System.out.println("Current date:     " + date);
        Date currentTimePlus = calendar.getTime();
        System.out.println("Date + 1 minute: " + currentTimePlus);
        int minute = currentTimePlus.getMinutes(); // get updated minute

        if (minute < 10) {
            return "0" + minute;
        }
        if (minute >= 10) {
            return Integer.toString(minute);
        }
        return null;
    }


    public static String getTimeHourToStrin() {
        Calendar calendar = Calendar.getInstance(); // get current date
        Date date = new Date();
        int minutes = date.getMinutes(); // get current minute

        if (minutes == 59) {
            calendar.add(Calendar.HOUR_OF_DAY, 1);
        }
        Date newDate = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("hh", Locale.ENGLISH);
        int hour = Integer.parseInt(format.format(newDate));
        if (hour < 10) {
            return "0" + hour;
        }
        if (hour >= 10) {
            return Integer.toString(hour);
        }
        return null;
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