# 1


import java.util.Arrays; 

public class FootballTeamHeights {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
        }
        return heights;
    }
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Heights of players: " + Arrays.toString(heights));

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
       
        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player Height: " + shortest + " cm");
        System.out.println("Tallest Player Height: " + tallest + " cm");
    }
}


# 2

import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }
    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args) {
        int number = 153;  

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(number));

        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }
}

# 3


import java.util.Scanner;

public class NumChecker {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
    public static boolean isStrong(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));

        sc.close();
    }
}


# 4

import java.util.Arrays;

public class NumberCheckerCount {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d * d;
        }
        return sum;
    }
    public static boolean isHarshad(int num) {
        int[] digits = NumberChecker.getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int d : digits) {
            freq[d][0] = d;
            freq[d][1]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int number = 1729; 

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSq = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSq);

        boolean harshad = isHarshad(number);
        System.out.println("Is Harshad Number: " + harshad);

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies: ");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}

# 5

import java.util.Arrays;

public class NumberCheckerCounter {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }
    public static int[] reverseDigits(int[] digits) {
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i];
        }
        return reversed;
    }
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }
    public static void main(String[] args) {
        int number = 12021;

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        boolean equalCheck = arraysEqual(digits, reversed);
        System.out.println("Digits equal to reversed? " + equalCheck);

        boolean palindrome = isPalindrome(number);
        System.out.println("Is Palindrome Number: " + palindrome);

        boolean duck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + duck);
    }
}


# 6

import java.util.Scanner;

public class CheckNumber {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static boolean isNeon(int num){
        int square = num * num;
        int sum = 0;
        while(square > 0){
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static boolean isSpy(int num){
        int sum = 0, product = 1;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int num){
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
    public static boolean isBuzz(int num){
        return num % 7 == 0 || num % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));
        sc.close();
    }
}


# 7

import java.util.Arrays;

public class OTPGenerator {
    public static int generateOTP() {
        return (int) (Math.random() * 9000) + 1000; 
    }
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
        
    }
}


# 8

import java.util.Scanner;

public class CalendarProgram {
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void printCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        } else {
            daysInMonth[2] = 28;
        }

        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDay(month, year);
        int days = daysInMonth[month];

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);

            if (((day + firstDay) % 7 == 0) || (day == days)) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
        sc.close();
    }
}

# 9

import java.util.Scanner;

public class CollinearPoints {
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);

        return slope1 == slope2;
    }

    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + 
                             x2 * (y3 - y1) + 
                             x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeCheck = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck  = areCollinearArea(x1, y1, x2, y2, x3, y3);

        if (slopeCheck && areaCheck) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are NOT collinear.");
        }
        sc.close();
    }
}


# 10

import java.util.Random;

public class EmployeeBonus {
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = 1 + rand.nextInt(10);         
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] empData) {
        double[][] results = new double[empData.length][3]; 

        for (int i = 0; i < empData.length; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            results[i][0] = bonus;
            results[i][1] = newSalary;
            results[i][2] = salary;
        }
        return results;
    }

    public static void displayResults(int[][] empData, double[][] results) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-12s %-12s %-12s %-15s %-12s\n", 
                          "ID", "Old Salary", "Years", "Bonus", "New Salary", "Bonus %");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < empData.length; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus = results[i][0];
            double newSalary = results[i][1];
            double bonusPercent = (years > 5) ? 5 : 2;

            System.out.printf("%-5d %-12d %-12d %-12.2f %-15.2f %-12.0f\n", 
                              (i + 1), salary, years, bonus, newSalary, bonusPercent);

            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-12s %-12.2f %-15.2f\n", 
                          "TOTAL", totalOld, "", totalBonus, totalNew);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int[][] empData = generateEmployeeData(10);      
        double[][] results = calculateBonus(empData);     
        displayResults(empData, results);                 
    }
}


# 11


import java.util.Scanner;

public class LineEquationAndDistance {
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("Distance: " + distance);
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
        sc.close();
    }
}


# 12

import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        System.out.println("A + B:");
        printMatrix(addMatrices(A, B));
        System.out.println("A - B:");
        printMatrix(subtractMatrices(A, B));

        if (cols == rows) {
            System.out.println("A * B:");
            printMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Multiplication not possible for non-square matrices.");
        }
        sc.close();
    }
}


# 13

import java.util.Random;
import java.util.Scanner;

public class  MatrixManipilating{
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / (double)det;
        inv[0][1] = -A[0][1] / (double)det;
        inv[1][0] = -A[1][0] / (double)det;
        inv[1][1] = A[0][0] / (double)det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        double[][] inv = new double[3][3];
        inv[0][0] = (A[1][1] * A[2][2] - A[1][2] * A[2][1]) / (double)det;
        inv[0][1] = (A[0][2] * A[2][1] - A[0][1] * A[2][2]) / (double)det;
        inv[0][2] = (A[0][1] * A[1][2] - A[0][2] * A[1][1]) / (double)det;
        inv[1][0] = (A[1][2] * A[2][0] - A[1][0] * A[2][2]) / (double)det;
        inv[1][1] = (A[0][0] * A[2][2] - A[0][2] * A[2][0]) / (double)det;
        inv[1][2] = (A[0][2] * A[1][0] - A[0][0] * A[1][2]) / (double)det;
        inv[2][0] = (A[1][0] * A[2][1] - A[1][1] * A[2][0]) / (double)det;
        inv[2][1] = (A[0][1] * A[2][0] - A[0][0] * A[2][1]) / (double)det;
        inv[2][2] = (A[0][0] * A[1][1] - A[0][1] * A[1][0]) / (double)det;
        return inv;
    }

    public static void printMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printMatrix(double[][] A) {
        for (double[] row : A) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (2 or 3): ");
        int n = sc.nextInt();
        int[][] A = createRandomMatrix(n, n);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Transpose:");
        printMatrix(transpose(A));

        if (n == 2) {
            int det = determinant2x2(A);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                printMatrix(inverse2x2(A));
            } else {
                System.out.println("Inverse does not exist (det = 0)");
            }
        } else if (n == 3) {
            int det = determinant3x3(A);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                printMatrix(inverse3x3(A));
            } else {
                System.out.println("Inverse does not exist (det = 0)");
            }
        }
        sc.close();
    }
}


# 14


import java.util.Scanner;

public class FactorsUtility {
    public static int[] findFactors(int num) {
        int[] temp = new int[num];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                temp[count++] = i;
            }
        }
        int[] factors = new int[count];
        System.arraycopy(temp, 0, factors, 0, count);
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static int findProductOfCubes(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= (f * f * f);
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));
        sc.close();
    }
}
