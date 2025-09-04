# 1

package com.bridgelabz.oops.leveltwo;

public class StudentsGrades {
    String name;
    String rollNumber;
    double[] marks;

    StudentsGrades(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade(double[] marks) {
        double totalMarks = calculateTotalMarks(marks);
        if (totalMarks >= 80 && totalMarks <= 100) return "Grade A";
        else if (totalMarks >= 60 && totalMarks < 80) return "Grade B";
        else if (totalMarks >= 50 && totalMarks < 60) return "Grade C";
        else if (totalMarks >= 40 && totalMarks < 50) return "Grade D";
        else return "Grade F";
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
        }
        System.out.println(calculateGrade(marks));
    }

    public double calculateTotalMarks(double[] marks) {
        double sum = 0;
        for (double mark : marks) sum += mark;
        return sum / marks.length;
    }

    public static void main(String[] args) {
        double[] mark1 = {80, 70, 75};
        double[] mark2 = {60, 65, 50};
        StudentsGrades student1 = new StudentsGrades("Thamarai", "ECE001", mark1);
        StudentsGrades student2 = new StudentsGrades("Kannan", "CSC002", mark2);
        student1.displayStudent();
        student2.displayStudent();
    }
}


# 2

package com.bridgelabz.oops.leveltwo;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void displayBank() {
        System.out.println("\t\t\t\tState of Chennai\t\t\t\t");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount to deposit must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Lynda", "123456789", 700.00);
        displayBank();
        account.displayBalance();
        account.deposit(200.00);
        account.displayBalance();
        account.withdraw(100.00);
        account.displayBalance();
        account.withdraw(900.00);
    }
}



# 3

package com.bridgelabz.oops.leveltwo;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleantext = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);
    }

    public void displayResult() {
        if (isPalindrome()) System.out.println(text + " is palindrome");
        else System.out.println(text + " is not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        checker1.displayResult();
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();
    }
}



# 4

package com.bridgelabz.oops.leveltwo;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Null";
        this.price = 0.0;
        this.isBooked = false;
    }

    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.err.println("House full!!! sorry..... Ticket already booked");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        }
    }

    public void displayTicket() {
        if (this.isBooked) {
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        } else {
            System.out.println("Ticket have not booked yet....");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Dragon");
        ticket1.displayTicket();
        ticket1.bookTicket("A10", 120.0);
        ticket1.bookTicket("B10", 120.0);
        ticket1.bookTicket("A11", 120.0);
        ticket1.displayTicket();
    }
}



# 5

package com.bridgelabz.oops.leveltwo;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
        System.out.println("Added " + quantityToAdd + " of " + this.itemName + " to the cart.");
    }

    public void removeItem(int quantityToRemove) {
        if (quantityToRemove > this.quantity) {
            System.out.println("Cannot remove " + quantityToRemove + " of " + this.itemName + " as there are only " + this.quantity + " left.");
        } else {
            this.quantity -= quantityToRemove;
            System.out.println("Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
        }
    }

    public double totalCost() {
        return this.price * this.quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + this.itemName + ", Price: $" + this.price + ", Quantity: " + this.quantity);
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 999.99, 1);
        item1.displayItem();
        item1.addItem(2);
        item1.removeItem(1);
        System.out.println("Total cost: $" + item1.totalCost());
    }
}

