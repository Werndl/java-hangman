package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordsList {

    public static ArrayList<String> makingTable() {
        Scanner words = null;
        try {
            words = new Scanner(new File("slowa.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> wordsList = new ArrayList();
        while (words.hasNext()){
            wordsList.add(words.next());
        }
        words.close();
        //return null;
    }
}
