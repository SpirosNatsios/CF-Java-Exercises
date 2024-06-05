package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayMethodsApp {

    public static void main(String[] args) {
        int[] arr = {4, 14, 32, 65, 7, 23, -90};
        int value = 32;

        System.out.println("The value you search for is in position: " + searchArray(arr, value) + 1);

        System.out.println("The Array has these even numbers:");
        findEven(arr);
        System.out.println();

        System.out.println("All the elements doubled: ");
        traverse(arrayDouble(arr));
        System.out.println();

        System.out.println("There is one positive: " + hasPositive(arr));

        System.out.println("All are positives: " + hasAllPositives(arr));
    }

    public static int searchArray(int[] arr, int value) {
        int positiontoReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positiontoReturn = i;
                break;
            }
        }
        return positiontoReturn;
    }

    public static void findEven(int[] arr) {
        int count = 0;

        for (int even: arr) {
            if (even % 2 == 0) {
                count++;
            }
        }

        int[] evensArray = new int[count];
        count = 0;

        for (int even: arr) {
            if (even % 2 == 0) {
                evensArray[count] = even;
                count++;
            }
        }

        traverse(evensArray);
    }

    public static int[] arrayDouble(int[] arr) {
        int[] arrayToReturn = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    public static boolean hasPositive(int[] arr) {
        boolean hasPositive = false;

        for (int el: arr) {
            if (el > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean hasAllPositives(int[] arr) {
        boolean hasAllPositives = false;
        int count = 0;

        for (int el: arr) {
            if (el > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static void traverse(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}


