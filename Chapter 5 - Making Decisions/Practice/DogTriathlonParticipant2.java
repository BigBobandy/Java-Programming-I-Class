public class DogTriathlonParticipant2 {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;
    private boolean scoresAgree;

    public DogTriathlonParticipant2(String name, int numEvents, int score1, int score2, int score3) {
        this.name = name;
        NUM_EVENTS = numEvents;
        
        int totalNot0 = 0;
        if(score1 != 0) totalNot0++;
        if(score2 != 0) totalNot0++;
        if(score3 != 0) totalNot0++;
        
        scoresAgree = numEvents == totalNot0;

        if(scoresAgree) {
            obedienceScore = score1;
            conformationScore = score2;
            agilityScore = score3;
        } else {
            obedienceScore = 0;
            conformationScore = 0;
            agilityScore = 0;
        }
        
        total = obedienceScore + conformationScore + agilityScore;
        if(NUM_EVENTS == 0)
            avg = 0;
        else
            avg = (double) total / NUM_EVENTS;

        totalCumulativeScore = totalCumulativeScore + total;
    }

    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
        System.out.println(" " + name + " has a total score of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
        if(!scoresAgree)
            System.out.println("\nNotice! Number of events for " + name + " does not agree with scores reported.");
    }
}


/* 
Lesson Description and Notes:

In this lesson, I introduced decision-making logic into constructors and instance methods in Java.
The `DogTriathlonParticipant` class served as my test subject. I handled scenarios where a score of 0 isn't possible unless a dog didn't participate in any event. 
I aimed to make the number of events match the valid scores supplied to the constructor.

1. A new boolean field `scoresAgree` was added to the class. It holds `true` if the number of events reported matches the number of nonzero scores. Otherwise, it holds `false`.
2. I made sure the number of events passed to the constructor aligns with the number of nonzero scores. This was achieved by counting the nonzero scores and comparing the total to the reported number of events.
3. Using an `if...else` statement, the constructor's parameters were only assigned to the three scores when `scoresAgree` was `true`. If not, all scores were set to 0.
4. In the `display()` method, a statement was added to alert when an error occurred in the number of events value.

Key points to remember:
1. Decisions can be added into constructors and instance methods to validate data consistency.
2. It's crucial to ensure that reported data matches actual data in classes.
3. Using a boolean field can be a straightforward way to verify if certain conditions hold true.
4. `if...else` statements are an effective way to handle different conditions and execute specific code blocks.
*/