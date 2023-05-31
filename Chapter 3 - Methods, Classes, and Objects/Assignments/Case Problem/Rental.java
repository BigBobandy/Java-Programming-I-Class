// This is the Rental class which is used to create Rental objects
// This class doesn't need a main method because it's not the entry point of the application.
// It is a helper class which is used to create Rental objects that store data about each rental.
// The methods in this class define how to interact with these Rental objects (set and get their data).
// The RentalDemo class, which does have a main method, is where the program starts, and it uses this Rental class to do its work.
public class Rental {
    // setting these as constants because they won't change
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;

    // These are the class variables that will hold specific information about each rental
    private String contractNumber;
    private int hours;
    private int minutesOver;
    private double price;

    // Setter methods
    // This method sets the contract number of the Rental
    public void setContractNumber(String contractNumParameter) {
        // The contract number we get from the user will be stored in contractNumber variable
        contractNumber = contractNumParameter; 
    }

    // This method calculates the hours, extra minutes, and price based on the total minutes the user has rented for
    public void setHoursAndMinutes(int rentalMinutes) {
        hours = rentalMinutes / MINUTES_IN_HOUR;
        minutesOver = rentalMinutes % MINUTES_IN_HOUR;
        price = (hours * HOURLY_RATE) + minutesOver;
    }

    // Getter methods
    // This method returns the contract number
    public String getContractNumber() {
        return contractNumber;
    }

    // This method returns the hours of rental
    public int getHours() {
        return hours;
    }

    // This method returns the minutes over an hour of rental
    public int getMinutesOver() {
        return minutesOver;
    }

     // This method returns the price of rental
    public double getPrice() {
        return price;
    }
}