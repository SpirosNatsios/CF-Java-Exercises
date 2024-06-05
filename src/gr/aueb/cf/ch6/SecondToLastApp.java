package gr.aueb.cf.ch6;

import java.util.Arrays;

public class SecondToLastApp {

    public static void main(String[] args) {
        int[] arr = {12, 33, 2, 4, 43, 1, 32};
        int secondToLast = findSecondToLastMax(arr);

        System.out.println("The second to last Max value is: " + secondToLast);
        System.out.println(arr[1]);
    }

    public static int findSecondToLastMax(int[] arr) {
        int[] copyOfArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyOfArray);

        return copyOfArray[1];
    }
}
