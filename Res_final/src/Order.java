import java.util.HashMap;
import java.util.Map;

public class Order {
    Map<MenuItem, Integer> items = new HashMap<>();
    int tableNumber;

    public void addItem(MenuItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
        System.out.println(quantity + " x " + item.getName() + " added.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}

