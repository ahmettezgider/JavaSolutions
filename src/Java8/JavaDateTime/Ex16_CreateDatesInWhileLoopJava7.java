package Java8.JavaDateTime;

import java.util.*;

public class Ex16_CreateDatesInWhileLoopJava7 {
    public static void main(String[] args) {
        Date todaysDate = new Date();
        Date anotherDate = new Date(todaysDate.getTime() + 61*24*60*60*1000l);

        List<Date> listOfDates3 = getDaysBetweenDates(todaysDate, anotherDate);

        System.out.println(listOfDates3.size());        //61
    }



    public static List<Date> getDaysBetweenDates(Date startdate, Date enddate)
    {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startdate);

        while (calendar.getTime().before(enddate))
        {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }
}

/*
3. Create dates in while loop – Java 7
To get all dates from startDate to endDate in Java 7, we must write our own custom logic
as their is very limited API support in JDK. Or else, consider using 3rd party libraries e.g. Joda-time.
 */