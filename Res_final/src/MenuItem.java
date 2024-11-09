 enum CuisineType {
    ITALIAN, INDIAN, CHINESE, MEXICAN, AMERICAN
}
 enum CategoryType {
    VEG, NON_VEG
}
public class MenuItem {
    String name;
    CuisineType cuisineType;
    CategoryType categoryType;
    double price;

    public MenuItem(String name, CuisineType cuisineType, CategoryType categoryType, double price) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.categoryType = categoryType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String toString() {
        return name + " | ₹" + price;
    }
}


