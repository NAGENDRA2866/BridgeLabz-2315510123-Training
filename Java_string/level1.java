# 1

import java.util.Scanner;
class CompareStrings {
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean res1 = compare(s1, s2);
        boolean res2 = s1.equals(s2);
        System.out.println("User-defined: " + res1);
        System.out.println("Built-in: " + res2);
    }
}


# 2

import java.util.Scanner;
class SubstringCompare {
    static String substringUsingCharAt(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) sub += s.charAt(i);
        return sub;
    }
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = substringUsingCharAt(s, start, end);
        String sub2 = s.substring(start, end);
        boolean res = compare(sub1, sub2);
        System.out.println("User-defined substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Are equal: " + res);
    }
}


# 3

import java.util.Scanner;
class ToCharArrayCompare {
    static char[] toCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }
    static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr1 = toCharArray(s);
        char[] arr2 = s.toCharArray();
        boolean res = compare(arr1, arr2);
        System.out.println("Equal: " + res);
    }
}


# 4

class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}


# 5

import java.util.Scanner;
class StringIndexDemo {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }
    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // generateException(s);
        handleException(s);
    }
}


# 6

import java.util.Scanner;
class IllegalArgDemo {
    static void generateException(String s) {
        System.out.println(s.substring(5, 2));
    }
    static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // generateException(s);
        handleException(s);
    }
}


# 7

import java.util.Scanner;
class NumberFormatDemo {
    static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println(num);
    }
    static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // generateException(s);
        handleException(s);
    }
}


# 8

import java.util.Scanner;
class ArrayIndexDemo {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }
    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        // generateException(arr);
        handleException(arr);
    }
}


# 9

import java.util.Scanner;
class UppercaseCompare {
    static String toUpper(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') res += (char)(c - 32);
            else res += c;
        }
        return res;
    }
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String manual = toUpper(s);
        String builtin = s.toUpperCase();
        System.out.println("Equal: " + compare(manual, builtin));
    }
}


# 10

import java.util.Scanner;
class LowercaseCompare {
    static String toLower(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') res += (char)(c + 32);
            else res += c;
        }
        return res;
    }
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String manual = toLower(s);
        String builtin = s.toLowerCase();
        System.out.println("Equal: " + compare(manual, builtin));
    }
}

