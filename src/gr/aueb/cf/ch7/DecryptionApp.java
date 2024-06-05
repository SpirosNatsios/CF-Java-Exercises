package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Αντικαθιστά κάθε χαρακτήρα απο ένα String που δίνει
 * ο χρήστης με το λεξικογραφικά (ASCII-κογραφικά) προηγούμενο
 */

public class DecryptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";

        System.out.println("Please enter a string to decrypt");
        str = in.nextLine();

        System.out.println("The decrypted string is: " + decryptString(str));
    }

    public static String decryptString(String s) {
        int[]  asciiArr = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            asciiArr[i] = (int) s.charAt(i) - 1;
            sb.append((char) asciiArr[i]);
        }
        return sb.toString();
    }
}