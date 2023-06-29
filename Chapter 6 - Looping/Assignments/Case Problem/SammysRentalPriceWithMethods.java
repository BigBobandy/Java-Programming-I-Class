// Import JOptionPane class from javax.swing package for user dialog functionalities
import javax.swing.JOptionPane;

public class SammysRentalPriceWithMethods {
    // Constant for company motto
    private static final String MOTTO = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\nSammy's makes it fun in the sun!\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
    
    public static void main(String[] args) {
        // Get the rental time in minutes from the user
        int rentalMinutes = getRentalMinutes();

        // Display the company motto
        displayMotto();

        // Create a Rental object and set its fields using the rental minutes
        Rental rental = new Rental();
        rental.setHoursAndMinutes(rentalMinutes);

        // pass the Rental object to the displayDetails method to display all the details
        RentalDemo.displayDetails(rental);
    }    

    // This method asks the user for the rental time in minutes then returns the value
    public static int getRentalMinutes() {

       // Getting the user input as a string
       String rentalTimeString = JOptionPane.showInputDialog(null, "Please enter number of minutes of your rental.");

       // Parsing it into an integer
       int rentalTime = Integer.parseInt(rentalTimeString);

       // Returning the value as an integer
        return rentalTime;
    }

    // This method displays the motto
    public static void displayMotto() {
        JOptionPane.showMessageDialog(null, MOTTO);
    }

}
