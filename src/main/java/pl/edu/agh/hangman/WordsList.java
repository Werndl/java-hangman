package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordsList {

    public static ArrayList<String> makingTable() throws FileNotFoundException {
        File file = new File(
                WordsList.class.getClassLoader().getResource("slowa.txt").getFile()
        );

        Scanner words = new Scanner(file);

        ArrayList<String> wordsList = new ArrayList();
        while (words.hasNext()){
            String word = words.next();
            word = word.toLowerCase();
            wordsList.add(word);

        }
        words.close();
        return wordsList;
    }

}
