# 1

import java.util.*;

public class StringLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("User Method Length: " + getLength(s));
        System.out.println("Built-in Length: " + s.length());
    }
}


# 2

import java.util.*;

public class SplitCompare {
    public static String[] customSplit(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = s.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] custom = customSplit(s);
        String[] builtin = s.split(" ");
        System.out.println("Are both equal? " + compareArrays(custom, builtin));
    }
}


# 3

import java.util.*;

public class WordLength {
    public static String[] splitWords(String s) {
        return s.split(" ");
    }

    public static int getLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitWords(s);
        String[][] arr = wordsWithLength(words);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + Integer.parseInt(arr[i][1]));
        }
    }
}


# 4

import java.util.*;

public class ShortLong {
    public static String[] splitWords(String s) {
        return s.split(" ");
    }

    public static int getLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    public static int[] findMinMax(String[][] arr) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[minIdx][1])) minIdx = i;
            if (Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitWords(s);
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        int[] res = findMinMax(arr);
        System.out.println("Shortest: " + arr[res[0]][0]);
        System.out.println("Longest: " + arr[res[1]][0]);
    }
}


# 5

import java.util.*;

public class VowelConsonantCount {
    public static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if ("aeiou".indexOf(ch) >= 0) v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVC(s);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}


# 6

import java.util.Scanner;

public class VowelConsonantClassifier {
    static String classifyChar(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] classifyString(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = classifyChar(s.charAt(i));
        }
        return result;
    }

    static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = classifyString(text);
        displayTable(result);
    }
}


# 7

import java.util.Scanner;

public class TrimSpaces {
    static String trimSpaces(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String result = trimSpaces(text);
        System.out.println("Trimmed: \"" + result + "\"");
    }
}


# 8

import java.util.Scanner;

public class VotingEligibility {
    static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (isEligible(age))
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}


# 9

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static String getChoice(int n) {
        if (n == 0) return "Rock";
        else if (n == 1) return "Paper";
        else return "Scissors";
    }

    static String decideWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return "You Win!";
        return "Computer Wins!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
        int userInput = sc.nextInt();
        String userChoice = getChoice(userInput);

        int compInput = rand.nextInt(3);
        String compChoice = getChoice(compInput);

        System.out.println("You: " + userChoice);
        System.out.println("Computer: " + compChoice);
        System.out.println(decideWinner(userChoice, compChoice));
    }
}


# 10

import java.util.Scanner;

public class StudentGrades {
    static char getGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double avg = (double) total / n;
        char grade = getGrade((int) avg);

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}

