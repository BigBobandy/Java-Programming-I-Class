// Import JOptionPane class from javax.swing package for user dialog functionalities
import javax.swing.JOptionPane;

public class RentalDemo {
    
    public static void main(String[] args) {
        // Display the company motto by calling the displayMotto method in the SammysRentalPriceWithMethods class
        SammysRentalPriceWithMethods.displayMotto();

        // Create a new Rental object to store information about a rental
        Rental rental = new Rental();

        // Ask the user to enter the rental time in minutes by calling the getRentalMinutes method
        // from SammysRentalPriceWithMethods and store the input in rentalMinutes variable
        int rentalMinutes = SammysRentalPriceWithMethods.getRentalMinutes();

        // Set the contract number for the rental by calling getContractNumber method that asks user for the contract number
        rental.setContractNumber(getContractNumber());

        // Set the rental hours and minutes by passing the rentalMinutes to the setHoursAndMinutes method in the Rental object
        rental.setHoursAndMinutes(rentalMinutes);

        // Display all the details of the rental by calling the displayDetails method and passing the rental object to it
        displayDetails(rental);
    }

    // This method will display a pop-up box asking the user to enter the contract number
    // It will return the user's input as a String
    public static String getContractNumber() {
        return JOptionPane.showInputDialog(null, "Enter the contract number: ");
    }

    // This method takes a Rental object as a parameter and displays its details
    public static void displayDetails(Rental rental) {

        // Get all the details from the rental object
        String contractNumber = rental.getContractNumber();
        int hours = rental.getHours();
        int minutesOver = rental.getMinutesOver();
        double price = rental.getPrice();

        // Create a string that includes all the rental details
        String message = "Contract Number: " + contractNumber +
                     "\nHours: " + hours +
                     "\nExtra Minutes: " + minutesOver +
                     "\nPrice: $" + price;

        // Display the message in a pop-up box
        JOptionPane.showMessageDialog(null, message);
    }
}