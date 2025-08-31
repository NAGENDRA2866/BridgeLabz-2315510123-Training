# 1

import java.util.Scanner;

public class FactorsCalculator {
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static int findSumOfSquares(int[] factors) {
        int sumSq = 0;
        for (int f : factors) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("Sum of factors = " + findSum(factors));
        System.out.println("Product of factors = " + findProduct(factors));
        System.out.println("Sum of squares of factors = " + findSumOfSquares(factors));

        sc.close();
    }
}


# 2

import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {

    // Recursive method to calculate sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumRecursive(n - 1); // Recursive step
    }

    // Formula method to calculate sum
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number greater than 0.");
        } else {
            // Calculate sums
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);

            // Output
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursiveSum);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + formulaSum);

            // Comparison
            if (recursiveSum == formulaSum) {
                System.out.println("✅ Both computations are correct and match!");
            } else {
                System.out.println("❌ The results do not match.");
            }
        }

        sc.close();
    }
}


# 3


import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Unit Converter =====");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose conversion (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                System.out.println(value + " km = " + result + " miles");
                break;
            case 2:
                result = convertMilesToKm(value);
                System.out.println(value + " miles = " + result + " km");
                break;
            case 3:
                result = convertMetersToFeet(value);
                System.out.println(value + " meters = " + result + " feet");
                break;
            case 4:
                result = convertFeetToMeters(value);
                System.out.println(value + " feet = " + result + " meters");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

# 4

import java.util.Scanner;

public class UnitConverter2 {
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCm(double inches){
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Unit Converter =====");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose conversion (1-5): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet");
                break;
            case 2:
                result = convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards");
                break;
            case 3:
                result = convertMetersToInches(value);
                System.out.println(value + " meters = " + result + " inches");
                break;
            case 4:
                result = convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " meters");
                break;
            case 5:
                result = convertInchesToCm(value);
                System.out.println(value + " inches = " + result + " centimeters");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


# 5

import java.util.Scanner;

public class UnitConverter2 {
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCm(double inches){
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Unit Converter =====");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose conversion (1-5): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet");
                break;
            case 2:
                result = convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards");
                break;
            case 3:
                result = convertMetersToInches(value);
                System.out.println(value + " meters = " + result + " inches");
                break;
            case 4:
                result = convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " meters");
                break;
            case 5:
                result = convertInchesToCm(value);
                System.out.println(value + " inches = " + result + " centimeters");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


# 6


import java.util.Scanner;

public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Unit Converter =====");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Choose conversion (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = convertFahrenheitToCelsius(value);
                System.out.println(value + " °F = " + result + " °C");
                break;
            case 2:
                result = convertCelsiusToFahrenheit(value);
                System.out.println(value + " °C = " + result + " °F");
                break;
            case 3:
                result = convertPoundsToKilograms(value);
                System.out.println(value + " pounds = " + result + " kilograms");
                break;
            case 4:
                result = convertKilogramsToPounds(value);
                System.out.println(value + " kilograms = " + result + " pounds");
                break;
            case 5:
                result = convertGallonsToLiters(value);
                System.out.println(value + " gallons = " + result + " liters");
                break;
            case 6:
                result = convertLitersToGallons(value);
                System.out.println(value + " liters = " + result + " gallons");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


# 7


import java.util.Scanner;

public class StudentVoteChecker {
     public boolean canStudentVote(int age) {
        if (age < 0) { 
            return false;
        }
        return age >= 18;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10]; 

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " → Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") → Eligible to vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") → Not eligible to vote ❌");
            }
        }

        sc.close();
    }
}

# 8


import java.util.Scanner;

public class FriendsComparison {
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter the ages and heights of Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " - Age: ");
            ages[i] = sc.nextInt();

            System.out.print(names[i] + " - Height (in cm): ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}

# 9


import java.util.Scanner;

public class NumberCheck2 {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last number: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is Greater than " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is Equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is Less than " + numbers[numbers.length - 1]);
        }

        sc.close();
    }
}

# 10


import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; 

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        System.out.println("\nWeight\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);

            System.out.printf("%.1f\t%.1f\t\t%.1f\t\t%s\n", weight, height, bmi, status);
        }

        sc.close();
    }
}

# 11

import java.util.Scanner;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; 

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two distinct roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}

# 12


import java.util.Arrays;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
