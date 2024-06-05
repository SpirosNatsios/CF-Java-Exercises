package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Βρίσκει σε ένα parking τον μέγιστο αριθμό αυτοκινήτων
 * που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
 */
public class ConcurrentParkingApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1416}, {1317, 1417}, {1015, 1020}};

        int maxCount = findMaxConcurrentParking(arr);
        System.out.println("Ο μέγιστος αριθμός ταυτόχρονων σταθμεύσεων είναι: " + maxCount);
    }

    /**
     * Βρίσκει τον μέγιστο αριθμό ταυτόχρονων σταθμεύσεων.
     *
     * @param arr Ο πίνακας με τις ώρες σταθμεύσεων.
     * @return Ο μέγιστος αριθμός ταυτόχρονων σταθμεύσεων.
     */
    public static int findMaxConcurrentParking(int[][] arr) {
        int[][] newArr = convertToSortedArray(arr);
        return countMaxConcurrentParking(newArr);
    }

    /**
     * Δημιουργεί έναν καινούργιο πίνακα οπού σε κάθε γραμμή υπάρχει
     * η ωρα και ενας δείκτης άφιξης/αναχώρησης ({1012}{0/1})
     * καθως επίσης τον ταξινωμεί σε αύξουσα σειρά βάση την ώρα άφιξης
     *
     * @param arr Ο αρχικός πίνακας με τις ώρες σταθμεύσεων.
     * @return Ο ταξινομημένος πίνακας με τις ώρες και τις αφήξεις/αναχωρήσεις.
     */
    private static int[][] convertToSortedArray(int[][] arr) {
        int[][] newArr = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            newArr[2*i][0] = arr[i][0];
            newArr[2*i][1] = 0;
            newArr[2*i + 1][0] = arr[i][1];
            newArr[2*i + 1][1] = 1;
        }

        Arrays.sort(newArr, Comparator.comparingInt(a -> a[0]));

        return newArr;
    }

    /**
     * Υπολογίζει τον μέγιστο αριθμό ταυτόχρονων σταθμεύσεων βασιζόμενος στον ταξινομημένο πίνακα.
     *
     * @param newArr Ο ταξινομημένος πίνακας με τις ώρες και τις αφήξεις/αναχωρήσεις.
     * @return Ο μέγιστος αριθμός ταυτόχρονων σταθμεύσεων.
     */
    private static int countMaxConcurrentParking(int[][] newArr) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int[] item : newArr) {
            if (item[1] == 0) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    continue;
                }
            }
            if (item[1] == 1) {
                count--;
            }
        }
        return maxCount;
    }
}
