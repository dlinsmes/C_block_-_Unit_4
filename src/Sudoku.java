import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {
        printBoard();
        Scanner s = new Scanner (System.in);
        System.out.println("Press enter to begin solving");
        s.nextLine();

        int [][] copy = new int [9][9];
        while (makingProgress(copy)) {
            copy = copyBoard();
            //call methods to solve here
        }
        printBoard();
        if (isSolved())
            System.out.println("Solved!");
        else
            System.out.println("Stuck");
    }

    public static void printBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0)
                    System.out.print("_  ");
                else
                    System.out.print(board[i][j] + "  ");
                if ((j+1) % 3 == 0)
                    System.out.print("  ");
            }
            System.out.println();
            if ((i+1) % 3 == 0)
                System.out.println();
        }

    }

    //returns a copy of the current board
    //-used to check if progress is made
    public static int [][] copyBoard(){
        int [][] copy = new int [9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j ++)
                copy[i][j] = board[i][j];
        return copy;
    }

    //compares the 2D array copy to the class variable board
    //if there are differences, return true (progress made)
    //if there are no differences, return false (no progress made)
    public static boolean makingProgress(int [][] copy) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j ++)
                if (copy[i][j] != board[i][j])
                    return true;
        return false;
    }

    //check whether each number on the board is validly placed
    public static boolean isSolved() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (!isValid(board[i][j], i, j))
                    return false;
        return true;
    }

    //check if placing the number into the position at the indicated row and column would be valid
    public static boolean isValid(int num, int row, int col) {
        return false;
    }

    //methods to solve go here:





    //////////////////////////////
    //////////////////////////////

    //uncomment the board you want to use or add your own
    public static int [][] board =

            //baseline complete
//                  {{ 1, 2, 3, 4, 5, 6, 7, 8, 9},
//                    { 4, 5, 6, 7, 8, 9, 1, 2, 3},
//                    { 7, 8, 9, 1, 2, 3, 4, 5, 6},
//                    { 2, 3, 4, 5, 6, 7, 8, 9, 1},
//                    { 5, 6, 7, 8, 9, 1, 2, 3, 4},
//                    { 8, 9, 1, 2, 3, 4, 5, 6, 7},
//                    { 3, 4, 5, 6, 7, 8, 9, 1, 2},
//                    { 6, 7, 8, 9, 1, 2, 3, 4, 5},
//                    { 9, 1, 2, 3, 4, 5, 6, 7, 8}};


            //a - baseline with 4 numbers removed
                    {{ 1, 2, 3, 4, 5, 6, 7, 8, 9},
                    { 4, 0, 0, 7, 8, 9, 1, 2, 3},
                    { 7, 0, 0, 1, 2, 3, 4, 5, 6},
                    { 2, 3, 4, 5, 6, 7, 8, 9, 1},
                    { 5, 6, 7, 8, 9, 1, 2, 3, 4},
                    { 8, 9, 1, 2, 3, 4, 5, 6, 7},
                    { 3, 4, 5, 6, 7, 8, 9, 1, 2},
                    { 6, 7, 8, 9, 1, 2, 3, 4, 5},
                    { 9, 1, 2, 3, 4, 5, 6, 7, 8}};


            //b - baseline with more numbers removed
//                  {{ 0, 0, 0, 0, 5, 6, 0, 8, 0},
//                    { 4, 0, 6, 0, 0, 0, 0, 0, 3},
//                    { 0, 8, 0, 1, 2, 0, 0, 5, 0},
//                    { 0, 0, 4, 0, 6, 0, 8, 0, 1},
//                    { 0, 0, 0, 8, 0, 1, 0, 3, 0},
//                    { 0, 9, 1, 0, 3, 0, 5, 0, 0},
//                    { 3, 0, 0, 0, 7, 0, 0, 0, 2},
//                    { 0, 0, 0, 9, 0, 2, 3, 0, 0},
//                    { 0, 1, 0, 0, 0, 5, 0, 0, 0}};


            //c
//                   {{9, 0, 3, 0, 0, 8, 4, 0, 0},
//                    {0, 5, 0, 1, 0, 7, 0, 0, 3},
//                    {6, 8, 7, 3, 0, 2, 9, 0, 0},
//                    {0, 0, 0, 6, 0, 0, 0, 0, 0},
//                    {5, 3, 8, 2, 0, 0, 0, 0, 0},
//                    {1, 0, 2, 0, 0, 4, 0, 9, 0},
//                    {3, 0, 0, 9, 0, 6, 0, 7, 0},
//                    {7, 2, 6, 8, 5, 1, 0, 4, 0},
//                    {0, 0, 0, 4, 0, 3, 2, 5, 0}};


             //d
//                    {{9, 0, 0, 8, 0, 1, 0, 3, 0},
//                    {0, 0, 0, 3, 4, 0, 0, 0, 0},
//                    {4, 0, 0, 0, 0, 0, 9, 0, 0},
//                    {0, 0, 2, 0, 0, 5, 8, 6, 0},
//                    {1, 0, 7, 0, 0, 0, 0, 0, 4},
//                    {5, 6, 8, 4, 0, 0, 1, 0, 0},
//                    {0, 0, 5, 0, 3, 0, 7, 0, 9},
//                    {0, 1, 0, 0, 0, 4, 3, 5, 0},
//                    {0, 0, 0, 0, 0, 8, 0, 0, 2}};


            //e
//                    {{0, 0, 0, 0, 0, 0, 0, 3, 0},
//                    {1, 0, 5, 0, 0, 0, 0, 4, 0},
//                    {3, 0, 0, 2, 0, 9, 6, 5, 0},
//                    {7, 5, 3, 0, 0, 0, 0, 1, 0},
//                    {0, 0, 0, 0, 6, 3, 0, 0, 0},
//                    {0, 9, 0, 5, 0, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 9, 5, 0, 0, 0},
//                    {0, 3, 1, 7, 2, 0, 0, 0, 4},
//                    {0, 4, 9, 0, 1, 0, 5, 0, 0}};


            //f
//                    {{6, 9, 0, 0, 1, 0, 3, 0, 0},
//                    {2, 0, 0, 0, 3, 4, 0, 0, 0},
//                    {0, 0, 3, 0, 0, 9, 5, 0, 0},
//                    {9, 2, 0, 0, 8, 0, 0, 0, 0},
//                    {0, 0, 0, 9, 0, 1, 0, 0, 0},
//                    {0, 0, 0, 0, 4, 0, 0, 6, 9},
//                    {0, 0, 4, 1, 0, 0, 7, 0, 0},
//                    {0, 0, 0, 8, 5, 0, 0, 0, 3},
//                    {0, 0, 9, 0, 7, 0, 0, 2, 5}};


            //g
//                    {{0, 0, 0, 0, 0, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 0, 3, 0, 8, 5},
//                    {0, 0, 1, 0, 2, 0, 0, 0, 0},
//                    {0, 0, 0, 5, 0, 7, 0, 0, 0},
//                    {0, 0, 4, 0, 0, 0, 1, 0, 0},
//                    {0, 9, 0, 0, 0, 0, 0, 0, 0},
//                    {5, 0, 0, 0, 0, 0, 0, 7, 3},
//                    {0, 0, 2, 0, 1, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 4, 0, 0, 0, 9}};


            //h
//                  {{0, 5, 0, 0, 2, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 0, 1, 0, 4, 2},
//                    {3, 0, 0, 0, 6, 8, 9, 0, 0},
//                    {1, 9, 0, 0, 0, 7, 0, 0, 0},
//                    {0, 7, 0, 0, 0, 0, 0, 2, 0},
//                    {0, 0, 0, 5, 0, 0, 0, 1, 8},
//                    {0, 0, 5, 8, 3, 0, 0, 0, 1},
//                    {9, 4, 0, 6, 0, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 7, 0, 0, 5, 0}};


            //i
//                   {{0, 0, 0, 0, 0, 0, 0, 0, 6},
//                    {8, 6, 0, 0, 0, 0, 0, 5, 0},
//                    {4, 0, 0, 0, 0, 2, 0, 0, 8},
//                    {0, 0, 7, 0, 0, 0, 9, 1, 0},
//                    {0, 0, 2, 4, 0, 0, 0, 0, 0},
//                    {0, 5, 0, 0, 0, 1, 0, 0, 0},
//                    {0, 0, 0, 6, 8, 4, 0, 0, 0},
//                    {0, 0, 0, 0, 5, 0, 3, 0, 0},
//                    {0, 0, 0, 0, 2, 0, 5, 0, 7}};


}