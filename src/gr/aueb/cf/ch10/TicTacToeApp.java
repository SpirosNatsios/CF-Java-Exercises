package gr.aueb.cf.ch10;

import java.util.Scanner;

public class TicTacToeApp {
    static int playerXsum = 0;
    static int playerOsum = 0;
    static char[] grid = { '7', '8', '9', '4', '5', '6', '1', '2', '3' };
    static char currentPlayer = 'X';
    static boolean gridUpdated;
    static int countPlays = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;
        do {
            clearScreen();
            showGrid();

            int choice = readFromUser(scanner);
            updateGrid(choice);
            if (gridUpdated) {
                addScoreToVariables(choice);
                if (checkWinner()) {
                    isPlaying = false;
                } else {
                    switchPlayer();
                    gridUpdated = false;
                }
            }
        } while (isPlaying);
        clearScreen();
        announceResults();
    }

    static boolean checkWinner() {
        if (countPlays > 4) {
            if (currentPlayer == 'X') {
                if ((playerXsum % 6 == 0) || playerXsum == 15) {
                    return true;
                }
            } else {
                if ((playerOsum % 6 == 0) || playerOsum == 15) {
                    return true;
                }
            }
        }
        return countPlays == 9;
    }

    static void addScoreToVariables(int choice) {
        if (currentPlayer == 'X') {
            playerXsum += choice;
            System.out.println(playerXsum);
        } else {
            playerOsum += choice;
            System.out.println(playerOsum);
        }
    }

    static void showGrid() {
        System.out.println("\t|------------|");
        System.out.println("\t   |" + grid[0] + " " + grid[1] + " " + grid[2] + "|");
        System.out.println("\t   |" + grid[3] + " " + grid[4] + " " + grid[5] + "|");
        System.out.println("\t   |" + grid[6] + " " + grid[7] + " " + grid[8] + "|");
        System.out.println("\t|------------|");
    }

    static void updateGrid(int choice) {
        char c = (char) (choice + '0');
        for (int i = 0; i < grid.length; i++) {
            if (grid[i] == c) {
                grid[i] = currentPlayer;
                gridUpdated = true;
                countPlays++;
                return;
            }
        }
        System.out.println("Cell already occupied. Please select a different cell.");
        gridUpdated = false;
    }

    static int readFromUser(Scanner scanner) {
        String input = "";
        int result = 0;
        System.out.println(currentPlayer + " Plays");
        input = scanner.nextLine();
        while (!input.matches("[1-9]")) {
            System.out.println("please select an integer from 1 to 9");
            input = scanner.nextLine();
        }
        result = Integer.parseInt(input);
        return result;
    }

    static void switchPlayer() {
        if (gridUpdated) {
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
    }

    static void announceResults() {
        if (countPlays == 9) {
            System.out.println("[~][~][~][~][~][~][~][~][~][~]");
            System.out.println("\t  It's a draw! ");
            showGrid();
            System.out.println("[~][~][~][~][~][~][~][~][~][~]");
        } else {
            System.out.println("[~][~][~][~][~][~][~][~][~][~]");
            System.out.println("\t Player " + currentPlayer + " Wins ");
            showGrid();
            System.out.println("[~][~][~][~][~][~][~][~][~][~]");

            System.out.println("playerX :" + playerXsum);
            System.out.println("playerO :" + playerOsum);
        }
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}