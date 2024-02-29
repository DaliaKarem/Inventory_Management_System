import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private String item;
    private int quantity;
    private String report;
    private Map <String,Map<String,String>>items;
    Inventory(){} 
 Inventory(String item, int quantity, String report)
 {
    this.item=item;
    this.quantity=quantity;
    this.report=report;
    this.items = new HashMap<>();

 }   
 void AddItem(String item, int quantity, String report) {
    System.out.println("Addd");
    items.computeIfAbsent(item, k -> new HashMap<>()).put("quantity", String.valueOf(quantity));
    items.get(item).put("report", report);
}

 public void ShowItems() {
     for(int i=0;i<items.size();i++)
     {
         System.out.println("----------------------------Item " + i+" ----------------------------" );
        System.out.println("Name: " + items.get(item));
        System.out.println("Quantity: " + items.get("quantity"));
        System.out.println("Report: " + items.get("report"));
        System.out.println("----------------------------");
     }
 }
}
