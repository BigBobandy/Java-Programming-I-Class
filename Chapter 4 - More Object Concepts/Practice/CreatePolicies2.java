
public class CreatePolicies2 {
    public static void main(String[] args) {
        // Create an instance of CarInsurancePolicy2 using the 1-parameter constructor (default payments and city)
        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);

        // Create an instance of CarInsurancePolicy2 using the 2-parameter constructor (default city)
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);

        // Create an instance of CarInsurancePolicy2 using the 3-parameter constructor (all custom values)
        CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "Newcastle");

        // Display the details of each policy
        first.display();
        second.display();
        third.display();
    }
}

/* Lesson Description and notes:
 *
 * The CreatePolicies2 class is a driver class that uses the CarInsurancePolicy2 class to create and manipulate CarInsurancePolicy2 objects.
 *
 * 1. Object Creation: This class creates three instances of the CarInsurancePolicy2 class using its three different constructors. 
 *    This demonstrates how constructor overloading allows flexibility when creating objects.
 *
 * 2. Method Invocation: After creating the CarInsurancePolicy2 objects, the 'display()' method of each object is called to print out the details of each policy.
 *
 * 3. Overloaded Constructors: The program uses the various constructors of the CarInsurancePolicy2 class to demonstrate how different amounts of information 
 *    can be passed to an object at the time of its creation.
 *
 * Key points to remember from this lesson:
 * 1. You can create objects in Java using constructors. If a class has overloaded constructors, you have more options for how to instantiate your objects.
 * 2. Once objects have been created, you can call methods on those objects to perform actions or retrieve information.
 *
 */