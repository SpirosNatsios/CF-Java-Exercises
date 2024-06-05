package gr.aueb.cf.ch6;

import java.util.Scanner;

public class PredicatesExerciseApp {

    public static void main(String[] args) {
        int[] arr = new int[6];
        final int THRESHOLD = 3;
        populateArray(arr);
        traverse(arr);


        System.out.println("Δεν έχει πάνω απο 3 άρτιους: " + are3Even(arr, THRESHOLD));
        System.out.println("Δεν έχει πάνω από 3 περιττούς: " + are3Odd(arr, THRESHOLD));
        System.out.println("Δεν έχει πάνω από 3 συνεχόμενους: " + are3InSequence(arr, THRESHOLD));
        System.out.println("Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα: " + are3SameEnding(arr, THRESHOLD));
        System.out.println("Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα : " + are3SameTens(arr, THRESHOLD));
    }

    public static boolean are3Even(int[] arr, int threshold) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0 ) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean are3Odd(int[] arr, int threshold) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 != 0 ) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean are3InSequence(int[] arr, int threshold) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean are3SameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = true;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item > threshold) {
                sameEnding = false;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean are3SameTens(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = true;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item > threshold) {
                sameTen = false;
                break;
            }
        }
        return sameTen;
    }

    public static void populateArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Δώστε 6 ακεραίους ");

        for (int i = 0; i < 6; i++) {
            System.out.printf("%dος:", i + 1);
            arr[i] = in.nextInt();
            if (arr[i] < 1 || arr[i] > 49){
                System.out.println("Εκτός Ορίων");
                i--;
            }

        }
    }

    public static void traverse(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

}
