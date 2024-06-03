package br.com.jogoforca;

import java.util.Scanner;

public class Game {

    public void run(){
        Player player = new Player(new Scanner(System.in));
        Word word = new Word("Batatinha");
        Hangman hangman = new Hangman();
        while(notFinished(word, hangman)){
            hangman.printFork();
            word.print();
            char shot = player.nextShot();
            if(!word.processShot(shot)){
                hangman.increaseFork();
            }
        }
        if(word.isCompleted()){
            word.print();
            System.out.println("Parabéns você ganhou!!!");
        }else{
            hangman.printFork();
            System.out.println("Você perdeu!");
        }
    }

    private boolean notFinished(Word word, Hangman hangman) {
        return !word.isCompleted() && !hangman.isFinishedFork();
    }

    public static void main(String[] args) {
        new Game().run();
    }
}
