package gr.aueb.cf.ch14.model;

public class ValidationUtils {

    private ValidationUtils() {

    }

    public static boolean isStringLengthValid(String s) {
        return s.length() >= 1 && s.length() <= 31;
    }

    public static boolean isNumberInRange(int num) {
        return num >= 1 && num <= 10;
    }
}
