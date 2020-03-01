package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordsList {

    public static ArrayList<String> makingTable() throws FileNotFoundException {
        Scanner words = new Scanner(new File("C:/Users/Student20/IdeaProjects/java-hangman/src/main/resources/slowa.txt"));
        ArrayList<String> wordsList = new ArrayList();
        while (words.hasNext()){
            wordsList.add(words.next());
        }
        words.close();
        return wordsList;
    }
}
