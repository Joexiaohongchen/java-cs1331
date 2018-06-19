import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Two players that are trying to sink each other’s ships
 *
 * @author xchen671
 * @version 13.31
 */

public class Battleship {

 /**
 * take in parameter n and create a 2D char array of size n x n
 *
 *
 *@param n the board matrix squart initiation.
 *@return board initiate the board matrix mode.
 */
    public static char[][] initBoard(int n) {
        char[][] board = new char[n][n];
        for (int r = 0; r < n; ++r) {
            for (int c = 0; c < n; ++c) {
                board[r][c] = '~';
            }
        }
        return board;
    }
 /**
 * Prints the board array
 *
 *
 *@param playerTurn initate the player turn.
 *@param board return a update board.
 *@param hitsLeft clear the number of hit chances player has it.
 */

    public static void printBoard(int playerTurn, char[][] board,
        int hitsLeft) {
        System.out.printf("player %d (%d hits left):%n", playerTurn, hitsLeft);
        for (int r = 0; r < board.length; ++r) {
            for (int c = 0; c < board.length; ++c) {
                System.out.print(board[r][c]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

/**
 * Fire missile and hit the target.
 *
 *
 *@param board return a update board.
 *@param target string of the location being fired at.
 *@param shipLocations find out the ships were originally placed
 *@param hitsLeft representing the number of hits the player
 * firing needs to hit left.
 *@return hitsleft after the hit chance used or not.
 */
    public static int fireMissile(char[][] board, String target,
        String[] shipLocations, int hitsLeft) {
        int[] location = convertLocation(target);
        if (isShip(target, shipLocations)) {
            if (board[location[0]][location[1]] == 'X'
                || board[location[0]][location[1]] == 'O') {
                System.out.printf("The %s was already chosen.%n", target);
                hitsLeft++;
            }
            System.out.println("Hit!");
            board[location[0]][location[1]] = 'X';
            hitsLeft--;
        } else {
            if (board[location[0]][location[1]] == 'X'
                || board[location[0]][location[1]] == 'O') {
                System.out.printf("The %s was already chosen.%n", target);
            }
            System.out.println("Miss!");
            board[location[0]][location[1]] = 'O';
        }
        return hitsLeft;
    }

/**
 * Returns whether the location is a ship or not.
 *
 *
 *@param target is the string coordinate of where on the board to look.
 *@param shipLocations is a string array of where the
 * ships were originally placed.
 *@return false when the user input is not the place of the ship.
 */
    public static boolean isShip(String target, String[] shipLocations) {
        for (int i = 0; i < shipLocations.length; ++i) {
            String ship = shipLocations[i];
            if (target.equals(ship)) {
                return true;
            }
        }
        return false;
    }

/**
 * the row must be the first element and the column the second
 *
 *
 *@param coordinate convert this to an int array of the corresponding
 * indices of the board
 *@return cover convert two char input to interger and create a matix array.
 */
    public static int[] convertLocation(String coordinate) {
        char locLetter = coordinate.charAt(0);
        int locRow = locLetter - 97;
        char locNum = coordinate.charAt(1);
        int locCol = locNum - 49;
        int[] cover = {locRow, locCol};
        return cover;
    }

/**
 * each player has only one shot (guess) per turn and even if
 * it’s a successful hit
 * that player’s turn ends. The game ends when a player has successfully
 * hit all of their opponent’s ships.
 *
 *@param args the random number from 1 to 9 is selected from the fileInd
 */
    public static void main(String[] args) {
        int fileInd = (args.length > 0) ? Integer.parseInt(args[0])
            : new Random().nextInt(4);
        String filename = "game" + fileInd + ".txt";
        try {
            Scanner fileReader = new Scanner(new File(filename));
            int size = fileReader.nextInt();
            String player0 = fileReader.nextLine();
            String player1 = fileReader.nextLine();
            String player2 = fileReader.nextLine();
            String[] shipLocations1 = player1.split("\\s");
            int hitLeft1 = shipLocations1.length;
            String[] shipLocations2 = player2.split("\\s");
            int hitLeft2 = shipLocations2.length;
            int playerTurn = 1;
            char[][] board1 = initBoard(size);
            char[][] board2 = initBoard(size);
            while (hitLeft1 > 0 && hitLeft2 > 0) {
                if (playerTurn == 1) {
                    printBoard(playerTurn, board1, hitLeft1);
                    System.out.print("Enter missile location: ");
                    String guess = new Scanner(System.in).nextLine();
                    isShip(guess, shipLocations1);
                    convertLocation(guess);
                    hitLeft1 = fireMissile(board1, guess,
                    shipLocations1, hitLeft1);
                    printBoard(playerTurn, board1, hitLeft1);
                    System.out.println(" ");
                    System.out.println("---------");
                    System.out.println(" ");
                } else {
                    printBoard(playerTurn, board2, hitLeft2);
                    System.out.print("Enter missile location: ");
                    String guess = new Scanner(System.in).nextLine();
                    isShip(guess, shipLocations2);
                    convertLocation(guess);
                    hitLeft2 = fireMissile(board2, guess,
                    shipLocations2, hitLeft2);
                    printBoard(playerTurn, board2, hitLeft2);
                    System.out.println(" ");
                    System.out.println("---------");
                    System.out.println(" ");
                }
                if (playerTurn == 1) {
                    playerTurn = 2;
                } else {
                    playerTurn = 1;
                }
            }
            if (hitLeft1 == 0) {
                System.out.println("The winner is Player 1");
            } else {
                System.out.println("The winner is Player 2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Make sure that " + filename
                + " is in the current directory!");
        }
    }
}