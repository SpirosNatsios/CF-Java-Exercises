package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει αστεράκια σύμφωνα με τις επιλογές του χρήστη
 * Ο χρήστης επιλέγει πως θα εμφανιστούν τα αστεράκια,
 * (Οριζόντια, Κάθετα, ν*ν, 1-ν, ν-1),
 * και το ν των αστερίων
 */

public class PrintStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int stars = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (choice != 6 && (choice >= 1 && choice <= 6) )  {
                System.out.println("Δώστε αριθμό stars");
                stars = in.nextInt();
            }

            switch (choice) {
                case 1:
                    printHorizontalStars(stars);
                    break;
                case 2:
                    printVerticalStars(stars);
                    break;
                case 3:
                    printNxNStars(stars);
                    break;
                case 4:
                    print1NStars(stars);
                    break;
                case 5:
                    printN1Stars(stars);
                    break;
                case 6:
                    System.out.println("Ευχαριστούμε");
                    break;
                default:
                    System.out.println("Η επιλογή είναι εκτός ορίων");
                    break;
            }
        } while (choice != 6);
    }

    /**
     * Εμφανίζει ν αστεράκια οριζόντια
     * @param stars το πλήθος των αστερίων που έδωσε ο χρήστης
     */
    public static void printHorizontalStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    /**
     * Εμφανίζει ν αστεράκια κάθετα
     * @param stars το πλήθος των αστερίων που έδωσε ο χρήστης
     */
    public static void printVerticalStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }

    /**
     * Εμφανίζει ν αστεράκια και οριζόντια και κάθετα
     * @param stars το πλήθος των αστερίων που έδωσε ο χρήστης
     */
    public static void printNxNStars(int stars){
        for (int i = 1; i <= stars; i++) {
            printHorizontalStars(stars);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει τα αστεράκια ξεκινώντας απο 1 μέχρι ν
     * @param stars το πλήθος των αστερίων που έδωσε ο χρήστης
     */
    public static void print1NStars(int stars){
        for (int i = 1; i <= stars; i++) {
            printHorizontalStars(i);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει τα αστεράκια ξεκινώντας απο ν μέχρι 1
     * @param stars το πλήθος των αστερίων που έδωσε ο χρήστης
     */
    public static void printN1Stars(int stars){
        for (int i = stars; i >= 1; i--) {
            printHorizontalStars(i);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει το μενου επιλόγών
     */
    public static void printMenu() {
        System.out.println("\n1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }
}
