// 1

// Base class
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

// Subclass 1
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

// Subclass 2
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Delivered on: " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("O123", "2025-09-17", "TRK987654", "2025-09-20");
        System.out.println(order.getOrderStatus());
    }
}



// 2

// Base class
class Course {
    String courseName;
    int duration;  // Duration in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

// Subclass 1
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// Subclass 2
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: $" + discount);
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Masterclass", 40, "Udemy", true, 199.99, 20.0);
        paidCourse.displayCourseInfo();
    }
}

