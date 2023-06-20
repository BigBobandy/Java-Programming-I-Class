public class Rental {
    // Constants representing minutes in an hour and the hourly rental rate
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;

    // Private fields holding the contract number, rental hours and minutes, and the rental price
    private String contractNumber;
    private int hours;
    private int minutesOver;
    private double price;

    // Constructor that accepts a contract number and total rental time in minutes
    public Rental(String contractNumber, int rentalMinutes) {
        // Set the contract number and rental time
        setContractNumber(contractNumber);
        setHoursAndMinutes(rentalMinutes);
    }

    // Default constructor that sets the contract number to "A000" and rental time to 0
    public Rental() {
        this("A000", 0);
    }

    // Method to set the contract number
    public void setContractNumber(String contractNumParameter) {
        contractNumber = contractNumParameter;
    }

    // Method to set the rental time and calculate the hours, extra minutes, and price
    public void setHoursAndMinutes(int rentalMinutes) {
        // Calculate the hours and extra minutes from the total rental time
        hours = rentalMinutes / MINUTES_IN_HOUR;
        minutesOver = rentalMinutes % MINUTES_IN_HOUR;

        // If the extra minutes are over 40, increment hours and reset extra minutes
        if (minutesOver > 40) {
            hours++;
            minutesOver = 0;
        }

        // Calculate the price based on hours and extra minutes
        price = (hours * HOURLY_RATE) + minutesOver;
    }

    // Method to get the contract number
    public String getContractNumber() {
        return contractNumber;
    }

    // Method to get the rental hours
    public int getHours() {
        return hours;
    }

    // Method to get the extra rental minutes
    public int getMinutesOver() {
        return minutesOver;
    }

    // Method to get the rental price
    public double getPrice() {
        return price;
    }
}