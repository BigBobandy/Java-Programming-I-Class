import javax.swing.JOptionPane;

public class RentalDemo {
    public static void main(String[] args) {
        // Create three Rental objects with user-provided contract numbers and rental times
        Rental rental1 = new Rental(getContractNumber(), getRentalMinutes());
        Rental rental2 = new Rental(getContractNumber(), getRentalMinutes());
        Rental rental3 = new Rental(getContractNumber(), getRentalMinutes());

        // Display the details for each Rental object
        displayDetails(rental1);
        displayDetails(rental2);
        displayDetails(rental3);

        // Display the contract number of the longer rental between each pair of Rentals
        displayLongerRental(rental1, rental2);
        displayLongerRental(rental1, rental3);
        displayLongerRental(rental2, rental3);
    }

    // Method to get a contract number from the user
    public static String getContractNumber() {
        return JOptionPane.showInputDialog(null, "Enter the contract number: ");
    }

    // Method to get the rental time in minutes from the user
    public static int getRentalMinutes() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the rental minutes: "));
    }

    // Method to display the details of a Rental object
    public static void displayDetails(Rental rental) {
        // Create a string with the Rental details
        String message = "Contract Number: " + rental.getContractNumber() +
                "\nHours: " + rental.getHours() +
                "\nExtra Minutes: " + rental.getMinutesOver() +
                "\nPrice: $" + rental.getPrice();

        // Display the string in a dialog box
        JOptionPane.showMessageDialog(null, message);
    }

    // Method to determine the longer rental between two Rental objects
    public static Rental getLongerRental(Rental rental1, Rental rental2) {
        // Calculate the total rental time for each Rental
        int totalTime1 = rental1.getHours() * 60 + rental1.getMinutesOver();
        int totalTime2 = rental2.getHours() * 60 + rental2.getMinutesOver();

        // Return the Rental with the longer total rental time
        if (totalTime1 >= totalTime2) {
            return rental1;
        } else {
            return rental2;
        }
    }

    // Method to display the contract number of the longer rental between two Rental objects
    public static void displayLongerRental(Rental rental1, Rental rental2) {
        // Get the longer Rental
        Rental longerRental = getLongerRental(rental1, rental2);

        // Create a string with the contract numbers of the Rentals and the contract number of the longer Rental
        String message = "Between contract " + rental1.getContractNumber() + " and contract " + rental2.getContractNumber() +
                "\nContract " + longerRental.getContractNumber() + " has the longer rental time.";

        // Display the string in a dialog box
        JOptionPane.showMessageDialog(null, message);
    }
}