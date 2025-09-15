// 1

import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class School {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolExample {
    public static void main(String[] args) {
        School school = new School();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        s1.enrollCourse(math);
        s1.enrollCourse(science);
        s2.enrollCourse(science);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        s2.showCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}


// 2

import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showStructure() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.name);
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.name);
        }
    }
}

public class UniversityExample {
    public static void main(String[] args) {
        University uni = new University("Global University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        Faculty prof1 = new Faculty("Dr. Smith");
        Faculty prof2 = new Faculty("Dr. Johnson");

        uni.addFaculty(prof1);
        uni.addFaculty(prof2);

        uni.showStructure();

        // Deleting university deletes departments, but faculties exist independently
        uni = null;
        System.out.println("\nUniversity deleted. Faculties still exist:");
        System.out.println(prof1.name);
        System.out.println(prof2.name);
    }
}


// 3

import java.util.ArrayList;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println(name + " is consulting patient " + patient.name);
    }
}

class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

public class HospitalExample {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doc1 = new Doctor("Dr. Adams");
        Doctor doc2 = new Doctor("Dr. Brown");

        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Emma");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        doc1.consult(p1);
        doc2.consult(p1);
        doc1.consult(p2);
    }
}


// 4

import java.util.ArrayList;

class Product {
    String productName;

    Product(String productName) {
        this.productName = productName;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void showProducts() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println("- " + p.productName);
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showProducts();
    }
}

public class ECommerceExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        Order order = new Order();
        order.addProduct(new Product("Laptop"));
        order.addProduct(new Product("Mouse"));

        customer.placeOrder(order);
    }
}


// 5

import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Course> enrolledCourses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignProfessor(Course course) {
        course.professor = this;
    }
}

class Course {
    String courseName;
    Professor professor;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.name);
        }
    }
}

public class UniversityManagementExample {
    public static void main(String[] args) {
        Student s1 = new Student("Bob");
        Course c1 = new Course("Math");

        Professor prof = new Professor("Dr. Smith");

        s1.enrollCourse(c1);
        prof.assignProfessor(c1);

        s1.showCourses();
        c1.showDetails();
    }
}








