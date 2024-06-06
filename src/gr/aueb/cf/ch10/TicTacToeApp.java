package gr.aueb.cf.ch10;

import java.util.Scanner;

public class TicTacToeApp {
    static char[] grid = {'7', '8', '9', '4', '5', '6', '1', '2', '3'};
    static char currentPlayer = 'X';
    static boolean gridUpdated = false;
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
                if (checkWinner()) {
                    isPlaying = false;
                } else {
                    switchPlayer();
                }
            }
        } while (isPlaying);
        clearScreen();
        announceResults();
    }

    public static boolean checkWinner() {
        for (int i = 0; i < 9; i += 3) {
            if (grid[i] == currentPlayer && grid[i + 1] == currentPlayer && grid[i + 2] == currentPlayer) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (grid[i] == currentPlayer && grid[i + 3] == currentPlayer && grid[i + 6] == currentPlayer) {
                return true;
            }
        }
        if ((grid[0] == currentPlayer && grid[4] == currentPlayer && grid[8] == currentPlayer) ||
                (grid[2] == currentPlayer && grid[4] == currentPlayer && grid[6] == currentPlayer)) {
            return true;
        }
        return countPlays == 9;
    }


    public static void showGrid() {
        System.out.println("\t|------------|");
        System.out.println("\t   |" + grid[0] + " " + grid[1] + " " + grid[2] + "|");
        System.out.println("\t   |" + grid[3] + " " + grid[4] + " " + grid[5] + "|");
        System.out.println("\t   |" + grid[6] + " " + grid[7] + " " + grid[8] + "|");
        System.out.println("\t|------------|");
    }

    public static void updateGrid(int choice) {
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

    public static int readFromUser(Scanner scanner) {
        String input;
        int result;
        System.out.println(currentPlayer + " Plays");
        input = scanner.nextLine();
        while (!input.matches("[1-9]")) {
            System.out.println("Please select an integer from 1 to 9.");
            input = scanner.nextLine();
        }
        result = Integer.parseInt(input);
        return result;
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static void announceResults() {
        System.out.println("[~][~][~][~][~][~][~][~][~][~]");
        if (countPlays == 9) {
            System.out.println("\tIt's a draw!");
            showGrid();
        } else {
            System.out.println("\tPlayer " + currentPlayer + " wins!");
            showGrid();
        }
        System.out.println("[~][~][~][~][~][~][~][~][~][~]");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
