// This is the definition of the class SpaService, which stores information about spa services offered at Paradise Day Spa
public class SpaService {

    // Declare instance fields for the service description and price. These are private to ensure data encapsulation.
    private String serviceDescription;
    private double price;

    // Explicit default constructor
    public SpaService() {
        serviceDescription = "XXX";
        price = 0;
    }

    // This method sets the service description for the SpaService object. It is not static, as it operates on instance data.
    public void setServiceDescription(String service) {
        serviceDescription = service; // assign the passed parameter to the serviceDescription instance field
    }

    // This method sets the price for the SpaService object. It is not static, as it operates on instance data.
    public void setPrice(double pr) {
        price = pr; // assign the passed parameter to the price instance field
    }

    // This method retrieves the service description of the SpaService object. It is not static, as it operates on instance data.
    public String getServiceDescription() {
        return serviceDescription; // return the value of the serviceDescription instance field
    }

    // This method retrieves the price of the SpaService object. It is not static, as it operates on instance data.
    public double getPrice() {
        return price; // return the value of the price instance field
    }
}