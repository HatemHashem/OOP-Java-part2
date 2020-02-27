package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection wordInspection=new WordInspection(file);
        try {
            System.out.println(wordInspection.wordCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(wordInspection.wordsContainingZ().size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(wordInspection.palindromes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(wordInspection.wordsWhichContainAllVowels());

    }


}
