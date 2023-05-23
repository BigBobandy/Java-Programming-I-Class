import java.util.Scanner;

public class NauticalMilesInteractive {

    public static void main(String[] args) {
        // Declare my constants
        final double KILOMETERS_IN_NAUTICAL_MILE = 1.852; 
        final double MILES_IN_NAUTICAL_MILE = 1.150779;

         // Declare scanner object so keyboard input can be accepted
         Scanner input = new Scanner(System.in);


        double nauticalMiles; 
        
        // Getting user input and assigning it to the nautical miles variable 
        System.out.print("Please enter the number of nautical miles you wish to convert to miles and kilometers. >> ");
        nauticalMiles = input.nextDouble();

        // Calculate values in kilometes and miles
        double kilometers = nauticalMiles * KILOMETERS_IN_NAUTICAL_MILE;
        double miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;

        //  Display the results
        System.out.println(nauticalMiles + " nautical miles are equal to " + kilometers + " kilometers.");
        System.out.println(nauticalMiles + " nautical miles are equal to " + miles + " miles.");
    }
}

    

