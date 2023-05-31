// Import JOptionPane class from javax.swing package for user dialog functionalities
import javax.swing.JOptionPane;

public class BookStoreCredit {
    // Define a constant for the credit multiplier
    // Declaring it at class level allows it to be used by mutliple methods
    private static final double CREDIT_MULTIPLIER = 10.0;

    public static void main(String[] args) {

        // Using JOptionPane to prompt the user for the student's name, and GPA
        String name = JOptionPane.showInputDialog(null, "Enter the student's name:");
        String gpaString = JOptionPane.showInputDialog(null, "Enter the student's grade point average.");

        // Convert the String input received for grade point average into a double type
        double gradePointAverage = Double.parseDouble(gpaString);

        // Call the displayCredit method and pass the student's name and grade point average to it
        displayCredit(name, gradePointAverage);
    }

    // Declare the displayCredit method which takes the student's name and grade point average as input
     // It calculates the bookstore credit based on the grade point average and displays it
    private static void displayCredit(String name, double gradePointAverage) {
        // Compute the credit that based on studen't gpa
        double credit = gradePointAverage * CREDIT_MULTIPLIER;

        // Declare the message that will be displayed.
        // This is a more efficient and readable way of concatenating strings I learned about recently.
        // '%s' is a placeholder for a string, and '%.2f' is a placeholder for a floating point number with two decimal places.
        // These placeholders are replaced with the variables provided at the end (name, gradePointAverage, credit) at runtime when the String.format method is called.
        String message = String.format("%s has a grade point average of %.2f and is awarded bookstore credit of $%.2f", name, gradePointAverage, credit);

        // Display the message
        JOptionPane.showMessageDialog(null, message);

    }
}
