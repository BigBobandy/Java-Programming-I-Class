import java.util.Scanner;

public class AssignVolunteer3 {
    public static void main(String[] args) {
        // Variables and Constants
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        // Define the input device (scanner)
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a 1 or 2 for the donation type
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
        OTHER_CODE + " for anything else… ");

        // Accept the response, and assign it to donationType
        donationType = input.nextInt();

        // Check for valid input using a nested if
        if(donationType == CLOTHING_CODE || donationType == OTHER_CODE) {
            if(donationType == CLOTHING_CODE) {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
            } else {
                volunteer = OTHER_PRICER;
                message = "a non-clothing donation";
            }

            // Display the chosen code, corresponding volunteer’s name and donation type
            System.out.println("You entered " + donationType);
            System.out.println("The volunteer who will price this item is " + volunteer);
            System.out.println("This is " + message);
        } else {
            // Invalid input, display an error message
            System.out.println("You entered " + donationType + " which is not a valid code");
            System.out.println("Please enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else.");
        }
    }
}

/*
Lesson Notes and Description:
Another modified version of the AssignVolunteer program. This time, I added a validation step to make sure the user entered a valid code. 
If they don't, my program lets them know with an error message. 
I achieved this using a nested if statement.

Key Points to Remember About This Lesson:
1. A nested if statement is an if statement inside another if statement. This allowed me to add more depth to my conditional logic.
2. With a nested if statement, I can test for more than two conditions, which is not possible with a simple if...else statement.
3. The else block now provides a user-friendly error message when an invalid code is entered.
*/