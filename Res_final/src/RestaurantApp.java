import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();
        TableManagement tableManagement = new TableManagement();
        Billing billing = new Billing();

        System.out.println("Welcome to the Restaurant!");

        System.out.print("Would you like to dine in or take away? (Enter 'd' for dine-in, 't' for take away): ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("d")) {
            tableManagement.displayAvailableSeats();
            System.out.print("Enter table type (2, 4, 6, or 8): ");
            int seatType = scanner.nextInt();
            scanner.nextLine();  
            tableManagement.reserveTable(seatType);
            System.out.print("Enter reserved table number: ");
            order.tableNumber = scanner.nextInt();
            scanner.nextLine();
        }

        boolean keepOrdering = true;
        while (keepOrdering) {
            System.out.println("\nSelect Cuisine:\n1. ITALIAN\n2. INDIAN\n3. CHINESE\n4. MEXICAN\n5. AMERICAN");
            int cuisineChoice = scanner.nextInt();
            CuisineType cuisineType = CuisineType.values()[cuisineChoice - 1];
            menu.displayMenu(cuisineType);

            System.out.print("Enter the name of the dish to order: ");
            scanner.nextLine(); 
            String dishName = scanner.nextLine();
            MenuItem item = menu.getMenuItem(dishName);
            if (item != null) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                order.addItem(item, quantity);
            } else {
                System.out.println("Item not found.");
            }

            System.out.print("Would you like to order more? (yes/no): ");
            keepOrdering = scanner.next().equalsIgnoreCase("yes");
        }

        billing.generateBill(order);
    }
    
}


