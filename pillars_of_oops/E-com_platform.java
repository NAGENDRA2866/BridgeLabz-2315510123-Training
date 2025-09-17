// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public abstract double calculateDiscount();
}

// Taxable interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics product
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;  // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;  // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics tax: 18%";
    }
}

// Clothing product
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;  // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;  // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing tax: 5%";
    }
}

// Groceries product (non-taxable)
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;  // 5% discount
    }
}


import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics phone = new Electronics(101, "Smartphone", 30000);
        Clothing shirt = new Clothing(102, "T-Shirt", 1500);
        Groceries rice = new Groceries(103, "Rice Pack", 800);

        products.add(phone);
        products.add(shirt);
        products.add(rice);

        for (Product p : products) {
            p.displayProductDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            String taxInfo = (p instanceof Taxable) ? ((Taxable) p).getTaxDetails() : "No tax applicable";
            
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println(taxInfo);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------------------------");
        }
    }
}
