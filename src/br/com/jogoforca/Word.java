package br.com.jogoforca;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private String secretWord;
    private List<Character> viewWord;

    public Word(String secretWord){
        if(secretWord != null && !secretWord.trim().isEmpty()){
            this.secretWord = secretWord.toUpperCase();
           viewWord = new ArrayList<>();
           for(int index = 0; index < secretWord.length(); index++){
               viewWord.add('-');
           }
        }
    }
    public boolean isCompleted() {
        return !viewWord.contains('-');
    }

    public void print() {
        System.out.println(viewWord);
    }

    public boolean processShot(char shot) {
        for(int index = 0; index < secretWord.length(); index++){
             if(Character.toUpperCase(shot)  == Character.toUpperCase(secretWord.charAt(index))){
                 viewWord.set(index,Character.toUpperCase(shot));
             }
        }
        return viewWord.contains(Character.toUpperCase(shot) );
    }
}
