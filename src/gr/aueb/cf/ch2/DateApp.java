package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int twoDigitYear = 0;

        System.out.println("Please insert the day of the month");
        day = scanner.nextInt();

        System.out.println("Please insert the month");
        month = scanner.nextInt();

        System.out.println("Please insert the year");
        year = scanner.nextInt();;

        twoDigitYear = year % 100;

        System.out.printf("%02d/%02d/%2d", day, month, twoDigitYear);

    }
}
