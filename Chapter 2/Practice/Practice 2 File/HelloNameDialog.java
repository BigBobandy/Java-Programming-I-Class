import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result; 
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

       // Create an instance of the SalaryDialog class
        // This will automatically call the SalaryDialog constructor
        SalaryDialog salaryDialog = new SalaryDialog();

    

    }
}

class SalaryDialog {

    public SalaryDialog() {
        String wageString, dependentsString;
        double wage, weeklyPay;
        int dependents;
        final double HOURS_IN_WEEK = 37.5;

        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE );

        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);

        dependents = Integer.parseInt(dependentsString);
        JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
    }
}