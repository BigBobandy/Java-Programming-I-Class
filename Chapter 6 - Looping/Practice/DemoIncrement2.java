// DemoIncrement2.java
public class DemoIncrement2 {
    public static void main(String[] args) {
        int v = 4; // Declare variable v and assign it the value 4
        int plusPlusV = ++v; // Prefix increment

        v = 4; // Reset v to 4
        int vPlusPlus = v++; // Postfix increment

        // Display the initial values
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);

        // New variables for comparisons
        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y); // Prefix increment and comparison
        boolean compare2 = (x++ == y); // Postfix increment and comparison

        // Display the comparison results
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}

/* 
Lesson Notes and Description:
In the DemoIncrement2 application, we extended the exploration of prefix and postfix increment operators to include their use in comparison expressions. 
We declared new variables and compared the result of prefix and postfix increment expressions with a given value. The comparison expressions highlighted the difference 
between the timing of the increment operation in prefix and postfix contexts.

Key points to remember about this lesson:
1. In comparison expressions, the timing of the increment operation can significantly affect the outcome of the comparison.
2. Boolean variables in Java can hold two values: true or false. They are commonly used for comparisons and controlling loop and decision-making statements.
*/