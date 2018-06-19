import java.util.Random;
import java.util.Scanner;

/**
 * A word guessing game.
 *
 * @author xchen671
 * @version 9.0.1
 */

public class WordGuess {

    static final String[] CANDIDATES = {"cat", "dad", "dog", "mom", "rat"};

      /**
     * users have five chances to win or from the word guessing game
     *
     *@param args the random word is selected from the array CANDIDATES
     */

    public static void main(String[] args) {
        String secretWord = args.length > 0
            ? CANDIDATES[Integer.parseInt(args[0])]
            : CANDIDATES[new Random().nextInt(CANDIDATES.length)];
        int missGuess = 5;
        StringBuilder sb = new StringBuilder("___");
        String missLetters = " ";
        while (missGuess > 0) {
            System.out.print("Missed letters ");
            System.out.print("(" + missGuess + " left):" + missLetters);
            System.out.printf("%nCurrent guess: %s%n", sb);
            System.out.print("Guess a letter: ");
            Scanner sc = new Scanner(System.in);
            char guessWord = sc.nextLine().charAt(0);
            // System.out.println("");
            System.out.println("");
            missGuess--;
            if (guessWord == secretWord.charAt(0)) {
                sb.setCharAt(0, guessWord);
                missGuess++;
                if (guessWord == secretWord.charAt(2)) {
                    sb.setCharAt(2, guessWord);
                }
            } else if (guessWord == secretWord.charAt(1)) {
                sb.setCharAt(1, guessWord);
                missGuess++;
            } else if (guessWord == secretWord.charAt(2)) {
                sb.setCharAt(2, guessWord);
                missGuess++;
            } else {
                missLetters += guessWord;
            }
            if (missGuess == 0 && !sb.toString().equals(secretWord)) {
                System.out.printf("Missed letters:%s", missLetters);
                System.out.printf("%nFinal guess: %s%n", sb);
                System.out.print("Sorry, too many misses. ");
                System.out.printf("The secret word was %s%n", secretWord);
            } else if (sb.toString().equals(secretWord)) {
                System.out.printf("Missed letters:%s", missLetters);
                System.out.printf("%nFinal guess: %s%n", sb);
                System.out.println("Congratulations! You got it!");
                break;
            }
        }
    }
}