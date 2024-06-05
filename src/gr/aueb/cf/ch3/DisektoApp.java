package gr.aueb.cf.ch3;

import java.util.Scanner;

import static java.lang.System.in;

public class DisektoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a year");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
