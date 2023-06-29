public class DivideEvenly {
    public static void main(String[] args) {
        // A named constant LIMIT set to 100
        final int LIMIT = 100;
        int var;  // variable var will hold every value from 1 through 100

        // A statement explaining the purpose of the program
        System.out.print(LIMIT + " is evenly divisible by ");

        // A for loop that iterates from 1 to LIMIT
        // It checks whether LIMIT is evenly divisible by var
        // If so, it prints var
        for(var = 1; var <= LIMIT; ++var) {
            if(LIMIT % var == 0) {
                System.out.print(var + " ");
            }
        }
        // Advance to the next line
        System.out.println();
    }
}
/*
Lesson Notes and Description:
In this lesson, we used a for loop, a definite loop, to iterate over a range of integers from 1 to 100. This loop checked whether 100 (LIMIT) is evenly divisible by 
each number in the range. If so, it printed that number. This helped us to identify all the numbers that divide evenly into 100. The loop was designed to execute exactly 
100 times, which is a characteristic of a definite loop.

Key points to remember about this lesson:
1. A for loop is a type of definite loop in Java. It consists of initialization, condition, and increment/decrement parts.
2. The modulus operator (%) is used to find the remainder of a division operation. It can be used to determine whether one number is divisible by another.
3. A loop can be used to automate repetitive tasks such as checking divisibility for a range of numbers.
*/