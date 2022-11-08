import java.util.Scanner;

public class C4 {
    //class-level variables
    //-accessible to all methods in the class
    //-regardless of data type, if one method changes
    //a class-level variable, the change will be
    //seen in other methods in the class
    public static int [][] board;
    public static Scanner s = new Scanner(System.in);

    //player name variables can go here too (not req)


    public static void main(String [] args) {
        //methods to run connect 4
        //setupBoard
        //getNames
        //printBoard
        //loop:
        //  -alternate players
        //  -getMove, validateMove
        //  -placePiece
        //  -printBoard
        //  -checkWins
    }
    //when you define these methods, you can add/change
    //parameters or return types
    public static void setupBoard() {}
    public static void getNames() {}
    public static void printBoard() {}

    //return the col that player selects
    public static int getMove() {
        return -1;
    }

    //determine whether the move is valid
    public static boolean validateMove(int move){
        return false;
    }

    public static void placePiece(int move){}

    public static boolean checkWins(){
        return false;
    }


}
