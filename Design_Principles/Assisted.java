
// 1

import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Data Structures", "Jane Smith");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Library books:");
        library.showBooks();
    }
}


// 2
import java.util.ArrayList;

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println(name + " is viewing account balance.");
    }
}

class Bank {
    ArrayList<Customer> customers = new ArrayList<>();

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " account opened in the bank.");
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1);
        bank.openAccount(customer2);

        customer1.viewBalance();
    }
}


// 3

import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showEmployees() {
        for (Employee e : employees) {
            System.out.println(e.name);
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void showCompanyStructure() {
        for (Department d : departments) {
            System.out.println("Department: " + d.deptName);
            d.showEmployees();
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        Department devDept = new Department("Development");
        devDept.addEmployee("Alice");
        devDept.addEmployee("Bob");

        Department hrDept = new Department("HR");
        hrDept.addEmployee("Charlie");

        company.departments.add(devDept);
        company.departments.add(hrDept);

        System.out.println("Company Structure:");
        company.showCompanyStructure();
    }
}

