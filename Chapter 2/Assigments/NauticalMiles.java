public class NauticalMiles {
    public static void main(String[] args) {
        // Declare my constants
        final double KILOMETERS_IN_NAUTICAL_MILE = 1.852; 
        final double MILES_IN_NAUTICAL_MILE = 1.150779;


        double nauticalMiles = 150; 

        // Calculate values in kilometes and miles
        double kilometers = nauticalMiles * KILOMETERS_IN_NAUTICAL_MILE;
        double miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;

        //  Display the results
        System.out.println(nauticalMiles + " nautical miles are equal to " + kilometers + " kilometers.");
        System.out.println(nauticalMiles + " nautical miles are equal to " + miles + " miles.");
    }
}
