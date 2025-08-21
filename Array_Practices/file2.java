import java.util.*;

public class Level2Practice {

    // 1. Bonus Calculation for 10 Employees
    public static void employeeBonus() {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }

    // 2. Youngest and Tallest among 3 friends
    public static void youngestTallest() {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        int minAgeIdx = 0, maxHeightIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIdx]) minAgeIdx = i;
            if (height[i] > height[maxHeightIdx]) maxHeightIdx = i;
        }

        System.out.println("Youngest: " + names[minAgeIdx]);
        System.out.println("Tallest: " + names[maxHeightIdx]);
    }

    // 3. Largest and Second Largest digit in number
    public static void largestSecondLargestDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;
        while (num != 0 && index < 10) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int first = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > first) {
                second = first;
                first = digits[i];
            } else if (digits[i] > second && digits[i] != first) {
                second = digits[i];
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    // 4. Dynamic array resizing for all digits
    public static void largestSecondLargestDynamic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int first = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > first) {
                second = first;
                first = digits[i];
            } else if (digits[i] > second && digits[i] != first) {
                second = digits[i];
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    // 5. Reverse number using array
    public static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = (int) Math.log10(num) + 1;
        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

    // 6. BMI Calculation
    public static void bmiCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> H:" + height[i] + " W:" + weight[i] +
                    " BMI:" + bmi[i] + " Status:" + status[i]);
        }
    }

    // 7. BMI with 2D array
    public static void bmi2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3]; // weight, height, bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (m): ");
            data[i][1] = sc.nextDouble();
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            if (data[i][2] < 18.5) status[i] = "Underweight";
            else if (data[i][2] < 25) status[i] = "Normal";
            else if (data[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> H:" + data[i][1] + " W:" + data[i][0] +
                    " BMI:" + data[i][2] + " Status:" + status[i]);
        }
    }

    // 8. Student Marks, Percentage, Grade
    public static void studentGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks (0-100): ");
                int m = sc.nextInt();
                if (m < 0 || m > 100) {
                    System.out.println("Invalid. Enter again.");
                    j--;
                    continue;
                }
                marks[i][j] = m;
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " %: " + percent[i] + " Grade: " + grade[i]);
        }
    }

    // 9. Student Grades with 2D array (same as above but already 2D used)
    public static void studentGrades2D() {
        studentGrades();
    }

    // 10. Frequency of digits in a number
    public static void digitFrequency() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] freq = new int[10];
        while (num != 0) {
            freq[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Level 2 Practice Programs ---");
            System.out.println("1. Employee Bonus");
            System.out.println("2. Youngest & Tallest");
            System.out.println("3. Largest & 2nd Largest Digit");
            System.out.println("4. Largest & 2nd Largest with Dynamic Array");
            System.out.println("5. Reverse Number");
            System.out.println("6. BMI Calculation");
            System.out.println("7. BMI with 2D Array");
            System.out.println("8. Student Grades");
            System.out.println("9. Student Grades 2D");
            System.out.println("10. Digit Frequency");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> employeeBonus();
                case 2 -> youngestTallest();
                case 3 -> largestSecondLargestDigit();
                case 4 -> largestSecondLargestDynamic();
                case 5 -> reverseNumber();
                case 6 -> bmiCalculation();
                case 7 -> bmi2D();
                case 8 -> studentGrades();
                case 9 -> studentGrades2D();
                case 10 -> digitFrequency();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

