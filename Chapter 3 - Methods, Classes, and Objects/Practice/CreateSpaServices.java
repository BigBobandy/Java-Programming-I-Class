import java.util.Scanner; // Import the Scanner class to accept user keyboard input


// Define the CreateSpaServices class
public class CreateSpaServices {

    // Define the main method, which is the entry point to the application
    public static void main(String[] args) {
        String service; // Declare a String variable to hold the service description
        double price; // Declare a double variable to hold the service price

        // Instantiate three objects: two SpaService objects and one Scanner object
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for a service description and price for the first service
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // Set the service description and price for the first service
        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        // Consume the leftover newline
        keyboard.nextLine();

        // Prompt the user for a service description and price for the second service
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // Set the service description and price for the second service
        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        // Display the details for the first service
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        // Display the details for the second service
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }
}