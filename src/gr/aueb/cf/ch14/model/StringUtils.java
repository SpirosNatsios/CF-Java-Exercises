package gr.aueb.cf.ch14.model;

public class StringUtils {

    private StringUtils() {

    }

    public static String reverseString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The string must not be null");
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static String upperCaseString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The string must not be null");
        }
        return s.toUpperCase();
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The string must not be null");
        }

        String upperCaseString = upperCaseString(s);
        return upperCaseString.equals(reverseString(upperCaseString));
    }
}

