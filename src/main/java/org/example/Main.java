package org.example;



import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Main {


    public static void main(String[] args) {
        local();
        //System.out.println(addAmountToCurrentMinuteInReminder(1));
        //System.out.println(getTimeHourToString());
    }



   /* public static String addAmountToCurrentMinuteInReminder(int amountAdd) {
        Calendar calendar = Calendar.getInstance();// get current date

        calendar.add(Calendar.MINUTE, amountAdd); // add needed number of minutes
        Date date = new Date();
        System.out.println("Curent date:     " + date);
        Date currentTimePlus = calendar.getTime();
        System.out.println("Date + 1 minute: " + currentTimePlus);
        int minute = currentTimePlus.getMinutes(); // get updated minute
        System.out.println("Minete +1: " + minute);
        if (minute < 10) {
            return "0" + minute;
        }
        if (minute >= 10) {
            return Integer.toString(minute);
        }
        return null;
    }


    public static String getTimeHourToString() {
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
    */
    public static void local(){
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime n = now.plusMinutes(1);
        System.out.println(n.getMinute());
        int m = now.getMinute();
        String a = now.format(DateTimeFormatter.ofPattern("hh"));
        System.out.println(a +" "+ m);

    }
}