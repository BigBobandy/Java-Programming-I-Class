public class ShortCircuitTestOr {
    public static void main(String[] args) {
        if(falseMethod() || trueMethod())
            System.out.println("At least one is true");
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
In this lesson, I changed the class name to 'ShortCircuitTestOr' and replaced the '&&' operator with '||' (logical OR) operator. 
The || operator also exhibits short-circuit behavior i.e., if the left operand is true, it doesn't evaluate the right operand.

Key points to remember about this lesson:
1. With the || operator, if the first condition is true, the second condition will not be checked.
2. The order of conditions matters in the case of the || operator due to its short-circuit nature.
*/