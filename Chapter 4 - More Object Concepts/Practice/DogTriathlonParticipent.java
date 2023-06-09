
public class DogTriathlonParticipent {
    // Final field for the number of events for each participant - immutable for each participant
    private final int NUM_EVENTS;

    // Static field for the total cumulative score across all participants
    private static int totalCumulativeScore = 0;

    // Regular fields for participant's details and scores
    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    // Constructor to initialize the participant's details and calculate total and average scores
    public DogTriathlonParticipent(String name, int numEvents, int score1, int score2, int score3) {
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;

        // Calculating total score and average score
        total = obedienceScore + conformationScore + agilityScore;
        avg = (double) total / NUM_EVENTS;

        // Adding the participant's total score to the total cumulative score
        totalCumulativeScore = totalCumulativeScore + total;

    }

    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
        System.out.println(" " + name + " has a total score of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
    }
}
