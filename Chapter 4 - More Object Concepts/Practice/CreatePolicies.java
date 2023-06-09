
public class CreatePolicies {
    public static void main(String[] args) {
        // Create CarInsurancePolicy objects using different constructors
        CarInsurancePolicy first = new CarInsurancePolicy(123); // Using constructor with 1 parameter
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4); // Using constructor with 2 parameters
        CarInsurancePolicy third = new CarInsurancePolicy(769, 12, "Newcastle"); // Using constructor with 3 parameters

        // Display the details of each policy
        first.display();
        second.display();
        third.display();
    }
}