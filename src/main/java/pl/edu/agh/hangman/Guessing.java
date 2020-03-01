package pl.edu.agh.hangman;

import javax.swing.*;

public class Guessing {

    public static void Checking(String[] passwordWord, String checkingLetter){

        int howManyIncorrect = passwordWord.length;
        for(int i =0; passwordWord.length<i;i++){

            if(passwordWord[i].equals(checkingLetter)){
                changeArray();
                break;
                else{
                    howManyIncorrect--;
                }

            }
            if (howManyIncorrect==0){
                System.out.println("Nie ma takiej litery w slowie");
            }
        }
        showResults();

    }

    public static String[] table_(String[] passwordWord){
        String[] tableWith_ = passwordWord;
        for (int i = 0; passwordWord.length<i;i++) {
            tableWith_[i] = "_";
        }

        return tableWith_;
    }

    public static void showResults(){
        System.out.println(final)

    }


    public static void changeArray(){

    }

}
