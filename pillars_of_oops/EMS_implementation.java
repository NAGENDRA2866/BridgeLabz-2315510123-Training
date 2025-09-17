// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    // Abstract method
    public abstract double calculateSalary();
}

// Interface Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
    private String department;
    
    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time employees get base salary plus fixed allowance
        return getBaseSalary() + 5000;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;

    public PartTimeEmployee(int id, String name, double baseSalary, int workHours) {
        super(id, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        // Part-time salary based on work hours
        return getBaseSalary() * workHours;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}


import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Alice", 50000);
        fullTimeEmp.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Bob", 1000, 20);
        partTimeEmp.assignDepartment("Support");

        employees.add(fullTimeEmp);
        employees.add(partTimeEmp);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println(emp instanceof Department ? ((Department) emp).getDepartmentDetails() : "");
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("---------------------------");
        }
    }
}


