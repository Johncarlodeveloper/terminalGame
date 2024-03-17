import java.util.Scanner;

class mechanics {
    String playerName, letterChoice;
    int row, column, numChoice, playerScore;
    static int grids;
    static String[][] table;

    void trackRowColumn() {
        int count = 1;
        for (int i = 2; i < grids - 2; i++) {
            for (int j = 2; j < grids - 2; j++) {
                if (numChoice == count) {
                    row = i;
                    column = j;
                }
                count++;
            }
        }
    }

    void swap() {
        table[row][column] = letterChoice;
    }

    void check_match() {
        if (letterChoice.equals("O ")) {
            if (table[row][column - 1].equals("S ") && table[row][column - 1].equals(table[row][column + 1])) {
                playerScore++;
            }
            if (table[row - 1][column].equals("S ") && table[row - 1][column].equals(table[row + 1][column])) {
                playerScore++;
            }
            if (table[row - 1][column - 1].equals("S ")
                    && table[row - 1][column - 1].equals(table[row + 1][column + 1])) {
                playerScore++;
            }
            if (table[row - 1][column + 1].equals("S ")
                    && table[row - 1][column + 1].equals(table[row + 1][column - 1])) {
                playerScore++;
            }

        } else if (letterChoice.equals("S ")) {
            if (table[row - 2][column - 2].equals("S ") && table[row - 1][column - 1].equals("O ")) {
                playerScore++;
            }
            if (table[row - 2][column].equals("S ") && table[row - 1][column].equals("O ")) {
                playerScore++;
            }
            if (table[row - 2][column + 2].equals("S ") && table[row - 1][column + 1].equals("O ")) {
                playerScore++;
            }
            if (table[row][column - 2].equals("S ") && table[row][column - 1].equals("O ")) {
                playerScore++;
            }
            if (table[row][column + 2].equals("S ") && table[row][column + 1].equals("O ")) {
                playerScore++;
            }
            if (table[row + 2][column - 2].equals("S ") && table[row + 2][column - 1].equals("O ")) {
                playerScore++;
            }
            if (table[row - 2][column].equals("S ") && table[row][column - 1].equals("O ")) {
                playerScore++;
            }
            if (table[row + 2][column + 2].equals("S ") && table[row + 1][column + 1].equals("O ")) {
                playerScore++;
            }
        }
    }
}

public class playSOS {
    public static Scanner sc = new Scanner(System.in);
    public static int game_over = 0;
    public static int x = 0;

    public static void main(String[] args) {
        String end;
        do {
            mechanics playerOne = new mechanics(); // create an object for player one
            System.out.print("Player 1's name --->: "); // ask player 1's name
            playerOne.playerName = sc.nextLine(); // reference object to instance variable playerName
            mechanics playerTwo = new mechanics();// create an object for player two
            System.out.print("Player 2's name --->: "); // ask player 2's name
            playerTwo.playerName = sc.nextLine(); // reference object to instance variable playerName
            System.out.print("Grid choice: "); // ask grid choice
            mechanics.grids = sc.nextInt(); // update grids number
            mechanics.grids += 4; // add shadow cells
            initialize_table(playerOne, playerTwo); // create the table
            print_table(playerOne, playerTwo); // print the un shadowed table
            while (x != 1) { // play the game until there is no cells left to pick
                ask_user(playerOne, playerTwo); // call ask_user method
            }
            if (playerOne.playerScore > playerTwo.playerScore) { // determine the winner depending on the scores
                System.out.println(playerOne.playerName + " wins!");
            } else if (playerTwo.playerScore > playerOne.playerScore) {
                System.out.println(playerTwo.playerName + " wins!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.print("Play Again? -->[y/n]: "); // play again option
            end = sc.nextLine();
            if (end.equals("y")) {
                playerOne.playerScore = playerTwo.playerScore = x = game_over = 0;
            }
        } while (end.equals("y")); // repeat game if responded yes

    }

    public static void initialize_table(mechanics playerOne, mechanics playerTwo) { // object parameters
        mechanics.table = new String[mechanics.grids][mechanics.grids]; // memory allocation for 2d array
        int nums = 1;
        for (int i = 0; i < mechanics.grids; i++) {
            String strnum = " ";
            for (int j = 0; j < mechanics.grids; j++) {
                if ((i >= 2 && i < mechanics.grids - 2) && (j >= 2 && j < mechanics.grids - 2)) {
                    if (nums < 10) {
                        strnum = Integer.toString(nums);
                        mechanics.table[i][j] = "0" + strnum;
                    } else {
                        strnum = Integer.toString(nums);
                        mechanics.table[i][j] = strnum;
                    }
                    nums++;
                } else {
                    mechanics.table[i][j] = "X ";
                }

            }
        }
    }

    public static void print_table(mechanics playerOne, mechanics playerTwo) {
        System.out.println();
        for (int i = 2; i < mechanics.grids - 2; i++) {
            for (int j = 2; j < mechanics.grids - 2; j++) {
                System.out.print(" " + mechanics.table[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println();
    }

    public static void ask_user(mechanics playerOne, mechanics playerTwo) {
        int score1;
        do {
            if (game_over == (mechanics.grids - 4) * (mechanics.grids - 4)) {
                x = 1;
                return;
            } // check if there is no cells left to pick by player
            System.out.print("Pick a number " + playerOne.playerName + " -->: ");
            playerOne.numChoice = sc.nextInt();
            game_over++;
            playerOne.trackRowColumn();
            sc.nextLine();
            System.out.println(">> Include a space after entering S/O <<");
            System.out.print("Enter a letter-->[S/O]; ");
            playerOne.letterChoice = sc.nextLine();
            playerOne.swap();
            print_table(playerOne, playerTwo);
            score1 = playerOne.playerScore;
            playerOne.check_match();
            System.out.println("P1: " + playerOne.playerScore);
        } while (score1 < playerOne.playerScore);

        int score2;
        do {
            if (game_over == (mechanics.grids - 4) * (mechanics.grids - 4)) {
                x = 1;
                return;
            }
            System.out.print("Pick a number " + playerTwo.playerName + " -->: ");
            playerTwo.numChoice = sc.nextInt();
            game_over++;
            playerTwo.trackRowColumn();
            sc.nextLine();
            System.out.println(">> Include a space after entering S/O <<");
            System.out.print("Enter a letter-->[S/O]: ");
            playerTwo.letterChoice = sc.nextLine();
            playerTwo.swap();
            score2 = playerTwo.playerScore;
            print_table(playerOne, playerTwo);
            playerTwo.check_match();
            System.out.println("P2: " + playerTwo.playerScore);
        } while (score2 < playerTwo.playerScore);
    }
}
