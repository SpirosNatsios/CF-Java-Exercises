package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsVNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please insert the number of vertical stars");
        choice = in.nextInt();

        for (int i = 1; i <= choice; i++) {
            System.out.println("*");
        }
    }
}
