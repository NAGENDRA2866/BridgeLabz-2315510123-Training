# 1

package com.bridgelabz.oops.levelone;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}


# 2

package com.bridgelabz.oops.levelone;
public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void areaCircle() {
        System.out.printf("Area of circle: %.4f", (Math.PI * radius * radius));
    }

    public void circumferenceCircle() {
        System.out.printf("\nCircumference of circle: %.4f", (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}


# 3

package com.bridgelabz.oops.levelone;
public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("2States", "Chetan Bhagat", 500);
        Book book2 = new Book("Wings Of Fire", "Abdul kalam.A.P.J", 500);
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}



# 4

package com.bridgelabz.oops.levelone;
public class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemName : " + itemName);
        System.out.println("itemPrice : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + totalCost);
    }

    public static void main(String[] args) {
        Item item1 = new Item("01AA", "Water bottle", 500);
        Item item2 = new Item("01BB", "Rice", 700);
        Item item3 = new Item("02AA", "blackboard", 400);
        item1.displayItemDetails(2);
        item2.displayItemDetails(3);
        item3.displayItemDetails(1);
    }
}


# 5


package com.bridgelabz.oops.levelone;
public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayMobile() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MobilePhone mobile1 = new MobilePhone("VIVO", "VIVO V29", 15999);
        MobilePhone mobile2 = new MobilePhone("ONE PLUS", "ONE PLUS nord4", 39999);
        MobilePhone mobile3 = new MobilePhone("APPLE", "iphone pro16", 79999);
        mobile1.displayMobile();
        mobile2.displayMobile();
        mobile3.displayMobile();
    }
}
