// 1

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void displayInfo() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }
}


// 2

class LibraryBookSystem {
    public String ISBN;
    protected String title;
    private String author;

    public LibraryBookSystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends LibraryBookSystem {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}



// 3

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + getBalance());
    }
}



// 4

class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
    }
}

