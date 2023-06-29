import java.util.Scanner;

public class AssignVolunteer5 {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer… ");
        donationType = input.nextInt();

        //Loop to validate data entries
        while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
        {
            System.out.println("You entered " + donationType +
            " which is not a valid donation type");
            System.out.print("Please enter a value between " +
            CLOTHING_CODE + " and " + OTHER_CODE + "... ");
            System.out.print("Enter an integer... ");
            donationType = input.nextInt();
        }
        //End of loop

        //Switch case to assign volunteer based on the donation type
        switch(donationType) {
            case(CLOTHING_CODE):
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            case(FURNITURE_CODE):
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            case(ELECTRONICS_CODE):
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break; 
            case(OTHER_CODE):
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            default:
                volunteer = "invalid";
                message = "an invalid donation type";
        }
        //End of switch case

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}

/* Lesson Notes and Description: 
    Built upon the previous AssignVolunteer4 application by adding a loop to validate the data entries. 
   The loop ensures that a valid donation code is always entered by the user. 
   If the entered donation code is not valid, the program prompts the user to enter a valid donation code until a valid code is entered. 
   This is achieved through the use of a while loop which checks whether the entered donation code is within the range of valid codes.
 * 
 * Key Points to remember about this lesson:
 * 
 *  The while loop is a control flow statement that allows code to be executed repeatedly based on a given condition. The loop continues while the condition is true.

    The || operator represents logical OR in Java. It is a binary operator and is used to create a logical expression that is true if either of the conditions is true.

    The nextInt() method of Scanner object is used to get the user input. It is important to handle input validation to avoid any exceptions or errors during the execution of the program.

    Leaving the default case in a switch statement can be beneficial. It can serve as documentation and it prepares the code for possible changes in the program requirements in the future.
 *
 * 
 */