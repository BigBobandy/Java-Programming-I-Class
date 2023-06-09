
public class CarInsurancePolicy {
    // Declare private instance variables for the policy
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    // First constructor, takes all parameters.
    public CarInsurancePolicy(int num, int payments, String city) {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    // Overloaded constructor, defaults city to "Mayfield".
    // Reuses the first constructor to avoid code duplication.
    public CarInsurancePolicy(int num, int payments) {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield"; // default city
    }

    // Overloaded constructor, defaults city to "Mayfield" and payments to 2.
    // Again, reuses the first constructor to avoid code duplication.
    public CarInsurancePolicy(int num) {
        policyNumber = num;
        numPayments = 2; // default number of payments
        residentCity = "Mayfield"; // default city
    }

    // Method to display the policy details
    public void display() {
        System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + "." );
    }
}