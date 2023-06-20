import javax.swing.JOptionPane;

public class Pay {
    // Define constants
    final static int SKILL_LEVEL_1 = 1;
    final static int SKILL_LEVEL_2 = 2;
    final static int SKILL_LEVEL_3 = 3;
    final static double PAY_LEVEL_1 = 17.00;
    final static double PAY_LEVEL_2 = 20.00;
    final static double PAY_LEVEL_3 = 22.00;
    final static double OVERTIME_FACTOR = 1.5;
    final static double RETIREMENT_CONTRIBUTION = 0.03;
    final static int NORMAL_WORK_WEEK = 40;
    final static double MEDICAL_INSURANCE = 32.5;
    final static double DENTAL_INSURANCE = 20.0;
    final static double LONG_TERM_DISABILITY_INSURANCE = 10.0;

    public static void main(String[] args) {
        // Prompt the user for the worker's skill level
        int skillLevel = Integer.parseInt(JOptionPane.showInputDialog("Enter skill level (1-3):"));
        
        // Prompt the user for the number of hours worked
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        double hourlyPayRate, regularPay, overtimePay = 0.0, totalPay, deductions = 0.0, netPay;
        
        // Determine the hourly pay rate based on the skill level
        switch(skillLevel) {
            case SKILL_LEVEL_1: hourlyPayRate = PAY_LEVEL_1; break; // Level 1 pay rate
            case SKILL_LEVEL_2: hourlyPayRate = PAY_LEVEL_2; break; // Level 2 pay rate
            case SKILL_LEVEL_3: hourlyPayRate = PAY_LEVEL_3; break; // Level 3 pay rate
            default: hourlyPayRate = 0; break; // No valid skill level
        }

        // Calculate regular and overtime pay
        if(hoursWorked > NORMAL_WORK_WEEK) {
            // If worker worked more than the normal hours, calculate regular and overtime pay
            regularPay = NORMAL_WORK_WEEK * hourlyPayRate;
            overtimePay = (hoursWorked - NORMAL_WORK_WEEK) * hourlyPayRate * OVERTIME_FACTOR;
        } else {
            // If worker worked normal hours or less, calculate only regular pay
            regularPay = hoursWorked * hourlyPayRate;
        }
        // Calculate the total pay
        totalPay = regularPay + overtimePay;

        // Calculate deductions based on the skill level
        if(skillLevel == SKILL_LEVEL_2 || skillLevel == SKILL_LEVEL_3) {
            // If worker is level 2 or 3, calculate insurance deductions
            deductions += MEDICAL_INSURANCE;
            deductions += DENTAL_INSURANCE;
            deductions += LONG_TERM_DISABILITY_INSURANCE;
        }
        if(skillLevel == SKILL_LEVEL_3) {
            // If worker is level 3, calculate retirement contribution deduction
            deductions += totalPay * RETIREMENT_CONTRIBUTION;
        }

        // Ensure deductions do not exceed total pay
        if(deductions > totalPay) {
            // If deductions exceed total pay, show an error message
            JOptionPane.showMessageDialog(null, "Error: Deductions exceed total pay");
            return;
        } else {
            // If deductions are less than total pay, calculate net pay
            netPay = totalPay - deductions;
        }

        // Display the calculated values
        JOptionPane.showMessageDialog(null, "Hours worked: " + hoursWorked + "\n" +
            "Hourly pay rate: $" + hourlyPayRate + "\n" +
            "Regular pay: $" + regularPay + "\n" +
            "Overtime pay: $" + overtimePay + "\n" +
            "Total pay: $" + totalPay + "\n" +
            "Deductions: $" + deductions + "\n" +
            "Net pay: $" + netPay);
    }
}