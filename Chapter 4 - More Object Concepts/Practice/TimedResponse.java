import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse {
    public static void main(String[] args) {
        LocalDateTime time1, time2;
        int seconds1, seconds2, minutes1, minutes2, differenceInSeconds, differenceInMinutes;

        // Get the current time and extract the seconds and minutes
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        minutes1 = time1.getMinute();

        // Prompt the user with a question
        JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");

        // Get the current time immediately after user responds and extract the seconds and minutes
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        minutes2 = time2.getMinute();

        // If seconds2 is less than seconds1, it means the response time has passed over to the next minute.
        // So, add 60 to seconds2 and subtract 1 from minutes2.
        if (seconds2 < seconds1) {
            seconds2 += 60;
            minutes2 -= 1;
        }

        // If minutes2 is less than minutes1, it means the response time has passed over to the next hour.
        // So, add 60 to minutes2.
        if (minutes2 < minutes1) {
            minutes2 += 60;
        }

        // Calculate the differences
        differenceInSeconds = seconds2 - seconds1;
        differenceInMinutes = minutes2 - minutes1;

        JOptionPane.showMessageDialog(null, "End time: " + minutes2 + " minutes " + seconds2 + " seconds" +
                "\nStart time: " + minutes1 + " minutes " + seconds1 + " seconds" +
                "\nIt took " + differenceInMinutes + " minutes and " + differenceInSeconds + " seconds for you to answer");
    }
}

/*  Lesson Description and notes:
 * 
 *  *  This program is a practical example of how to use the java.time.LocalDateTime class in Java.
 *  LocalDateTime is a class in the java.time package. It's used for handling date and time without a timezone.
 *
 *  The program calculates the difference in response time to a question, considering both seconds and minutes. 
 *  It first gets the current date and time using LocalDateTime.now(), and stores this in time1.
 *  It then gets the user to answer a question using JOptionPane.showConfirmDialog, which blocks the program until the user answers.
 *  The program then immediately gets the current date and time again, storing it in time2.
 *
 *  The program calculates the difference in seconds and minutes between time2 and time1.
 *  The calculation takes into account the situation where the seconds or minutes might roll over to the next minute or hour.
 *
 *  Key points to remember about this lesson:
 *  1. LocalDateTime.now() gets the current date and time.
 *  2. LocalDateTime.getSecond() and LocalDateTime.getMinute() can be used to get the current second and minute, respectively.
 *  3. JOptionPane.showConfirmDialog is a simple way to get user input via a popup dialog. It's part of the Swing library, so it only works in a GUI environment.
 *  4. Time calculations can get tricky when dealing with rollovers from seconds to minutes, or minutes to hours. Always consider this when writing time-related code.
 *  5. LocalDateTime is part of the java.time package, which contains many classes for handling dates and times. It's worth exploring this package further.
 * 
 */