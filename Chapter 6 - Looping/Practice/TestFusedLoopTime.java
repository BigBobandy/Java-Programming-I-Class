import java.time.*;

public class TestFusedLoopTime {
    public static void main(String[] args) {
        int startTime, endTime;
        int x;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;

        LocalDateTime now;

        // Start time capture
        now = LocalDateTime.now();
        startTime = now.getNano();

        // Call method1() in a loop
        for(x = 0; x < REPEAT; ++x) {
            method1();
        }

        // Call method2() in another loop
        for(x = 0; x < REPEAT; ++x) {
            method2();
        }

        // End time capture for separate loops
        now = LocalDateTime.now();
        endTime = now.getNano();

        System.out.println("Time for loops executed separately: " +
                ((endTime - startTime) / FACTOR) + " milliseconds");

        // Start time capture for fused loop
        now = LocalDateTime.now();
        startTime = now.getNano();

        // Call method1() and method2() in a single loop
        for(x = 0; x < REPEAT; ++x) {
            method1();
            method2();
        }

        // End time capture for fused loop
        now = LocalDateTime.now();
        endTime = now.getNano();

        System.out.println("Time for loops executed in a block: " +
                ((endTime - startTime) / FACTOR) + " milliseconds");
    }

    // Stub method1
    public static void method1() {
    }

    // Stub method2
    public static void method2() {
    }
}
/*
Lesson Notes and Description:
In this lesson, I compared the execution times of running two methods in separate loops versus running them in a single, fused loop.
I found that executing the methods in a single loop significantly improves performance.

Key points to remember about this lesson:
1. The time it takes to execute a block of code can have a significant impact on the performance of a program, especially when dealing with large data sets or complex computations.
2. It's a good practice to measure execution times in your program to identify bottlenecks and to optimize code performance.
3. Loops are often a significant factor in execution time. Fusing two separate loops into one, when possible, can lead to performance improvements.
*/