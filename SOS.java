import java.util.Scanner;

public class SOS {
    public static Scanner sc = new Scanner(System.in);
    public static String[][] nums = { { "01", "02", "03", "04", "05" }, { "06", "07", "08", "09", "10" },
            { "11", "12", "13", "14", "15" },
            { "16", "17", "18", "19", "20" }, { "21", "22", "23", "24", "25" } };
    public static boolean[][] places = { { false, false, false, false, false }, { false, false, false, false, false },
            { false, false, false, false, false }, { false, false, false, false, false },
            { false, false, false, false, false } };
    public static String xName;
    public static String yName;
    public static int xScore = 0;
    public static int yScore = 0;
    public static int chosenTurn = 0; // zero for player X and 1 for player Y
    public static String numChoice = "x";
    public static String letterChoice;
    public static int flagX = 0;
    public static int flagY = 0;
    public static int endFlag = 1;
    public static int count = 0;

    public static void main(String[] args) {
        System.out.print("X player's name --->: ");
        xName = sc.nextLine();
        System.out.print("Y player's name --->: ");
        yName = sc.nextLine();

        System.out.println();
        welcome();
        System.out.println();

        printTable();

        System.out.println();
        while (count < 25) {

            xTurn();
            System.out.println();
            yTurn();
        }

        System.out.println(xName + " got " + xScore + "!");
        System.out.println(yName + " got " + yScore + "!");

        System.out.println();
        if (xScore > yScore) {
            System.out.println(xName + " wins!");
        } else if (yScore > xScore) {
            System.out.println(yName + " wins!");
        } else {
            System.out.println("It's a tie.");
        }

    }

    public static void printtruefalse() {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                System.out.println(places[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTable() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + "   ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void welcome() {
        System.out.println("Hello " + xName + " and " + yName + ", Welcome to SOS game!");
    }

    public static void xTurn() {

        while ((!(chosenTurn == 1)) && (count < 25)) {
            System.out.println("X : " + xScore);
            System.out.println("Y: " + yScore);
            System.out.println("Turn: " + chosenTurn);
            System.out.println("count: " + count);
            do {
                System.out.print(xName + "'s turn --->: ");
                numChoice = sc.nextLine();
            } while (!(checkPlace() == 0));

            System.out.print(xName + "'s turn [O/S] --->: ");
            letterChoice = sc.nextLine();
            System.out.println();

            printInside();

            checkPattern();
            printTable();
            if (flagX == 1) {
                chosenTurn = 1;
                flagX = 0;
            } else if (flagX == 0) {
                chosenTurn = 0;
            }
        }

    }

    public static void yTurn() {
        while ((!(chosenTurn == 0)) && (count < 25)) {
            System.out.println("X : " + xScore);
            System.out.println("Y: " + yScore);
            System.out.println("Turn: " + chosenTurn);
            System.out.println("count: " + count);
            do {
                System.out.print(yName + "'s turn --->: ");
                numChoice = sc.nextLine();
            } while (checkPlace() == 1);

            System.out.print(yName + "'s turn [O/S] --->: ");
            letterChoice = sc.nextLine();
            System.out.println();

            printInside();

            checkPattern();
            printTable();
            if (flagY == 1) {
                chosenTurn = 0;
                flagY = 0;
            } else if (flagY == 0) {
                chosenTurn = 1;
            }

        }

    }

    public static int checkPlace() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (numChoice.equals(nums[i][j])) {
                    if (places[i][j] == false) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public static void printInside() {
        if (numChoice.equals("01")) {
            nums[0][0] = letterChoice + " ";
            places[0][0] = true;
            count++;
        }
        if (numChoice.equals("02")) {
            nums[0][1] = letterChoice + " ";
            places[0][1] = true;
            count++;
        }
        if (numChoice.equals("03")) {
            nums[0][2] = letterChoice + " ";
            places[0][2] = true;
            count++;
        }
        if (numChoice.equals("04")) {
            nums[0][3] = letterChoice + " ";
            places[0][3] = true;
            count++;
        }
        if (numChoice.equals("05")) {
            nums[0][4] = letterChoice + " ";
            places[0][4] = true;
            count++;
        }
        if (numChoice.equals("06")) {
            nums[1][0] = letterChoice + " ";
            places[1][0] = true;
            count++;
        }
        if (numChoice.equals("07")) {
            nums[1][1] = letterChoice + " ";
            places[1][1] = true;
            count++;
        }
        if (numChoice.equals("08")) {
            nums[1][2] = letterChoice + " ";
            places[1][2] = true;
            count++;
        }
        if (numChoice.equals("09")) {
            nums[1][3] = letterChoice + " ";
            places[1][3] = true;
            count++;
        }
        if (numChoice.equals("10")) {
            nums[1][4] = letterChoice + " ";
            places[1][4] = true;
            count++;
        }
        if (numChoice.equals("11")) {
            nums[2][0] = letterChoice + " ";
            places[2][0] = true;
            count++;
        }
        if (numChoice.equals("12")) {
            nums[2][1] = letterChoice + " ";
            places[2][1] = true;
            count++;
        }
        if (numChoice.equals("13")) {
            nums[2][2] = letterChoice + " ";
            places[2][2] = true;
            count++;
        }
        if (numChoice.equals("14")) {
            nums[2][3] = letterChoice + " ";
            places[2][3] = true;
            count++;
        }
        if (numChoice.equals("15")) {
            nums[2][4] = letterChoice + " ";
            places[2][4] = true;
            count++;
        }
        if (numChoice.equals("16")) {
            nums[3][0] = letterChoice + " ";
            places[3][0] = true;
            count++;
        }
        if (numChoice.equals("17")) {
            nums[3][1] = letterChoice + " ";
            places[3][1] = true;
            count++;
        }
        if (numChoice.equals("18")) {
            nums[3][2] = letterChoice + " ";
            places[3][2] = true;
            count++;
        }
        if (numChoice.equals("19")) {
            nums[3][3] = letterChoice + " ";
            places[3][3] = true;
            count++;
        }
        if (numChoice.equals("20")) {
            nums[3][4] = letterChoice + " ";
            places[3][4] = true;
            count++;
        }
        if (numChoice.equals("21")) {
            nums[4][0] = letterChoice + " ";
            places[4][0] = true;
            count++;
        }
        if (numChoice.equals("22")) {
            nums[4][1] = letterChoice + " ";
            places[4][1] = true;
            count++;
        }
        if (numChoice.equals("23")) {
            nums[4][2] = letterChoice + " ";
            places[4][2] = true;
            count++;
        }
        if (numChoice.equals("24")) {
            nums[4][3] = letterChoice + " ";
            places[4][3] = true;
            count++;
        }
        if (numChoice.equals("25")) {
            nums[4][4] = letterChoice + " ";
            places[4][4] = true;
            count++;
        }

    }

    public static void checkPattern() {

        if (chosenTurn == 0) {
            int holdx = xScore;
            if (letterChoice.equals("S")) {
                if (numChoice.equals("01")) {
                    if ((nums[0][0].equals("S ")) && (nums[0][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        xScore++;

                    }
                    if ((nums[0][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;

                    }
                    if ((nums[0][0].equals("S ")) && (nums[1][0].equals("O ")) && (nums[2][0].equals("S "))) {
                        xScore++;
                    }

                }
                if (numChoice.equals("02")) {
                    if ((nums[0][1].equals("S ")) && (nums[0][2].equals("O ")) && (nums[0][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("03")) {
                    if ((nums[0][2].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[0][3].equals("O ")) && (nums[0][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[0][1].equals("O ")) && (nums[0][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][0].equals("S "))) {
                        xScore++;
                    }

                }
                if (numChoice.equals("04")) {
                    if ((nums[0][3].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][3].equals("S ")) && (nums[0][2].equals("O ")) && (nums[0][1].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("05")) {
                    if ((nums[0][4].equals("S ")) && (nums[0][3].equals("O ")) && (nums[0][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][4].equals("S ")) && (nums[1][4].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("06")) {
                    if ((nums[1][0].equals("S ")) && (nums[2][0].equals("O ")) && (nums[3][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("07")) {
                    if ((nums[1][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        xScore++;
                    }
                }

                if (numChoice.equals("08")) {
                    if ((nums[1][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[1][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("09")) {
                    if ((nums[1][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("10")) {
                    if ((nums[1][4].equals("S ")) && (nums[2][4].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[1][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("11")) {
                    if ((nums[2][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[1][0].equals("O ")) && (nums[0][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[3][0].equals("O ")) && (nums[4][0].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("12")) {
                    if ((nums[2][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[0][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("13")) {
                    if ((nums[2][2].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[1][2].equals("O ")) && (nums[0][2].equals("S"))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[0][4].equals("S"))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][0].equals("S"))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][2].equals("S"))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][4].equals("S"))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("14")) {
                    if ((nums[2][3].equals("S ")) && (nums[1][3].equals("O ")) && (nums[0][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[0][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("15")) {
                    if ((nums[2][4].equals("S ")) && (nums[1][4].equals("O ")) && (nums[0][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[0][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[3][4].equals("O ")) && (nums[4][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("16")) {
                    if ((nums[3][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][0].equals("S ")) && (nums[2][0].equals("O ")) && (nums[1][0].equals("S "))) {
                        xScore++;
                    }
                }

                if (numChoice.equals("17")) {
                    if ((nums[3][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][1].equals("S ")) && (nums[2][1].equals("O ")) && (nums[1][1].equals("S "))) {
                        xScore++;
                    }

                }
                if (numChoice.equals("18")) {
                    if ((nums[3][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[3][1].equals("O ")) && (nums[3][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[2][1].equals("O ")) && (nums[1][0].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("19")) {
                    if ((nums[3][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("19")) {
                    if ((nums[3][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("20")) {
                    if ((nums[3][4].equals("S ")) && (nums[2][4].equals("O ")) && (nums[1][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("21")) {
                    if ((nums[4][0].equals("S ")) && (nums[3][0].equals("O ")) && (nums[2][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][0].equals("S ")) && (nums[4][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("22")) {
                    if ((nums[4][1].equals("S ")) && (nums[3][1].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][1].equals("S ")) && (nums[4][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("23")) {
                    if ((nums[4][2].equals("S ")) && (nums[4][1].equals("O ")) && (nums[4][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[3][1].equals("O ")) && (nums[2][0].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[3][2].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[4][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("24")) {
                    if ((nums[4][3].equals("S ")) && (nums[4][2].equals("O ")) && (nums[4][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][3].equals("S ")) && (nums[3][3].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("25")) {
                    if ((nums[4][4].equals("S ")) && (nums[4][3].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[4][4].equals("S ")) && (nums[3][4].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }
                }

            }

            if (letterChoice.equals("O")) {

                if (numChoice.equals("02")) {
                    if ((nums[0][0].equals("S ")) && (nums[0][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("03")) {
                    if ((nums[0][1].equals("S ")) && (nums[0][2].equals("O ")) && (nums[0][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("04")) {
                    if ((nums[0][2].equals("S ")) && (nums[0][3].equals("O ")) && (nums[0][4].equals("S "))) {
                        xScore++;
                    }
                }

                if (numChoice.equals("06")) {
                    if ((nums[0][0].equals("S ")) && (nums[1][0].equals("O ")) && (nums[2][0].equals("S "))) {
                        xScore++;
                    }
                }

                if (numChoice.equals("07")) {
                    if ((nums[1][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("08")) {
                    if ((nums[0][2].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("09")) {
                    if ((nums[0][3].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[1][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("10")) {
                    if ((nums[0][4].equals("S ")) && (nums[1][4].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }

                }
                if (numChoice.equals("11")) {
                    if ((nums[1][0].equals("S ")) && (nums[2][0].equals("O ")) && (nums[3][0].equals("S "))) {
                        xScore++;
                    }

                }
                if (numChoice.equals("12")) {
                    if ((nums[1][1].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][0].equals("S "))) {
                        xScore++;
                    }

                }

                if (numChoice.equals("13")) {
                    if ((nums[1][2].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        xScore++;
                    }

                }
                if (numChoice.equals("14")) {
                    if ((nums[1][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("15")) {

                    if ((nums[1][4].equals("S ")) && (nums[2][4].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("16")) {

                    if ((nums[2][0].equals("S ")) && (nums[3][0].equals("O ")) && (nums[4][0].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("17")) {
                    if ((nums[2][1].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("18")) {
                    if ((nums[2][2].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][1].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("19")) {
                    if ((nums[2][3].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][3].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("20")) {
                    if ((nums[2][4].equals("S ")) && (nums[3][4].equals("O ")) && (nums[4][4].equals("S "))) {
                        xScore++;
                    }

                }

                if (numChoice.equals("22")) {
                    if ((nums[4][0].equals("S ")) && (nums[4][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("23")) {
                    if ((nums[4][1].equals("S ")) && (nums[4][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        xScore++;
                    }
                }
                if (numChoice.equals("24")) {
                    if ((nums[4][2].equals("S ")) && (nums[4][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        xScore++;
                    }
                }

            }
            if (holdx == xScore) {
                flagX = 1;
            } else if (holdx > xScore) {
                flagX = 0;
            }

        }

        if (chosenTurn == 1) {
            int holdy = yScore;
            if (letterChoice.equals("S")) {
                if (numChoice.equals("01")) {
                    if ((nums[0][0].equals("S ")) && (nums[0][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][0].equals("S ")) && (nums[1][0].equals("O ")) && (nums[2][0].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("02")) {
                    if ((nums[0][1].equals("S ")) && (nums[0][2].equals("O ")) && (nums[0][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("03")) {
                    if ((nums[0][2].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[0][3].equals("O ")) && (nums[0][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[0][1].equals("O ")) && (nums[0][0].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("04")) {
                    if ((nums[0][3].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][3].equals("S ")) && (nums[0][2].equals("O ")) && (nums[0][1].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("05")) {
                    if ((nums[0][4].equals("S ")) && (nums[0][3].equals("O ")) && (nums[0][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][4].equals("S ")) && (nums[1][4].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("06")) {
                    if ((nums[1][0].equals("S ")) && (nums[2][0].equals("O ")) && (nums[3][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("07")) {
                    if ((nums[1][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        yScore++;
                    }
                }

                if (numChoice.equals("08")) {
                    if ((nums[1][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[1][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("09")) {
                    if ((nums[1][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("10")) {
                    if ((nums[1][4].equals("S ")) && (nums[2][4].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("11")) {
                    if ((nums[2][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[1][0].equals("O ")) && (nums[0][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[3][0].equals("O ")) && (nums[4][0].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("12")) {
                    if ((nums[2][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[0][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][1].equals("S "))) {
                        xScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("13")) {
                    if ((nums[2][2].equals("S ")) && (nums[1][1].equals("O ")) && (nums[0][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[1][2].equals("O ")) && (nums[0][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[0][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("14")) {
                    if ((nums[2][3].equals("S ")) && (nums[1][3].equals("O ")) && (nums[0][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[0][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("15")) {
                    if ((nums[2][4].equals("S ")) && (nums[1][4].equals("O ")) && (nums[0][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[0][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[3][4].equals("O ")) && (nums[4][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("16")) {
                    if ((nums[3][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][0].equals("S ")) && (nums[2][0].equals("O ")) && (nums[1][0].equals("S "))) {
                        yScore++;
                    }
                }

                if (numChoice.equals("17")) {
                    if ((nums[3][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][1].equals("S ")) && (nums[2][1].equals("O ")) && (nums[1][1].equals("S "))) {
                        yScore++;
                    }

                }
                if (numChoice.equals("18")) {
                    if ((nums[3][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[3][1].equals("O ")) && (nums[3][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[2][1].equals("O ")) && (nums[1][0].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("19")) {
                    if ((nums[3][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("19")) {
                    if ((nums[3][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[1][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("20")) {
                    if ((nums[3][4].equals("S ")) && (nums[2][4].equals("O ")) && (nums[1][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("21")) {
                    if ((nums[4][0].equals("S ")) && (nums[3][0].equals("O ")) && (nums[2][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][0].equals("S ")) && (nums[4][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("22")) {
                    if ((nums[4][1].equals("S ")) && (nums[3][1].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][1].equals("S ")) && (nums[4][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("23")) {
                    if ((nums[4][2].equals("S ")) && (nums[4][1].equals("O ")) && (nums[4][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[3][1].equals("O ")) && (nums[2][0].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[3][2].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][2].equals("S ")) && (nums[4][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("24")) {
                    if ((nums[4][3].equals("S ")) && (nums[4][2].equals("O ")) && (nums[4][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][3].equals("S ")) && (nums[3][3].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("25")) {
                    if ((nums[4][4].equals("S ")) && (nums[4][3].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[4][4].equals("S ")) && (nums[3][4].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }
                }

            }
            if (letterChoice.equals("O")) {

                if (numChoice.equals("02")) {
                    if ((nums[0][0].equals("S ")) && (nums[0][1].equals("O ")) && (nums[0][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("03")) {
                    if ((nums[0][1].equals("S ")) && (nums[0][2].equals("O ")) && (nums[0][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("04")) {
                    if ((nums[0][2].equals("S ")) && (nums[0][3].equals("O ")) && (nums[0][4].equals("S "))) {
                        yScore++;
                    }
                }

                if (numChoice.equals("06")) {
                    if ((nums[0][0].equals("S ")) && (nums[1][0].equals("O ")) && (nums[2][0].equals("S "))) {
                        yScore++;
                    }
                }

                if (numChoice.equals("07")) {
                    if ((nums[1][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[1][1].equals("O ")) && (nums[1][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("08")) {
                    if ((nums[0][2].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[1][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][1].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][3].equals("S ")) && (nums[1][2].equals("O ")) && (nums[2][1].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("09")) {
                    if ((nums[0][3].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[1][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][4].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[0][2].equals("S ")) && (nums[1][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("10")) {
                    if ((nums[0][4].equals("S ")) && (nums[1][4].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }

                }
                if (numChoice.equals("11")) {
                    if ((nums[1][0].equals("S ")) && (nums[2][0].equals("O ")) && (nums[3][0].equals("S "))) {
                        yScore++;
                    }

                }
                if (numChoice.equals("12")) {
                    if ((nums[1][1].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[2][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][0].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][1].equals("O ")) && (nums[3][0].equals("S "))) {
                        yScore++;
                    }

                }

                if (numChoice.equals("13")) {
                    if ((nums[1][2].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[2][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][1].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][3].equals("S ")) && (nums[2][2].equals("O ")) && (nums[3][1].equals("S "))) {
                        yScore++;
                    }

                }
                if (numChoice.equals("14")) {
                    if ((nums[1][3].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[2][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][4].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("15")) {

                    if ((nums[1][4].equals("S ")) && (nums[2][4].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("16")) {

                    if ((nums[2][0].equals("S ")) && (nums[3][0].equals("O ")) && (nums[4][0].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("17")) {
                    if ((nums[2][1].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][1].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[3][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][0].equals("S ")) && (nums[3][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[1][2].equals("S ")) && (nums[2][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("18")) {
                    if ((nums[2][2].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[3][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][1].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][3].equals("S ")) && (nums[3][2].equals("O ")) && (nums[4][1].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("19")) {
                    if ((nums[2][3].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][3].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[3][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[3][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][2].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        yScore++;
                    }
                    if ((nums[2][4].equals("S ")) && (nums[3][3].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("20")) {
                    if ((nums[2][4].equals("S ")) && (nums[3][4].equals("O ")) && (nums[4][4].equals("S "))) {
                        yScore++;
                    }

                }

                if (numChoice.equals("22")) {
                    if ((nums[4][0].equals("S ")) && (nums[4][1].equals("O ")) && (nums[4][2].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("23")) {
                    if ((nums[4][1].equals("S ")) && (nums[4][2].equals("O ")) && (nums[4][3].equals("S "))) {
                        yScore++;
                    }
                }
                if (numChoice.equals("24")) {
                    if ((nums[4][2].equals("S ")) && (nums[4][3].equals("O ")) && (nums[4][4].equals("S "))) {
                        yScore++;
                    }
                }

            }
            if (holdy == yScore) {
                flagY = 1;
            } else if (holdy > yScore) {
                flagY = 0;
            }

        }

    }

}
