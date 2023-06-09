
public class DemoOverload {
    
    // main method where the program starts execution
    public static void main(String[] args) {
        // Declare variables month, day and year
        int month = 6, day = 24, year = 2023;

        // Call overloaded displayDate with different number of parameters
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);

    }

    // Overloaded displayDate method which takes one parameter(month), uses default day and year
    public static void displayDate(int mm) {
        System.out.println("Event date " + mm + "/1/2022");
    }

    // Overloaded displayDate method takes two parameters (month and day) and uses default year
    public static void displayDate(int mm, int dd) {
        System.out.println("Event date " + mm + "/" + dd + "/2022");
    }

    // Overloaded displayDate method which takes three parameters (month, day and year)
    public static void displayDate(int mm, int dd, int yy) {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}

/*  Lesson Description and notes:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */