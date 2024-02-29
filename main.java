import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory(); 
        System.out.println("Welcome to Inventory System");
        while (true) {
            System.out.println("1-Add Item \n2-Show Items\n3-Delete Items\n4-Edit Item \n5-Exit ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Item Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Item Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    
                    System.out.println("Do you want to enter Item Report? (Y / N) ");
                    String input = scanner.nextLine();
                    String report = input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes") ? "" : null;
                    
                    if (report != null) {
                        System.out.println("Add Item Report: ");
                        report = scanner.nextLine();
                    }
                    
                    inventory.AddItem(name, quantity, report);
                    break;
                    
                case 2:
                    inventory.ShowItems();
                    break;
                    
                case 5:
                    System.out.println("Exiting the program...");
                    return; // Exit the program
            }
        }
    }
}