public class Rental {
    // constants that represent the number of minutes in an hour and the hourly rental rate
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;

    // private fields for contract number, hours rented, extra minutes, and rental price
    private String contractNumber;
    private int hours;
    private int minutesOver;
    private double price;

    // overloaded constructor that takes a contract number and number of rental minutes
    public Rental(String contractNumber, int rentalMinutes) {
        // sets the contract number and calculates hours, extra minutes, and price
        setContractNumber(contractNumber);
        setHoursAndMinutes(rentalMinutes);
    }

    // default constructor that sets default values for contract number and rental minutes
    public Rental() {
        // calls the overloaded constructor with default values
        this("A000", 0);
    }

    // Setters
    // method to set the contract number
    public void setContractNumber(String contractNumParameter) {
        contractNumber = contractNumParameter;
    }

    // method to calculate the hours, extra minutes, and price
    public void setHoursAndMinutes(int rentalMinutes) {
        hours = rentalMinutes / MINUTES_IN_HOUR;
        minutesOver = rentalMinutes % MINUTES_IN_HOUR;
        price = (hours * HOURLY_RATE) + minutesOver;
    }

    // Getters
    // method to get the contract number
    public String getContractNumber() {
        return contractNumber;
    }

    // method to get the number of hours rented
    public int getHours() {
        return hours;
    }

    // method to get the number of extra minutes rented
    public int getMinutesOver() {
        return minutesOver;
    }

    // method to get the rental price
    public double getPrice() {
        return price;
    }
}