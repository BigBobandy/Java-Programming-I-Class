public class DivideEvenly2 {
    public static void main(String[] args) {
        // Named constant LIMIT set to 100
        final int LIMIT = 100;
        int var, number;  // variables var and number will hold our iteration values

        // Outer loop which varies number from 1 to LIMIT
        for(number = 1; number <= LIMIT; ++number) {
            // Printing the number we're currently testing
            System.out.print(number + " is evenly divisible by ");

            // Inner loop which varies var from 1 to the current number
            for(var = 1; var <= number; ++var) {
                // Checking if number is evenly divisible by var
                if(number % var == 0) {
                    // If it is, print var
                    System.out.print(var + " ");
                }
            }
            // Move to the next line before testing the next number
            System.out.println();
        }
    }
}
/*
Lesson Notes and Description:
In this lesson, I created a nested for loop to find the numbers that divide evenly into each number from 1 to 100. The outer loop iterated over the numbers 1 to 100,
while the inner loop tested each number up to and including the current number from the outer loop for divisibility. This is an example of using nested loops to perform 
more complex operations.

Key points to remember about this lesson:
1. A nested loop is a loop inside another loop. The inner loop completes all its iterations for each single iteration of the outer loop.
2. Nested loops are often used to handle iterative operations over multi-dimensional data structures like arrays and matrices.
3. The order of nesting matters. Changing the order can lead to different results.
*/