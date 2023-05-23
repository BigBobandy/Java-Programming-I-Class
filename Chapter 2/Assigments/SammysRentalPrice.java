import javax.swing.JOptionPane;

public class SammysRentalPrice {
    public static void main(String[] args) {
        // Declaring my constant variables
        final int RENTAL_HOURLY_COST = 40;
        final int RENTAL_ADDITONAL_MINUTE = 1;
        final int MINUTES_IN_HOUR = 60;
        final String RENTAL_INFO = "Here at Sammy's Seashore Supplies you can rent beach equipment for $40 an hour plus $1 per additional minute.";


        // Displaying the rental info message
        JOptionPane.showMessageDialog(null, RENTAL_INFO);

        // Getting user input on how many minutes they would like to rent
        String rentTimeString = JOptionPane.showInputDialog(null, "How many minutes would you like to rent the equipment for?");

        // Since it's a string i have to convert it to an integer for calculations
        int rentTimeInMinutes = Integer.parseInt(rentTimeString);
        
        // Getting how many hours their rental will be
        int hours = rentTimeInMinutes / MINUTES_IN_HOUR;

        // Using modulus operation to get how many additional minutes there are
        int additonalMinutes = rentTimeInMinutes % MINUTES_IN_HOUR;
        
        // Calculating the total 
        int rentalTotal = RENTAL_HOURLY_COST * hours + RENTAL_ADDITONAL_MINUTE * additonalMinutes;

        // Displaying the total
        JOptionPane.showMessageDialog(null, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\nThe Total Cost of your rental is: $" + rentalTotal + "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
}
