/** 
 * Program Name: RentalDemo
 * Description: This program allows the user to input rental durations and 
 *              displays detailed information about each rental. It includes 
 *              validation of rental duration and displays a coupon for each 
 *              full hour in the rental.
 * Written By: Jackson Dykes
 * Date Written: 06/29/2023
 */

import javax.swing.JOptionPane;

public class RentalDemo {
    // Constants for rental time boundaries
    private static final int MIN_RENTAL_MINUTES = 60;
    private static final int MAX_RENTAL_MINUTES = 7200;

    public static void main(String[] args) {
        // Create a Rental object with user-provided contract numbers and validated rental times
        Rental rental1 = new Rental(getContractNumber(), getValidRentalMinutes());

        // Display the details for the Rental object
        displayDetails(rental1);

        // Display a coupon for each full hour in the rental
        displayCoupons(rental1);
    }

    // Method to get a contract number from the user
    public static String getContractNumber() {
        return JOptionPane.showInputDialog(null, "Enter the contract number: ");
    }

    // Method to get a valid rental time in minutes from the user
    public static int getValidRentalMinutes() {
        int rentalMinutes;
        do {
            rentalMinutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the rental minutes (between 60 and 7200): "));
        } while (rentalMinutes < MIN_RENTAL_MINUTES || rentalMinutes > MAX_RENTAL_MINUTES);
        return rentalMinutes;
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

    // Method to display a coupon for each full hour in the rental
    public static void displayCoupons(Rental rental) {
        String coupon = "Coupon good for 10 percent off next rental";
        for (int i = 0; i < rental.getHours(); i++) {
            JOptionPane.showMessageDialog(null, coupon);
        }
    }
}