import java.util.Scanner;

public class tictactoe {
    public static Scanner sc = new Scanner(System.in);
    // set false as default indicating there is still slot left
    public static boolean[][] check = { { false, false, false }, { false, false, false }, { false, false, false } };
    public static String[][] places = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
    public static String choice = "0";
    public static String player = "X";
    public static int x = 0;

    public static void main(String[] args) {
        System.out.print("Enter player X's name: ");
        String xName = sc.nextLine();
        System.out.print("Enter player O's name: ");
        String oName = sc.nextLine();
        int countMoves = 0;
        while (x != 1 && countMoves < 9) {
            printTable();
            askNumber();
            checkPattern();
            countMoves++;
            System.out.println();
        }
        if (x == 1) {
            if (player.equals("O")) {
                printTable();
                System.out.println(xName + " wins!");
            } else if (player.equals("X")) {
                printTable();
                System.out.println(oName + " wins!");
            }
        } else {
            System.out.println("It's a Tie!");
        }

    }

    public static void askNumber() {
        if (player.equals("X")) {
            do {
                System.out.print("Player X's turn --->: ");
                choice = sc.nextLine();

            } while (!(choice.equals("1") && (checkCheck(choice) == 0)
                    || choice.equals("2") && (checkCheck(choice) == 0)
                    || choice.equals("3") && (checkCheck(choice) == 0)
                    || choice.equals("4") && (checkCheck(choice) == 0)
                    || choice.equals("5") && (checkCheck(choice) == 0)
                    || choice.equals("6") && (checkCheck(choice) == 0)
                    || choice.equals("7") && (checkCheck(choice) == 0)
                    || choice.equals("8") && (checkCheck(choice) == 0)
                    || choice.equals("9") && (checkCheck(choice) == 0)));
        }
        if (player.equals("O")) {
            do {
                System.out.print("Player Y's turn --->: ");
                choice = sc.nextLine();

            } while (!(choice.equals("1") && (checkCheck(choice) == 0)
                    || choice.equals("2") && (checkCheck(choice) == 0)
                    || choice.equals("3") && (checkCheck(choice) == 0)
                    || choice.equals("4") && (checkCheck(choice) == 0)
                    || choice.equals("5") && (checkCheck(choice) == 0)
                    || choice.equals("6") && (checkCheck(choice) == 0)
                    || choice.equals("7") && (checkCheck(choice) == 0)
                    || choice.equals("8") && (checkCheck(choice) == 0)
                    || choice.equals("9") && (checkCheck(choice) == 0)));
        }

        if (choice.equals("1")) {
            updateTable();
        }
        if (choice.equals("2")) {
            updateTable();
        }
        if (choice.equals("3")) {
            updateTable();
        }
        if (choice.equals("4")) {
            updateTable();
        }
        if (choice.equals("5")) {
            updateTable();
        }
        if (choice.equals("6")) {
            updateTable();
        }
        if (choice.equals("7")) {
            updateTable();
        }
        if (choice.equals("8")) {
            updateTable();
        }
        if (choice.equals("9")) {
            updateTable();
        }
    }

    public static int checkCheck(String choice) {
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[0].length; j++) {
                if (choice.equals(places[i][j])) {
                    if (check[i][j] == false) {
                        return 0; // if true, there is slot
                    }
                }
            }
        }
        return 1; // if false there is no slot
    }

    public static void updateTable() {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                if (choice.equals(places[i][j])) {
                    if (player.equals("X")) {
                        places[i][j] = "X";
                        player = "O";
                    } else if (player.equals("O")) {
                        places[i][j] = "O";
                        player = "X";
                    }

                }
            }
        }
    }

    public static void printTable() {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                System.out.print(places[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int checkPattern() {
        if (player.equals("O")) {
            if (places[0][0].equals("X") && places[0][1].equals("X") && places[0][2].equals("X")) {
                x = 1;
                return x;
            }
            if (places[1][0].equals("X") && places[1][1].equals("X") && places[1][2].equals("X")) {
                x = 1;
                return x;
            }
            if (places[2][0].equals("X") && places[2][1].equals("X") && places[2][2].equals("X")) {
                x = 1;
                return x;
            }

            if (places[0][0].equals("X") && places[1][0].equals("X") && places[2][0].equals("X")) {
                x = 1;
                return x;
            }
            if (places[0][1].equals("X") && places[1][1].equals("X") && places[2][1].equals("X")) {
                x = 1;
                return x;
            }
            if (places[0][2].equals("X") && places[1][2].equals("X") && places[2][2].equals("X")) {
                x = 1;
                return x;
            }

            if (places[0][0].equals("X") && places[1][1].equals("X") && places[2][2].equals("X")) {
                x = 1;
                return x;
            }
            if (places[0][2].equals("X") && places[1][1].equals("X") && places[2][0].equals("X")) {
                x = 1;
                return x;
            }

        }
        if (player.equals("X")) {
            if (places[0][0].equals("O") && places[0][1].equals("O") && places[0][2].equals("O")) {
                x = 1;
                return x;
            }
            if (places[1][0].equals("O") && places[1][1].equals("O") && places[1][2].equals("O")) {
                x = 1;
                return x;
            }
            if (places[2][0].equals("O") && places[2][1].equals("O") && places[2][2].equals("O")) {
                x = 1;
                return x;
            }

            if (places[0][0].equals("O") && places[1][0].equals("O") && places[2][0].equals("O")) {
                x = 1;
                return x;
            }
            if (places[0][1].equals("O") && places[1][1].equals("O") && places[2][1].equals("O")) {
                x = 1;
                return x;
            }
            if (places[0][2].equals("O") && places[1][2].equals("O") && places[2][2].equals("O")) {
                x = 1;
                return x;
            }

            if (places[0][0].equals("O") && places[1][1].equals("O") && places[2][2].equals("O")) {
                x = 1;
                return x;
            }
            if (places[0][2].equals("O") && places[1][1].equals("O") && places[2][0].equals("O")) {
                x = 1;
                return x;
            }

        }
        return 0;
    }

}
