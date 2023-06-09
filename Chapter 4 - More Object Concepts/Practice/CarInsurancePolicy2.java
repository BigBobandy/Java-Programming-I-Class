
public class CarInsurancePolicy2 {
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    // This is the primary constructor that initializes all fields
    // In this class, this constructor is the one that actually initializes the object's state
    public CarInsurancePolicy2(int num, int payments, String city) {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    // This is an overloaded constructor that uses the 'this' keyword to call the primary constructor.
    // 'this' is used to call another constructor within the same class (constructor chaining)
    // In this case, it's setting a default city ("Mayfield") when only number and payments are provided
    public CarInsurancePolicy2(int num, int payments) {
        this(num, payments, "Mayfield");
    }

    // This is another overloaded constructor that uses 'this' keyword for constructor chaining.
    // It sets default values for payments (2) and city ("Mayfield") when only the policy number is provided
    public CarInsurancePolicy2(int num) {
        this(num, 2);
    }

    // This method displays the details of the policy
    public void display() {
        System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");
    }
}

/* Lesson Description and notes: 
 *
 * The CarInsurancePolicy2 class is a great demonstration of how constructor overloading works in Java. 
 *
 * 1. Constructor Overloading: This is a technique in Java where a class can have multiple constructors with the same name, but different parameters. 
 *    The correct constructor is chosen based on the arguments used when creating an object.
 *
 * 2. The 'this' keyword: This is used within a class's method or constructor to refer to the current object. Here, it's used for constructor chaining, 
 *    which is the practice of having one constructor call another to avoid code duplication.
 *
 * 3. Default Values: By having multiple constructors, this class can set default values for some of its fields. For example, if no resident city is 
 *    provided when creating a CarInsurancePolicy2 object, "Mayfield" is used as a default.
 *
 * Key points to remember from this lesson:
 * 1. Classes in Java can have multiple constructors, each with a different parameter list.
 * 2. The 'this' keyword can be used to call one constructor from another within the same class.
 * 3. Constructor overloading is a useful technique for setting default values and improving code flexibility.
 *
 */