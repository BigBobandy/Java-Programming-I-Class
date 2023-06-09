import javax.swing.JOptionPane;

public class RentalDemo {
    public static void main(String[] args) {
        // creates a rental object with default values
        Rental rental1 = new Rental();

        // gets contract number and rental minutes from the user
        String contractNumber = getContractNumber();
        int rentalMinutes = SammysRentalPriceWithMethods.getRentalMinutes();

        // creates a rental object with user-provided values
        Rental rental2 = new Rental(contractNumber, rentalMinutes);

        // displays the details of both rental objects
        displayDetails(rental1);
        displayDetails(rental2);
    }

    // method to get the contract number from the user
    public static String getContractNumber() {
        return JOptionPane.showInputDialog(null, "Enter the contract number: ");
    }

    // method to display the details of a rental object
    public static void displayDetails(Rental rental) {
        // gets the details from the rental object
        String contractNumber = rental.getContractNumber();
        int hours = rental.getHours();
        int minutesOver = rental.getMinutesOver();
        double price = rental.getPrice();

        // creates a message with all the rental details
        String message = "Contract Number: " + contractNumber +
                     "\nHours: " + hours +
                     "\nExtra Minutes: " + minutesOver +
                     "\nPrice: $" + price;

        // displays the message in a dialog box
        JOptionPane.showMessageDialog(null, message);
    }
}