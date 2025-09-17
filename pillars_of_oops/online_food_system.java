// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

// Discountable interface
interface Discountable {
    double applyDiscount(double discountPercent);
    String getDiscountDetails();
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercent) {
        double discount = calculateTotalPrice() * discountPercent / 100;
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount applicable.";
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    private double extraChargePerItem = 50; // e.g., for meat/processing

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + extraChargePerItem) * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercent) {
        double discount = calculateTotalPrice() * discountPercent / 100;
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item discount applicable with extra charges.";
    }
}


import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegBurger = new VegItem("Veg Burger", 120, 2);
        NonVegItem chickenPizza = new NonVegItem("Chicken Pizza", 300, 1);

        order.add(vegBurger);
        order.add(chickenPizza);

        for (FoodItem item : order) {
            item.displayItemDetails();
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price before discount: " + totalPrice);

            if (item instanceof Discountable) {
                double discountedPrice = ((Discountable) item).applyDiscount(10); // 10% discount
                System.out.println(((Discountable) item).getDiscountDetails());
                System.out.println("Total Price after discount: " + discountedPrice);
            }

            System.out.println("------------------------------");
        }
    }
}
