/** 
 * Program Name: TestScoreStatistics
 * Description: This program receives student test scores from the user, and 
 *              provides statistical information including the number of scores 
 *              entered, the highest score, the lowest score, and the arithmetic average.
 * Written By: Jackson Dykes
 * Date Written: 06/29/2023
 */

import javax.swing.*;

public class TestScoreStatistics {
    public static void main(String[] args) {
        // Define constants for exit condition and score limits
        final int EXIT_CONDITION = 999;
        final int MIN_SCORE = 0;
        final int MAX_SCORE = 100;

        // Initialize variables to track total score, score count, highest score, and lowest score
        int totalScore = 0;
        int countScores = 0;
        int highestScore = MIN_SCORE - 1;  // Initialize to less than possible min score
        int lowestScore = MAX_SCORE + 1;   // Initialize to more than possible max score
        int currentScore;

        // Loop to get user input until exit condition is met
        while (true) {
            // Get user input through JOptionPane dialog
            String userInput = JOptionPane.showInputDialog(null, 
                    "Enter a student test score (or 999 to finish):");
            currentScore = Integer.parseInt(userInput);

            // Check if user wants to exit
            if (currentScore == EXIT_CONDITION) {
                break;
            }

            // Validate the score entered
            if (currentScore < MIN_SCORE || currentScore > MAX_SCORE) {
                JOptionPane.showMessageDialog(null, 
                        "Invalid score entered. Please enter a score between 0 and 100.");
                continue;
            }

            // Update total score and score count
            totalScore += currentScore;
            countScores++;

            // Check and update highest score
            if (currentScore > highestScore) {
                highestScore = currentScore;
            }

            // Check and update lowest score
            if (currentScore < lowestScore) {
                lowestScore = currentScore;
            }
        }

        // Calculate the average score
        double averageScore = (double) totalScore / countScores;

        // Display the results to the user
        JOptionPane.showMessageDialog(null, 
                "Number of scores: " + countScores +
                "\nHighest score: " + highestScore +
                "\nLowest score: " + lowestScore +
                "\nAverage score: " + averageScore);
    }
}