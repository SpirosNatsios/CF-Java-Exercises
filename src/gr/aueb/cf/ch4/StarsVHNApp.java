package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsVHNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choiceH = 0;
        int choiceV = 0;

        System.out.println("Please insert the number of horizontal stars");
        choiceH = in.nextInt();

        System.out.println("Please insert the number of vertical stars");
        choiceV = in.nextInt();

        for (int i = 1; i <= choiceV; i++) {
            for (int j = 1; j <= choiceH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
