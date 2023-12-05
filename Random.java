import acm.program.*;
import acm.util.*;

public class Random extends HangmanLexicon {
    private HangmanLexicon lexicon = new HangmanLexicon();
    private String secretWord;
    private StringBuilder guessedWord;
    private int incorrectGuesses;

    public void run() {
        setUpGame();
        playGame();
        displayResult();
    }

    private void setUpGame() {
        secretWord = getRandomWord();
        guessedWord = new StringBuilder("-".repeat(secretWord.length()));
        incorrectGuesses = 0;
        println("Welcome to Hangman!");
        println("The word looks like this: " + guessedWord);
    }

    private void playGame() {
        while (incorrectGuesses < 8 && guessedWord.indexOf("-") != -1) {
            char guess = getGuess();
            checkGuess(guess);
            displayGameState();
        }
    }

    private void displayGameState() {
        println("Incorrect guesses left: " + (8 - incorrectGuesses));
        println("The word looks like this: " + guessedWord);
    }

    private char getGuess() {
        String guessStr = readLine("Your guess: ").toUpperCase();
        while (guessStr.length() != 1 || !Character.isLetter(guessStr.charAt(0))) {
            println("Please enter a single letter.");
            guessStr = readLine("Your guess: ").toUpperCase();
        }
        return guessStr.charAt(0);
    }

    private void checkGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
                correctGuess = true;
            }
        }

        if (!correctGuess) {
            println("Incorrect guess!");
            incorrectGuesses++;
        }
    }

    private void displayResult() {
        if (guessedWord.indexOf("-") == -1) {
            println("Congratulations! You guessed the word: " + secretWord);
        } else {
            println("Sorry, you ran out of guesses. The word was: " + secretWord);
        }
    }

    private String getRandomWord() {
        int index = RandomGenerator.getInstance().nextInt(lexicon.getWordCount());
        return lexicon.getWord(index);
    }
}
