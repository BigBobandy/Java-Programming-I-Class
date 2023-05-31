// Import Scanner class from java.util package for user input functionality
import java.util.Scanner;
// This is the definition of the class NauticalMilesInteractive. It's an interactive version of the NauticalMiles class, accepting user input.
public class NauticalMilesInteractive {

    // This is the main method. It is the entry point for any Java program. The Java Virtual Machine (JVM) calls this method when the program starts.
    public static void main(String[] args) {
        // Declare constants for conversion factors
        final double KILOMETERS_IN_NAUTICAL_MILE = 1.852; // Kilometers in one nautical mile
        final double MILES_IN_NAUTICAL_MILE = 1.150779;   // Miles in one nautical mile

        // Declare a Scanner object for receiving user input
        Scanner input = new Scanner(System.in);

        double nauticalMiles; // Declare variable to hold user's input
        
        // Ask user for input and store it in the nauticalMiles variable
        System.out.print("Please enter the number of nautical miles you wish to convert to miles and kilometers. >> ");
        nauticalMiles = input.nextDouble(); // Store the user's input

        // Convert nautical miles to kilometers and miles
        double kilometers = nauticalMiles * KILOMETERS_IN_NAUTICAL_MILE; // Conversion to kilometers
        double miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;            // Conversion to miles

        // Print out the conversion results
        System.out.println(nauticalMiles + " nautical miles are equal to " + kilometers + " kilometers.");  // Print the conversion result to kilometers
        System.out.println(nauticalMiles + " nautical miles are equal to " + miles + " miles.");            // Print the conversion result to miles
    }
}