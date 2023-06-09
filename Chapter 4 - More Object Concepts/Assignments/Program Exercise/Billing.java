// Import JOptionPane class from javax.swing package for user dialog functionalities
import javax.swing.JOptionPane;

public class Billing {

    // This is the tax rate applied to all purchases. It's static because it's the same for all instances of this class.
    // It's final because we don't want this value to change once it's set.
    private final static double SALES_TAX = 0.08;
 
    // Overloaded method that receives a single parameter
    public static double computeBill(double price) {
        // Multiply the price by 1 + the sales tax to get the total price including tax.
        return price * (1 + SALES_TAX);
    }

    // Overloaded method that receives two parameters
    public static double computeBill(double price, int quantity) {
        // First, multiply the price by the quantity to get the total price before tax.
        // Then, multiply that by 1 + the sales tax to get the total price including tax.
        return price * quantity * (1 + SALES_TAX);
    }

    // Overloaded method that receives three parameters
    public static double computeBill(double price, int quantity, double coupon) {
        // First, calculate the total cost of the items before the coupon and tax.
        double total = price * quantity - coupon;
        // Then, add tax to get the final total price.
        return total * (1 + SALES_TAX);
    }

   // Testing the three overloaded methods
   public static void main(String[] args) {
    // Test with one item. The total cost should be the item's price plus tax.
    JOptionPane.showMessageDialog(null, "Total cost for one item: $" + String.format("%.2f", computeBill(69)));

    // Test with multiple items. The total cost should be the total price of all the items plus tax.
    JOptionPane.showMessageDialog(null, "Total cost for multiple items: $" + String.format("%.2f", computeBill(45, 5)));

    // Test with a coupon. The total cost should be the total price of all items, minus the coupon, plus tax.
    JOptionPane.showMessageDialog(null, "Total cost with coupon: $" + String.format("%.2f", computeBill(39, 6, 10)));
}

}