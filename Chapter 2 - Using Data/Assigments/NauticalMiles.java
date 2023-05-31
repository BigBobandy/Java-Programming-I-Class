// Define a public class named "NauticalMiles". Public means it can be accessed from any other class.
public class NauticalMiles {

    // Define the main method. This is the entry point for any Java program. The "public" keyword means that any other class can access this method.
    // The "static" keyword means that you don't need to create an instance of the class to use this method. "Void" means this method doesn't return a value.
    public static void main(String[] args) {
        // Declare constants for conversion factors
        final double KILOMETERS_IN_NAUTICAL_MILE = 1.852; // Kilometers in one nautical mile
        final double MILES_IN_NAUTICAL_MILE = 1.150779;   // Miles in one nautical mile

        // Declare and initialize the nauticalMiles variable
        double nauticalMiles = 150; 

        // Convert nautical miles to kilometers and miles
        double kilometers = nauticalMiles * KILOMETERS_IN_NAUTICAL_MILE; // Conversion to kilometers
        double miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;           // Conversion to miles

        // Print out the conversion results
        System.out.println(nauticalMiles + " nautical miles are equal to " + kilometers + " kilometers."); // Print the conversion result to kilometers
        System.out.println(nauticalMiles + " nautical miles are equal to " + miles + " miles.");           // Print the conversion result to miles
    }
}