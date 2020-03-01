package pl.edu.agh.hangman;

import javax.swing.*;

public class Guessing {

    public static void Checking(String[] passwordWord, String checkingLater ){

        for(int i =0; passwordWord.length<i;i++){

            if(passwordWord[i] == checkingLater){
                // good(); pozniejsza implementacja
                else
                    // bad(); pozniejsza impleementacja
            }
        }

    }

    public static String[] table___(String[] passwordWord){
        String[] tableWith_ = passwordWord;
        for (int i = 0; passwordWord.length<i;i++) {
            tableWith[i] = "_";
        }

        return tableWith_;
    }

}
