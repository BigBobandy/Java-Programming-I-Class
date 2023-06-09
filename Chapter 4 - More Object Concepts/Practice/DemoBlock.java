// Declare DemoBlock class
public class DemoBlock {

    // Define main method where the program starts execution
    public static void main(String[] args) {

        // Output the purpose of the program
        System.out.println("Demonstrating block scope");

        // Declare and initialize x variable in the scope of the main method
        int x = 1111;
        System.out.println("In first block x is " + x);

        // New block starts here. Variables defined in this block only exist within the block
        {
            // Declare and initialize y variable in the scope of this block
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        } // y is not accessible beyond this point

        // Start of another block with its own scope
        {
            // Declare and initialize another y variable. This y is different from the y in the previous block
            int y = 3333;
            System.out.println("In third block x is " + x);
            System.out.println("In third block y is " + y);

            // Call demoMethod() which has its own scope and does not affect x and y in the current scope
            demoMethod();

            // Display the values of x and y after calling demoMethod(). The values remain unchanged because demoMethod() doesn't affect them
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);
        } // y is not accessible beyond this point

        // Display the value of x after all blocks. x remains the same throughout because its scope is the main method
        System.out.println("At the end x is " + x);
    }

    // Define demoMethod() which is a separate method with its own scope
    public static void demoMethod() {

        // Declare and initialize x and y in the scope of demoMethod()
        int x = 8888, y = 9999;

        // Display the values of x and y. These are different from the x and y in the main() method because this method has its own scope
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is " + y);
    } // x and y are not accessible beyond this point
}