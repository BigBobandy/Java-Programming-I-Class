// Import JOptionPane class from javax.swing package for user dialog functionalities
import javax.swing.JOptionPane;

// This is the definition of the class SammysRentalPrice. It calculates the rental price based on user's input.
public class SammysRentalPrice {
    // This is the main method. It is the entry point for any Java program. The Java Virtual Machine (JVM) calls this method when the program starts.
    public static void main(String[] args) {
        // Declaring constants
        final int RENTAL_HOURLY_COST = 40; // Cost per hour
        final int RENTAL_ADDITONAL_MINUTE = 1; // Cost per additional minute after an hour
        final int MINUTES_IN_HOUR = 60; // Minutes in one hour
        final String RENTAL_INFO = "Here at Sammy's Seashore Supplies you can rent beach equipment for $40 an hour plus $1 per additional minute."; // Rental information string

        // Show a dialog box with rental information
        JOptionPane.showMessageDialog(null, RENTAL_INFO);

        // Ask user for rental time (in minutes)
        String rentTimeString = JOptionPane.showInputDialog(null, "How many minutes would you like to rent the equipment for?");

        // Parse user input string to integer for calculation
        int rentTimeInMinutes = Integer.parseInt(rentTimeString);
        
        // Calculate the rental hours 
        int hours = rentTimeInMinutes / MINUTES_IN_HOUR;

        // Calculate additional minutes (leftover after calculating hours)
        int additonalMinutes = rentTimeInMinutes % MINUTES_IN_HOUR;
        
        // Calculate the total rental cost
        int rentalTotal = RENTAL_HOURLY_COST * hours + RENTAL_ADDITONAL_MINUTE * additonalMinutes;

        // Display the total rental cost, rental hours and additional minutes
        JOptionPane.showMessageDialog(null, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\nRental Hours: " + hours + "\nAdditional Minutes: " + additonalMinutes + "\nThe Total Cost of your rental is: $" + rentalTotal + "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
}