# 1

import java.util.Scanner;

public class BMIProgram {
    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100;
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    static void display(String[][] result) {
        System.out.println("Height(m)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(data);
        display(result);
    }
}


# 2

import java.util.Scanner;

public class UniqueChars {
    static int getLength(String text) {
        int len = 0;
        try { while (true) { text.charAt(len); len++; } }
        catch (Exception e) {}
        return len;
    }

    static char[] uniqueCharacters(String text) {
        int n = getLength(text);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { found = true; break; }
            }
            if (!found) temp[k++] = c;
        }
        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}


# 3

import java.util.Scanner;

public class FirstNonRepeat {
    static char firstNonRepeat(String text) {
        int n = text.length();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean repeat = false;
            for (int j = 0; j < n; j++) {
                if (i != j && text.charAt(j) == c) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) return c;
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char ans = firstNonRepeat(text);
        if (ans != '\0') System.out.println("First non-repeating: " + ans);
        else System.out.println("No non-repeating character");
    }
}


# 4

import java.util.Scanner;

public class CharFrequency {
    static void countFrequency(String text) {
        int n = text.length();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            char c = text.charAt(i);
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (text.charAt(j) == c) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(c + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        countFrequency(text);
    }
}


# 5

import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPalindrome(String text) {
        int n = text.length();
        for (int i = 0; i < n / 2; i++) {
            if (text.charAt(i) != text.charAt(n - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        if (isPalindrome(text)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}


# 6

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        if (isAnagram(a, b)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}


# 7

import java.time.YearMonth;
import java.util.Scanner;

public class CalendarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        YearMonth ym = YearMonth.of(year, month);
        int days = ym.lengthOfMonth();
        System.out.println("Calendar " + month + "/" + year);
        for (int d = 1; d <= days; d++) System.out.print(d + " ");
    }
}


# 8

import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();
        for (String s : suits) {
            for (String r : ranks) {
                deck.add(r + " of " + s);
            }
        }
        Collections.shuffle(deck);
        for (String card : deck) System.out.println(card);
    }
}

# 9


import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = rand.nextInt(100);
        Arrays.sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}

# 10

import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Student Records:");
        for (int i = 0; i < n; i++) System.out.println(names[i] + " -> " + marks[i]);
    }
}

