package TemplateMethod;

import java.util.Scanner;

public class Hangman extends Game {
    private int currentPlayer;
    private static final String[] WORDS = {"car", "buss", "apple", "java",  "friend" , "programmer"};
    private String wordToGuess;
    private char[] hiddenCopyOfWordToGuess;
    private int guessesLeft;


    @Override
    void initializeGame() {
        wordToGuess = WORDS[(int) (Math.random() * WORDS.length)];
        hiddenCopyOfWordToGuess = new char[wordToGuess.length()];

        for (int i = 0; i<hiddenCopyOfWordToGuess.length; i++) {
            hiddenCopyOfWordToGuess[i] = '-';
        }
        guessesLeft = (wordToGuess.length()+2);
        currentPlayer = 0;
    }

    @Override
    void makePlay(int player) {
        System.out.println("Player " + currentPlayer + " turn ");
        System.out.println("Guesses left: " + guessesLeft);
        System.out.println("Word:  " + String.valueOf(hiddenCopyOfWordToGuess));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        String guessInput = scanner.nextLine().toLowerCase();

        if (guessInput.length() != 1) {
            System.out.println("Invalid input, give a single letter");
        } else {
            char guess = guessInput.charAt(0);
            boolean match = false;

            for (int i = 0; i<wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    hiddenCopyOfWordToGuess[i] = guess;
                    match = true;
                }
            }
            if (!match) {
                System.out.println("Letter is not in that word");
                guessesLeft--;
            }
        }
        currentPlayer = (currentPlayer + 1) % playersCount;
    }

    @Override
    boolean endOfGame() {
        return guessesLeft == 0 || String.valueOf(hiddenCopyOfWordToGuess).equals(wordToGuess);
    }

    @Override
    void printWinner() {
        if (guessesLeft == 0)
            System.out.println("Oh no team, you lose. The word we were looking for was: " + wordToGuess);
        else
            System.out.println("Congrats team, you won!! The word was:  " + wordToGuess);
    }
}
