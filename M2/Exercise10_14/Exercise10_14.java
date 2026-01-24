package Exercise10_14;

import java.util.GregorianCalendar;

public class Exercise10_14 {
    public static void main(String[] args){
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate( 34355555133101L);

        System.out.println("First Date: ");
        System.out.println(date1.getYear()+"-"+date1.getMonth()+"-"+date1.getDay());

        System.out.println("Second Date: ");
        System.out.println(date2.getYear()+"-"+date2.getMonth()+"-"+date2.getDay());
    }
}

class MyDate{
    //data fields
    int year = 1970;
    int month = 0;
    int day = 1;

    //no-arg constructor for the current date
    MyDate(){
        GregorianCalendar date = new GregorianCalendar();

        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    //constructor with specified time since midnight
    MyDate(long timeSinceMidnight){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(timeSinceMidnight);

        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //constructor for specific day
    MyDate(int newYear, int newMonth, int newDay){
        year = newYear;
        month = newMonth;
        day = newDay;
    }

    //three getter methods
    int getYear(){return year;}

    int getMonth(){return month;}

    int getDay(){return day;}

    //set a new date based on elapsed time
    MyDate setDate(long elapsedTime){
        GregorianCalendar original = new GregorianCalendar(year, month,day);

        long originalMillis = original.getTimeInMillis();

        GregorianCalendar elapsed = new GregorianCalendar();
        elapsed.setTimeInMillis(elapsedTime + originalMillis);

        int newYear = elapsed.get(GregorianCalendar.YEAR);
        int newMonth = elapsed.get(GregorianCalendar.MONTH);
        int newDay = elapsed.get(GregorianCalendar.DAY_OF_MONTH);

        return new MyDate(newYear, newMonth, newDay);
    }
}