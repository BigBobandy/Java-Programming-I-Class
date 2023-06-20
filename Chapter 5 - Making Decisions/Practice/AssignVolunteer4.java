import java.util.Scanner;

public class AssignVolunteer4 {
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
        
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}
/*
In this lesson, I improved upon the previous AssignVolunteer3 application by adding more options for donation types and using a switch statement to assign the appropriate volunteer. 

Key points to remember about this lesson:
1. Switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression.
2. The 'break' keyword is used to exit the switch case. If break is not added after each case the program will continue executing the next case even if the expression does not match.
3. A 'default' case can be included which will be executed if none of the cases match.
*/