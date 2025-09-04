#1

import java.util.Scanner;

public class CompareStrings {
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        
        boolean customResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);
        
        System.out.println("Custom compare result: " + customResult);
        System.out.println("Built-in equals() result: " + builtInResult);
    }
}



#2

import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    // Method to compare strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        String customSub = customSubstring(str, start, end);
        String builtInSub = str.substring(start, end);
        
        System.out.println("Custom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both equal? " + compareStrings(customSub, builtInSub));
    }
}


#3

import java.util.Scanner;

public class CharArrayComparison {
    
    // Method to convert String to char array manually
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    
    // Method to compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        char[] customArr = customToCharArray(str);
        char[] builtInArr = str.toCharArray();
        
        System.out.println("Are both char arrays equal? " + compareArrays(customArr, builtInArr));
    }
}


#4

public class NullPointerDemo {
    
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }
    
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }
    
    public static void main(String[] args) {
        //generateException(); // Uncomment to see crash
        handleException();
    }
}


#5

import java.util.Scanner;

public class StringIndexDemo {
    
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // invalid index
    }
    
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        //generateException(str);
        handleException(str);
    }
}


#6

import java.util.Scanner;

public class IllegalArgumentDemo {
    
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2)); // start > end
    }
    
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        //generateException(str);
        handleException(str);
    }
}


#7

import java.util.Scanner;

public class NumberFormatDemo {
    
    public static void generateException(String str) {
        int num = Integer.parseInt(str); // If str is not number -> exception
        System.out.println(num);
    }
    
    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.next();
        
        //generateException(str);
        handleException(str);
    }
}


#8

import java.util.Scanner;

public class ArrayIndexDemo {
    
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }
    
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        //generateException(arr);
        handleException(arr);
    }
}



#9

import java.util.Scanner;

public class UppercaseConversion {
    
    public static String customToUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }
    
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        
        String customUpper = customToUpper(str);
        String builtInUpper = str.toUpperCase();
        
        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + compareStrings(customUpper, builtInUpper));
    }
}


#10

import java.util.Scanner;

public class LowercaseConversion {
    
    public static String customToLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
            } else {
                result += c;
            }
        }
        return result;
    }
    
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        
        String customLower = customToLower(str);
        String builtInLower = str.toLowerCase();
        
        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Are both equal? " + compareStrings(customLower, builtInLower));
    }
}
