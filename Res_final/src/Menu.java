import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    Map<CuisineType, Map<CategoryType, List<MenuItem>>> menuMap = new HashMap<>();

    public Menu() {
        for (CuisineType cuisine : CuisineType.values()) {
            menuMap.put(cuisine, new HashMap<>());
            for (CategoryType category : CategoryType.values()) {
                menuMap.get(cuisine).put(category, new ArrayList<>());
            }
        }
        populateMenu();
    }

    private void populateMenu() {
        menuMap.get(CuisineType.ITALIAN).get(CategoryType.VEG).add(new MenuItem("Margherita Pizza", CuisineType.ITALIAN, CategoryType.VEG, 300.00));
        menuMap.get(CuisineType.ITALIAN).get(CategoryType.NON_VEG).add(new MenuItem("Chicken Alfredo Pasta", CuisineType.ITALIAN, CategoryType.NON_VEG, 350.00));
        menuMap.get(CuisineType.INDIAN).get(CategoryType.VEG).add(new MenuItem("Paneer Butter Masala", CuisineType.INDIAN, CategoryType.VEG, 257.00));
        menuMap.get(CuisineType.INDIAN).get(CategoryType.VEG).add(new MenuItem("Sambar rice", CuisineType.INDIAN, CategoryType.VEG, 57.00));
        menuMap.get(CuisineType.INDIAN).get(CategoryType.VEG).add(new MenuItem("Curd Rice", CuisineType.INDIAN, CategoryType.VEG, 77.00));
        menuMap.get(CuisineType.INDIAN).get(CategoryType.NON_VEG).add(new MenuItem("Chicken Biryani", CuisineType.INDIAN, CategoryType.NON_VEG, 370.00));
        menuMap.get(CuisineType.INDIAN).get(CategoryType.NON_VEG).add(new MenuItem("Mutton Biryani", CuisineType.INDIAN, CategoryType.NON_VEG, 430.00));
        menuMap.get(CuisineType.CHINESE).get(CategoryType.VEG).add(new MenuItem("Vegetable Fried Rice", CuisineType.CHINESE, CategoryType.VEG, 160.00));
        menuMap.get(CuisineType.CHINESE).get(CategoryType.NON_VEG).add(new MenuItem("Kung Pao Chicken", CuisineType.CHINESE, CategoryType.NON_VEG, 278.50));
        menuMap.get(CuisineType.MEXICAN).get(CategoryType.VEG).add(new MenuItem("Vegetarian Tacos", CuisineType.MEXICAN, CategoryType.VEG, 115.50));
        menuMap.get(CuisineType.MEXICAN).get(CategoryType.NON_VEG).add(new MenuItem("Chicken Enchiladas", CuisineType.MEXICAN, CategoryType.NON_VEG, 190.50));
        menuMap.get(CuisineType.AMERICAN).get(CategoryType.NON_VEG).add(new MenuItem("BBQ Chicken Wings", CuisineType.AMERICAN, CategoryType.NON_VEG, 250.00));
        menuMap.get(CuisineType.AMERICAN).get(CategoryType.NON_VEG).add(new MenuItem("Hot Dogs", CuisineType.AMERICAN, CategoryType.NON_VEG, 200.00));
        menuMap.get(CuisineType.AMERICAN).get(CategoryType.VEG).add(new MenuItem("RedBeans and rice", CuisineType.AMERICAN, CategoryType.VEG, 150.00));
        menuMap.get(CuisineType.AMERICAN).get(CategoryType.NON_VEG).add(new MenuItem("Baked Potato with Toppings", CuisineType.AMERICAN, CategoryType.VEG, 150.00));
        
    }

    public void displayMenu(CuisineType cuisine) {
        System.out.println("Cuisine: " + cuisine);
        for (CategoryType category : CategoryType.values()) {
            System.out.println(category + ":");
            for (MenuItem item : menuMap.get(cuisine).get(category)) {
                System.out.println("  " + item);
            }
        }
    }

    public MenuItem getMenuItem(String name) {
        for (CuisineType cuisine : menuMap.keySet()) {
            for (CategoryType category : menuMap.get(cuisine).keySet()) {
                for (MenuItem item : menuMap.get(cuisine).get(category)) {
                    if (item.getName().equalsIgnoreCase(name)) {
                        return item;
                    }
                }
            }
        }
        return null;
    }
}


