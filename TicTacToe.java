package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class TicTacToe
{
    int _row=3;

    //char _board[][]=new char[_row][_row];

    static char currentPlayer;

    static char[][] board;

    Scanner input=new Scanner(System.in);

    public TicTacToe() {

        board = new char[3][3];

        currentPlayer = 'x';

        initializeBoard();

    }
    public static char getCurrentPlayer()

    {
        return currentPlayer;
    }

    public void initializeBoard(){

        for (int i = 0; i <_row; i++) {

            for (int j = 0; j < _row; j++) {

                board[i][j]='o';
            }
        }
    }
    boolean isValid(int r,int c){

        return((r>=0&&r<_row)&&(c>=0&&c<_row));
    }
    boolean isFull(int r,int c){

        return(board[r][c]!='o');
    }
    public boolean gamePlay(int r ,int c,int playerNo){

        if (!(isValid(r,c))) {

            System.out.println("Enter Correct index");

            return true ;
        }
        if (isFull(r,c)) {
            System.out.println("This index already fill");
            return true;
        }

        if (playerNo==1) {

            board[r][c]='*';

        } else {

            board[r][c]='+';
        }
        return false;
    }
    boolean horizontalAndVerticalMatch(char ch,int n){

        // for row and col math

        boolean flag=true;

        for (int i = 0; i < _row; i++) {

            flag=true;

            for (int j = 0; j < _row; j++) {

                System.out.println("i="+i+"j="+j);

                char ch1=(n==1)?board[i][j]:board[j][i];

                if (ch1!=ch) {

                    System.out.println("y");

                    flag=false;

                    break;
                }
            }
            if (flag) {

                return flag;
            }
        }
        return flag;
    }
    boolean majorDiagonal(char ch){

        return((board[0][0]==ch)&&(board[1][1]==ch)&&(board[2][2]==ch));
    }
    boolean minorDiagonal(char ch){

        return((board[2][0]==ch)&&(board[1][1]==ch)&&(board[0][2]==ch));
    }
    public boolean isGameOver(int PlayerNo){

        char ch;

        if (PlayerNo==1) {
            ch='*';
        } else {
            ch='+';
        }
        return(horizontalAndVerticalMatch(ch,1)||horizontalAndVerticalMatch(ch,2)||majorDiagonal(ch)||minorDiagonal(ch));
    }
    public void display(){

        for (int i = 0; i <_row; i++) {

            for (int j = 0; j < _row; j++) {

                System.out.print("     "+board[i][j]);
            }
                System.out.println("");
        }
    }
    public static void printWelcome()
    {
        System.out.println("Welcome to Tic Tac Toe!");

        System.out.println("To play, enter a number for which box to play in.");

        System.out.println("1 2 3");

        System.out.println("4 5 6");

        System.out.println("7 8 9");

        System.out.println("You'll need a buddy to play with.  Ready to begin?  Here we go.");
    }
    public static boolean wantsToPlayAgain()
    {
        Scanner input=new Scanner(System.in);

        System.out.print("Would you like to play again?");

        input.nextLine();

        String answer = input.nextLine();

        return (answer.equals("y"));
    }
    public static char getTokenAtPosition(int position, char[][] board)
    {
        int row = (position - 1) / 3;

        int col = (position - 1) % 3;

        return board[row][col];
    }
    public static void placeToken(int position, char[][] board, boolean isXTurn)
    {
        int row = (position - 1) / 3;

        int col = (position - 1) % 3;

        if (isXTurn) {

            board[row][col] = 'x';

        } else {

            board[row][col] = 'o';
        }
    }
    public static void getPositionAndPlaceToken()
    {
        boolean invalidInput = true;
        boolean full = true;
        int position=0;
        int row=0;

        int col=0;

        invalidInput = (position < 1 || position > 3);

        full = ((board[row][col] != '-'));

        if (invalidInput) {

            System.out.println("Sorry, position " + position + " is not valid.  Row 1-3 and Columns 1-3.");

        } else {

            if (full) {

                System.out.println("Sorry, position " + position + " is already full.  Pick another.");
            }
        }
    }
        public static void main(String[] args)
         {
        Scanner scan = new Scanner(System.in);

        TicTacToe  game = new TicTacToe();

        game.initializeBoard();

        boolean invalidInput = true;

        int position;

        boolean full = true;
        printWelcome();
            do
        {
            game.printBoard();

            int row;

            int col;

            do
            {
                System.out.println("Player " + game.getCurrentPlayer() + ", enter an empty row and column to place your mark!");

                row = scan.nextInt()-1;

                col = scan.nextInt()-1;

                //getPositionAndPlaceToken();
            }

            while (!game.placeMark(row, col));
            
            game.changePlayer();
        }
        while(!game.isWinner() && !game.isBoardFull());

        if (game.isBoardFull() && !game.isWinner())
        {
            System.out.println("The game was a tie!");

        } else{

            game.printBoard();

            game.changePlayer();

            System.out.println(Character.toUpperCase(game.getCurrentPlayer()) + " Wins!");

            wantsToPlayAgain();
        }
    }

    private boolean placeMark(int row, int col) {
        return false;
    }

    private void changePlayer() {
    }

    private void printBoard() {
    }

    private boolean isBoardFull() {
        return false;
    }

    private boolean isWinner() {
        return false;
    }
}