package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsNDesc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please insert the number of stars");
        choice = in.nextInt();

        for (int i = 1; i <= choice; i++){
            for (int j = choice; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
