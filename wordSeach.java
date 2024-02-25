// CREATED BY JOHN CARLO CORTEZA :)

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String[][] letters = { { "C", "O", "T", "A", "F" }, { "A", "S", "T", "A", "P" },
            { "T", "A", "T", "I", "Y" }, { "H", "S", "L", "I", "T" }, { "U", "P", "I", "Z", "P" } };
    public static String[][] nums = { { "01", "02", "03", "04", "05" }, { "06", "07", "08", "09", "10" },
            { "11", "12", "13", "14", "15" }, { "16", "17", "18", "19", "20" }, { "21", "22", "23", "24", "25" } };
    public static String numChoice = "0"; // default 0
    public static boolean[][] checkplaces = { { false, false, false, false, false },
            { false, false, false, false, false }, { false, false, false, false, false },
            { false, false, false, false, false }, { false, false, false, false, false } };

    public static void main(String[] args) {
        showMechanics();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                printTable();
                System.out.println();
                askChoice(i);
            }
        }

        printTable();

        int output = printScore();
        System.out.println();
        System.out.println();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> You Scored " + output + " / 6 "
                + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> You Scored " + output + " / 6 "
                + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> You Scored " + output + " / 6 "
                + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        printTable();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> You Scored " + output + " / 6 "
                + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> You Scored " + output + " / 6 "
                + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> You Scored " + output + " / 6 "
                + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

    }

    public static void printTable() {
        for (int i = 0; i < letters.length; i++) {
            System.out.println();
            System.out.print("                              ");
            for (int j = 0; j < letters[0].length; j++) {

                System.out.print("[" + nums[i][j] + "] " + letters[i][j] + " " + " ");

            }
            System.out.println();
            System.out.println();
        }
    }

    public static void askChoice(int i) {
        do {
            System.out.println();
            System.out.print("Enter the number of corresponding letter you will underline ");
            System.out.print("[Turn " + (i + 1) + "] --->:");
            numChoice = sc.nextLine();
        } while (!((numChoice.equals("01") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("02") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("03") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("04") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("05") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("06") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("07") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("08") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("09") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("10") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("11") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("12") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("13") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("14") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("15") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("16") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("17") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("18") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("19") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("20") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("21") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("22") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("23") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("24") && (checkplace(numChoice) == 0)) ||
                (numChoice.equals("25") && (checkplace(numChoice) == 0))));

        if (numChoice.equals("01")) {
            checkplaces[0][0] = true;
            nums[0][0] = "X ";
        }
        if (numChoice.equals("02")) {
            checkplaces[0][1] = true;
            nums[0][1] = "X ";
        }
        if (numChoice.equals("03")) {
            checkplaces[0][2] = true;
            nums[0][2] = "X ";
        }
        if (numChoice.equals("04")) {
            checkplaces[0][3] = true;
            nums[0][3] = "X ";
        }
        if (numChoice.equals("05")) {
            checkplaces[0][4] = true;
            nums[0][4] = "X ";
        }
        if (numChoice.equals("06")) {
            checkplaces[1][0] = true;
            nums[1][0] = "X ";
        }
        if (numChoice.equals("07")) {
            checkplaces[1][1] = true;
            nums[1][1] = "X ";
        }
        if (numChoice.equals("08")) {
            checkplaces[1][2] = true;
            nums[1][2] = "X ";
        }
        if (numChoice.equals("09")) {
            checkplaces[1][3] = true;
            nums[1][3] = "X ";
        }
        if (numChoice.equals("10")) {
            checkplaces[1][4] = true;
            nums[1][4] = "X ";
        }
        if (numChoice.equals("11")) {
            checkplaces[2][0] = true;
            nums[2][0] = "X ";
        }
        if (numChoice.equals("12")) {
            checkplaces[2][1] = true;
            nums[2][1] = "X ";
        }
        if (numChoice.equals("13")) {
            checkplaces[2][2] = true;
            nums[2][2] = "X ";
        }

        if (numChoice.equals("14")) {
            checkplaces[2][3] = true;
            nums[2][3] = "X ";
        }
        if (numChoice.equals("15")) {
            checkplaces[2][4] = true;
            nums[2][4] = "X ";
        }

        if (numChoice.equals("16")) {
            checkplaces[3][0] = true;
            nums[3][0] = "X ";
        }

        if (numChoice.equals("17")) {
            checkplaces[3][1] = true;
            nums[3][1] = "X ";
        }
        if (numChoice.equals("18")) {
            checkplaces[3][2] = true;
            nums[3][2] = "X ";
        }
        if (numChoice.equals("19")) {
            checkplaces[3][3] = true;
            nums[3][3] = "X ";
        }
        if (numChoice.equals("20")) {
            checkplaces[3][4] = true;
            nums[3][4] = "X ";
        }
        if (numChoice.equals("21")) {
            checkplaces[4][0] = true;
            nums[4][0] = "X ";
        }
        if (numChoice.equals("22")) {
            checkplaces[4][1] = true;
            nums[4][1] = "X ";
        }
        if (numChoice.equals("23")) {
            checkplaces[4][2] = true;
            nums[4][2] = "X ";
        }
        if (numChoice.equals("24")) {
            checkplaces[4][3] = true;
            nums[4][3] = "X ";
        }
        if (numChoice.equals("25")) {
            checkplaces[4][4] = true;
            nums[4][4] = "X ";
        }

    }

    public static int checkplace(String numChoice) {
        for (int i = 0; i < checkplaces.length; i++) {
            for (int j = 0; j < checkplaces[0].length; j++) {
                if (numChoice.equals(nums[i][j])) {
                    if (checkplaces[i][j] == false) {
                        return 0; // if false there is a slot
                    }
                }
            }
        }
        return 1; // if true the slot is taken
    }

    public static void showMechanics() {
        System.out.println();
        System.out.println();
        System.out.println("                                     WELCOME TO WORDSEARCH!");
        System.out.println("                               ---> You Only Have 6 turns <---");
        System.out.println(
                ">> There are six 3-letter words. Input the number of corresponding letter you want to underline <<");
        System.out.println(
                ">> you only have a maximum of 6 moves(consisting of 3 inputs each), after that the game will be finished, your score will be outputted <<");
        System.out.println(
                "Reminder: For the Simplicity of the game, there would be no overlapping words, only across, downward, and diagonal form, and these words can be reversed in order");
        System.out.println("                              >>>YOU CAN ONLY CHOOSE A LETTER ONCE<<<");
    }

    public static int printScore() {
        int score = 0;

        if ((checkplaces[0][2] == true) && (checkplaces[0][3] == true) && (checkplaces[0][4] == true)) {
            score++;
        }
        if ((checkplaces[0][0] == true) && (checkplaces[1][0] == true) && (checkplaces[2][0] == true)) {
            score++;
        }
        if ((checkplaces[3][0] == true) && (checkplaces[2][1] == true) && (checkplaces[1][2] == true)) {
            score++;
        }

        if ((checkplaces[4][1] == true) && (checkplaces[4][2] == true) && (checkplaces[4][3] == true)) {
            score++;
        }
        if ((checkplaces[3][2] == true) && (checkplaces[2][3] == true) && (checkplaces[1][4] == true)) {
            score++;
        }
        if ((checkplaces[2][2] == true) && (checkplaces[3][3] == true) && (checkplaces[4][4] == true)) {
            score++;
        }
        return score;
    }
}
