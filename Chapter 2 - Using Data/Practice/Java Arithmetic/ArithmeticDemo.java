import java.util.Scanner;

public class ArithmeticDemo {

    // Create an instance of the ArithmeticDemoTwo class
    ArithmeticDemoTwo arithmeticDemoTwo = new ArithmeticDemoTwo();


    public static void main(String[] args) {
        // Declare variables
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;

        // Declare scanner object so keyboard input can be accepted
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();

        // Add statements to do math
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        // Display the calculations
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }

    
}

class ArithmeticDemoTwo {
    // Declare variables
    double firstNumber;
    double secondNumber;
    double sum;
    double difference;
    double average;

    public ArithmeticDemoTwo() {
    // Declare scanner object so keyboard input can be accepted
    Scanner input = new Scanner(System.in);

    // Prompt user
    System.out.print("Please enter double >> ");
    firstNumber = input.nextInt();
    System.out.print("Please enter another double >> ");
    secondNumber = input.nextInt();

    // Add statements to do math
    sum = firstNumber + secondNumber;
    difference = firstNumber - secondNumber;
    average = sum / 2;

    // Display the calculations
    System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
    System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
    System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
