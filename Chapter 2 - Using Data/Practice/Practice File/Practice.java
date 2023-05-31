import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int aWholeNumber = 315;
        System.out.println("The number is " + aWholeNumber);

        final int STATES_IN_US = 50;
        System.out.println(STATES_IN_US);

         // Create an instance of the NewLine class
         NewLine newLine = new NewLine();
        
         // Call the newLineMethod() method on the instance
         newLine.newLineMethod();

        // Create an instance of the IntegerDemoInteractiveWithName class
        IntegerDemoInteractiveWithName interactiveDemo = new IntegerDemoInteractiveWithName();

        // Use the interactiveDemo object
        System.out.println("You entered byte: " + interactiveDemo.aByte);
        System.out.println("You entered short: " + interactiveDemo.aShort);
        System.out.println("You entered int: " + interactiveDemo.anInt);
        System.out.println("You entered long: " + interactiveDemo.aLong);
        System.out.println("Your name is: " + interactiveDemo.name);

    }
}

class IntegerDemo {
    byte aByte ; // Min Value: -128, Max Value: 127     Size in Bytes: 1
    short aShort; // Min Value: -32,768, Max Value: 32,767     Size in Bytes: 2 
    int anInt; // Min Value: -2,147,483,648, Max Value: 2,147,483,647  Size in Bytes: 4 
    long aLong; // Min Value: -9,223,372,036,854,775,808, Max Value: 9,223,372,036,854,775,807    Size in Bytes: 8

}

class BooleanDemo {
    boolean isItPayDay = false;
    boolean areYouBroke = true;

    // Value stored would be true
    boolean isSixBigger = (6 > 5);

    // Value stored would be false
    boolean isSevenSmallerOrEqual = (7 <= 4);
}

class NewLine {
    public void newLineMethod() {
        // You can use backslash n to automatically make a new line 
        System.out.println("Hello\nthere");

        // As opposed to doing it this way
        System.out.println("Hello");
        System.out.println("there");

        /* Other Escape Sequences
         * \b   Backspace: moves the cursor one space to the left
         * \t   Tab: moves the cursor to the next tap stop
         * \n   Newline or linefeed: moves the cursor to the beginning of the next line
         * \r   Carriage return: moves the cursor to the beginning of the current line
         * \''   Double quotation mark: displays a double quotation mark
         * \'   Single quotation mark: displays a single quotation mark
         * \\   Backslah: displays a single backslash character
         * 
         * \n, \'', \\ works within JOptionPane object but the rest do not
         */
    }
}

class IntegerDemoInteractiveWithName {
    byte aByte ;
    short aShort; 
    int anInt; 
    long aLong; 
    String name;


    public IntegerDemoInteractiveWithName() {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter an byte integer >> ");
    aByte = input.nextByte();

    
    System.out.print("Please enter a short integer >> ");
    aShort = input.nextShort();

    System.out.print("Please enter an integer >> ");
    anInt = input.nextInt();

    System.out.print("Please enter a long integer >> ");
    aLong = input.nextLong();

     // Consume the newline character left by nextLong()
     input.nextLine();

    System.out.print("Please enter your name >> ");
    name = input.nextLine();
    System.out.println( "Thank you, " + name);

    }

}