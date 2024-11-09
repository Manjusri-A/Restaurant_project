import java.util.Map;

public class Billing {
    private static final double GST_RATE = 0.18;

    public void generateBill(Order order) {
        System.out.println("\nBill for Table " + order.tableNumber + ":");
        double subtotal = 0;
        for (Map.Entry<MenuItem, Integer> entry : order.items.entrySet()) {
            double itemTotal = entry.getKey().getPrice() * entry.getValue();
            System.out.println(entry.getKey() + " | Quantity: " + entry.getValue() + " | Total: ₹ " + itemTotal);
            subtotal += itemTotal;
        }
        double gst = subtotal * GST_RATE;
        double total = subtotal + gst;
        System.out.println("Subtotal: ₹ " + subtotal);
        System.out.println("GST (18%): ₹ " + gst);
        System.out.println("Total Bill: ₹ " + total);
        System.out.println("-----------Thank you visit Again-----------");
    }
}


