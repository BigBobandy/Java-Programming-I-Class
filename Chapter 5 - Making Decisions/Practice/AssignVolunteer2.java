import java.util.Scanner;

public class AssignVolunteer2 {
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

        // If else condition to choose the name of the volunteer and set the message
        if(donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }

        // Display the chosen code, corresponding volunteer’s name and donation type
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
    }
}
/* 
Lesson Notes and Description: 
This lesson enhances the AssignVolunteer program. The goal was to assign a volunteer and also define the type of donation as either clothing or non-clothing. 
To achieve this, I used blocks of code in my if...else statement. 
This allows me to execute multiple statements for each condition.

Key Points to Remember About This Lesson:
1. Blocks of code, enclosed by {}, are handy when you want to execute multiple actions within an if...else statement.
2. I learned about variable scope today. Variables that I declare within a block can only be accessed within that block.
3. Constants are really helpful. They are variables that can't change their value once set, and you can create them using the `final` keyword.
4. I learned how to collect user input using the `Scanner` class.
5. Providing an informative message or feedback to the user enhances the user experience. This makes the application user-friendly and interactive.
*/