package br.com.jogoforca;

import java.util.Scanner;

public class App {

    public void start(){
        Scanner terminal = new Scanner(System.in);
        Player player = new Player(terminal);
        Hangman hangman = new Hangman();
        WordService wordService = new WordService();
        Game game = new Game(player,wordService.getRandonWord(),hangman);
        game.run();
    }
}
