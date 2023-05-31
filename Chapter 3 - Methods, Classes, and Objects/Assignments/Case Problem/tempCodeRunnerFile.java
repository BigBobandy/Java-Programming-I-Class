public static void displayDetails(Rental rental) {
        String message = String.format("Contract Number: %s\nHours: %d\nExtra Minutes: %d\nPrice: $%.2f",
                                       rental.getContractNumber(),
                                       rental.getHours(),
                                       rental.getMinutesOver(),
                                       rental.getPrice());
        JOptionPane.showMessageDialog(null, message);
    }
}
