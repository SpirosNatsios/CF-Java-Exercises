package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExceptionsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while(true) {
            printMenu();

            try {
                choice = getChoice(in);

                if (choice == 5) {
                    printChoice(choice);
                    break;
                }
                printChoice(choice);

            } catch (InputMismatchException e) {
                System.out.println("Παρακαλώ δώστε έναν ακέραιο αριθμό");
                in.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Παρακαλώ δώστε έναν αριθμό μεταξύ 1-5");
            }
        }
        in.close();
    }

    public static void printMenu() {
        System.out.println("Κάντε μια επιλογή");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice(Scanner in) throws InputMismatchException {
        if (!in.hasNextInt()) {
            throw new InputMismatchException();
        }
        return in.nextInt();
    }

    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException();
        }

        if (choice == 5) {
            System.out.println("Έξοδος");
        } else {
            System.out.println("Επιλέξατε την επιλογή " + choice);
        }
    }
}
