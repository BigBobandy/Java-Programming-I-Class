public class ShortCircuitTestAnd {
    public static void main(String[] args) {
        if(trueMethod() && falseMethod())
            System.out.println("Both are true");
        else
            System.out.println("Both are not true");
    }

    public static boolean trueMethod() {
        System.out.println("True method");
        return true;
    }

    public static boolean falseMethod() {
        System.out.println("False method");
        return false;
    }
}
/*
In this lesson, I created a class named 'ShortCircuitTestAnd' to test the behavior of '&&' (logical AND) operator. 
This operator exhibits short-circuit behavior i.e., if the left operand is false, it doesn't evaluate the right operand.

Key points to remember about this lesson:
1. With the && operator, if the first condition is false, the second condition will not be checked.
2. The order of conditions matters in the case of the && operator due to its short-circuit nature.
*/