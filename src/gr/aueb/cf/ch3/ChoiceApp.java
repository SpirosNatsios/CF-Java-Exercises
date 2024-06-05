package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ChoiceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Please select one of the options below");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();

           if (choice < 0 || choice > 5 ){
               System.out.println("Επιλογή εκτός ορίων");
               continue;
           }

           if (choice == 1){
               System.out.println("Επιλέξατε εισαγωγή");
           } else if (choice == 2){
               System.out.println("Επιλέξατε Ενημέρωση");
           } else if (choice == 3){
               System.out.println("Επιλέξατε Διαγραφή");
           } else if (choice == 4){
               System.out.println("Επιλέξατε Αναζήτηση");
           } else {
               System.out.println("Ευχαριστούμε για την προτίμηση");
           }


        } while(choice != 5);

    }
}

