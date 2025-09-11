// 1

class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}


// 2


class Circle {
    double radius;

    Circle() {
        this(1.0);  // Default radius = 1.0
    }

    Circle(double radius) {
        this.radius = radius;
    }
}


// 3

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}


// 4

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}


// 5

class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
}


// 6

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * 1000;  // Assuming 1000 per day
    }
}


