/** 
 * Program Name: StudentGrades
 * Description: An application to process and validate grade information for two students
 * Written By: Jackson Dykes
 * Date Written: 07/12/23
 */


import javax.swing.JOptionPane;


// Main class
public class StudentGrades {

    // Main function
    public static void main(String[] args) {
        // Show a dialog message describing the program
        JOptionPane.showMessageDialog(null, "Welcome to StudentGrades! This program will collect and process grade information for two students.");

        // Create two Student objects
        Student student1 = new Student("student 1");  // Create the first student object
        Student student2 = new Student("student 2");  // Create the second student object

        // Get student data from user
        student1.getData();  // Get data for the first student
        student2.getData();  // Get data for the second student

        // Display student data
        student1.displayData();  // Display data for the first student
        student2.displayData();  // Display data for the second student
    }

}

// Student class to hold and manage student data
class Student {
    private String firstName;  // Student's first name
    private String lastName;  // Student's last name
    private int[] grades = new int[3];  // Array to hold student's grades
    private static final int MAX_GRADE = 100;  // Constant for maximum grade
    private static final int MIN_GRADE = 0;  // Constant for minimum grade
    private String studentLabel;  // Label for the student (i.e. "student 1", "student 2")

    // Constructor
    public Student(String studentLabel) {
        this.studentLabel = studentLabel;  // Set the student label
    }

    // Function to get student data from user
    public void getData() {
        // Input validation loop for the student's first name
        do {
            firstName = JOptionPane.showInputDialog("Enter the first name for " + studentLabel + ":");
        } while (firstName == null || firstName.trim().isEmpty());  // Continue asking until valid input is provided

        // Input validation loop for the student's last name
        do {
            lastName = JOptionPane.showInputDialog("Enter the last name for " + studentLabel + ":");
        } while (lastName == null || lastName.trim().isEmpty());  // Continue asking until valid input is provided

        // Loop to get grades
        for (int i = 0; i < 3; i++) {
            int gradeInput = MIN_GRADE - 1;  // Initialize grade input with an invalid value to ensure input validation loop is executed at least once

            // Input validation loop for grades
            do {
                try {
                    gradeInput = Integer.parseInt(JOptionPane.showInputDialog("Enter grade " + (i+1) + " for " + firstName + ":"));  // Get the grade
                    
                    // If grade is outside the valid range, display error message immediately
                    if (gradeInput < MIN_GRADE || gradeInput > MAX_GRADE) {
                        JOptionPane.showMessageDialog(null, "Invalid grade. Please enter a grade between " + MIN_GRADE + " and " + MAX_GRADE + " for " + firstName + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        gradeInput = MIN_GRADE - 1;  // Reset grade input to an invalid value
                    }

                } catch (NumberFormatException e) {  // Catch exception if input is not an integer
                    JOptionPane.showMessageDialog(null, "Invalid grade. Please enter a grade between " + MIN_GRADE + " and " + MAX_GRADE + " for " + firstName + ".", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (gradeInput < MIN_GRADE || gradeInput > MAX_GRADE);  // Continue asking until valid input is provided

            grades[i] = gradeInput;  // Store the grade
        }
    }

    // Function to calculate the average grade
    private int getAverage() {
        // Calculate and return the average of the three grades
        return (grades[0] + grades[1] + grades[2]) / 3;
    }

    // Function to calculate the letter grade
    private char getLetterGrade() {
        int average = getAverage();  // Get the average grade

        // Determine and return the letter grade
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Function to display the student data
    public void displayData() {
        // Create a string with all student data
        String data = "Student Name: " + firstName + " " + lastName + "\n" 
                    + "Grades: " + grades[0] + ", " + grades[1] + ", " + grades[2] + "\n" 
                    + "Average: " + getAverage() + "\n" 
                    + "Letter Grade: " + getLetterGrade();

        // Display the data in a dialog box
        JOptionPane.showMessageDialog(null, data);
    }

}