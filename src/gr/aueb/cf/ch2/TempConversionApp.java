package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TempConversionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please give a temperature in Fahrenheit");
        fahrenheit = scanner.nextInt();


        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("The temperature in Celsius is %d", celsius);

    }
}
