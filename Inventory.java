import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Inventory {
    private String item;
    private int quantity;
    private String report;
    private List<Inventory> items;

    // Default constructor
    Inventory() {
        this.items = new ArrayList<>();
    }

    // Parameterized constructor
    Inventory(String item, int quantity, String report) {
        this.item = item;
        this.quantity = quantity;
        this.report = report;
        this.items = new ArrayList<>(); // Ensure items list is initialized
    }

    void AddItem(String item, int quantity, String report) {
        System.out.println("Adding item...");
        System.out.println("item "+ item + " quantity "+ quantity + " report "+ report);
        Inventory inventory = new Inventory(item, quantity, report);
        items.add(inventory);
    }

    void DeleteItem(String itemName) {
        System.out.println("Deleting item...");
        for (Inventory currentItem : items) {
            if(currentItem.item.equals(itemName))
            {
                System.out.println(" " + currentItem.item + " " + currentItem.quantity + " " + currentItem.report);
                items.removeIf(item -> item.item.equals(itemName));
                System.out.println("Done deleting");
                return;
            }
        }
        System.out.println("This item doens't exist");
       
    }
    void EditItem(){
        System.out.println("Which item do you want to edit?");
        Scanner scanner = new Scanner(System.in);
        String item=scanner.nextLine();
        for (Inventory currentItem : items) {
            if(currentItem.item.equals(item))
            {
                System.out.println("Name: " + currentItem.item + " Quantity: " + currentItem.quantity + " Report: " + currentItem.report);
                System.out.println("Do you want to update 1-Name  2-Quantity 3-Report?");
                String choice=scanner.nextLine();
                System.out.println("Enter Update: ");
                String updateString=scanner.nextLine();
                if(choice.equals("Name")||choice.equals("1"))
                {
                    
                    currentItem.item=updateString;

                }
                else if(choice.equals("Quantity")||choice.equals("2"))
                {
                    currentItem.quantity=Integer.parseInt(updateString);
                }
                else if(choice.equals("Report")||choice.equals("3"))
                {
                    currentItem.report=updateString;
                }
                System.out.println("Done Editing");
                return;
            }
        }
    }
    public void ShowItems() {
        for (int i = 0; i < items.size(); i++) {
            Inventory currentItem = items.get(i);
            System.out.println("----------------------------Item " + (i+1) + " ----------------------------");
            System.out.println("Name: " + currentItem.item);
            System.out.println("Quantity: " + currentItem.quantity);
            System.out.println("Report: " + (currentItem.report != null ? currentItem.report : "No report available"));
            System.out.println("----------------------------");
        }
    }
}