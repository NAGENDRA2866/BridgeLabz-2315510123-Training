Best Programming Practice 
1.	All values as variables including Fixed, User Inputs, and Results 
2.	Avoid Hard Coding of variables wherever possible
3.	Proper naming conventions for all variables 
String name = "Eric"; 
double height = input.nextDouble();
double totalDistance = distanceFromToVia + distanceViaToFinalCity;
4.	Proper Program Name and Class Name
5.	Follow proper indentation
1.	Sample Program 1 - Write a program to display Sam with Roll Number 1, Percent Marks 99.99, and the result ‘P’ indicates Pass(‘P’) or Fail (‘F’). 
IMP => Follow Good Programming Practice demonstrated below in all Practice Programs
// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
class DisplayResult {
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        String name = "Sam";
     
        // Create a int variable rollNumber and assign value 1
        int rollNumber = 1;
     
        // Create a double variable percentMarks and assign value 99.99
        double percentMarks = 99.99;
     
        // Create a char variable result and assign value 'P' for pass
        char result = 'P';
        
        // Display the result
        System.out.println("Displaying Result:\n" +name+ " with Roll Number " +
rollNumber+ " has Scored " +percentMarks+ 
"% Marks and Result is " +result);
    }
}

2.	Sample Program 2 - Eric Travels from Chennai to Bangalore via Vellore. From Chennai to Vellore distance is 156.6 km and the time taken is 4 Hours and 4 Mins and from Vellore to Bangalore is 211.8 km and will take 4 Hours and 25 Mins. Compute the total distance and total time from Chennai to Bangalore
// Create TravelComputation Class to compute the Distance and Travel Time

class TravelComputation {

   public static void main(String[] args) {

      // Create a variable name to indicate the person traveling
      String name = "Eric";
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
      String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      double distanceFromToVia = 156.6;

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia = 4 * 60 + 4;

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity = 211.8;

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity = 4 * 60 + 25;

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
 
Level 1 Practice Programs
1.	Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___ 
public class HarryAge {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}



2.	Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
public class SamAverage {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}


3.	Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
public class KmToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double milesPerKm = 1.6;

        double miles = kilometers * milesPerKm;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}


4.	Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
a.	Use a single print statement to display multiline text and variables.
b.	Profit = selling price - cost price
c.	Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice +
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit +
                           "\nThe Profit Percentage is " + profitPercentage + "%");
    }
}


The Profit is INR ___ and the Profit Percentage is ___
public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice +
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit +
                           " and the Profit Percentage is " + profitPercentage + "%");
    }
}


5.	Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
a.	Use Modulus Operator (%) to find the reminder.
b.	Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;  // Division operator
        int remainingPens = totalPens % students;   // Modulus operator

        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}


6.	The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
Hint => 
a.	Create a variable named fee and assign 125000 to it.
b.	Create another variable discountPercent and assign 10 to it.
c.	Compute discount and assign it to the discount variable.
d.	Compute and print the fee you have to pay by subtracting the discount from the fee.
O/P => The discount amount is INR ___ and final discounted fee is INR ___
public class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}


7.	Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 0.621371; // conversion factor

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMiles;

        // Volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}


8.	Create a program to convert distance in kilometers to miles.
Hint => 
a.	Create a variable km and assign type as double as in double km;
b.	Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
c.	Use Scanner Object to take user input for km as in km = input.nextInt();
d.	Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km
import java.util.Scanner;

public class KmToMilesScanner {
    public static void main(String[] args) {
        double km;

        Scanner input = new Scanner(System.in); // Scanner object
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // user input

        double miles = km / 1.6; // 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close();
    }
}


9.	Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
a.	Create a variable named fee and take user input for fee.
b.	Create another variable discountPercent and take user input.
c.	Compute the discount and assign it to the discount variable.
d.	Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
import java.util.Scanner;

public class CourseFeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculations
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}


10.	Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Find feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        input.close();
    }
}


11.	Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
a.	Create a variable number1 and number 2 and take user inputs.
b.	Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " 
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}


10.	Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert square inches to square centimeters (1 inch = 2.54 cm → 1 sq inch = 6.4516 sq cm)
        double areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInInches + " square inches " +
                           "and " + areaInCm + " square centimeters.");

        input.close();
    }
}


11.	Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4; // Perimeter = 4 × side

        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close();
    }
}


12.	Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
                           " and in miles is " + miles);

        input.close();
    }
}


15.	Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}


16.	Create a program to find the maximum number of handshakes among N number of students.
Hint => 
a.	Get integer input for numberOfStudents variable.
b.	Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
c.	Display the number of possible handshakes.
import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}


