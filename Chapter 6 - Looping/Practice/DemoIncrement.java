// DemoIncrement.java
public class DemoIncrement {
    public static void main(String[] args) {
        int v = 4; // Declare variable v and assign it the value 4
        int plusPlusV = ++v; // Prefix increment: increment v before assignment

        v = 4; // Reset v to 4
        int vPlusPlus = v++; // Postfix increment: increment v after assignment

        // Display the values
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
    }
}

/* 
Lesson Notes and Description:
In the DemoIncrement application, we explored the use of prefix (i.e., ++v) and postfix (i.e., v++) increment operators. 
The prefix increment operator increases the value of the variable before it is used in the expression, whereas the postfix 
increment operator increases the value after it is used in the expression.

Key points to remember about this lesson:
1. The prefix increment operator (e.g., ++v) increases the value of the variable before it is used in the expression.
2. The postfix increment operator (e.g., v++) increases the value of the variable after it is used in the expression.
3. The difference between these two operators becomes significant when the increment operation is part of a larger expression.
*/