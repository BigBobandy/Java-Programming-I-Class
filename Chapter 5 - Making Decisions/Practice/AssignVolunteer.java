import java.util.Scanner;

public class AssignVolunteer {
    public static void main(String[] args) {
        // Declaring variables and constants
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        // Define scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 1 or 2 for the donation type
        System.out.println("What type of donation is this?");
        System.out.println("Enter " + CLOTHING_CODE + " for clothing, " +
        OTHER_CODE + " for anything else... ");

        // Accept the response, and assign it to donationType
        donationType = input.nextInt();

        // If else condition to choose the name of the volunteer
        if(donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else 
            volunteer = OTHER_PRICER;

        // Display the chosen code and name
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
} 


/*
Lesson Notes and Description:
In this lesson, I learned how to use an if-else statement. 
I created a program for a non-profit thrift shop where we determine which volunteer should price a donated item. 
Users can input whether the item is clothing or some other type. 
If the donation is clothing, the item is priced by Regina. Any other item is priced by Marco.

Key Points to Remember About This Lesson:

if...else statements are used to perform different actions based on different conditions.
The Scanner class is used to get user input.
== is used to check if two primitive types, like int, are equal.
final keyword is used to define a constant - a value which cannot be changed once it's set.
Variables and constants should be named clearly to represent their purpose/value.
*/