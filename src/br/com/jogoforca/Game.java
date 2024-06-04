package br.com.jogoforca;

import java.util.Scanner;

public class Game {

    private final Player player;
    private final Word word;
    private final Hangman hangman;

    public Game(Player player, Word word, Hangman hangman){
        this.player  = player;
        this.word = word;
        this.hangman = hangman;
    }

    public void run(){

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
}
