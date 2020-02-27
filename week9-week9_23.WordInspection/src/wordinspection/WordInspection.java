package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    private ArrayList<String> lines;

    public WordInspection(File file) {
        this.file = file;
        lines = new ArrayList<String>();
    }

    public int wordCount() throws Exception {

        Scanner reader = new Scanner(this.file);
        int countWords = 0;

        while (reader.hasNext()) {
            lines.add(reader.nextLine());


        }


        return lines.size();
    }

    public List<String> wordsContainingZ() throws Exception {
        Scanner reader = new Scanner(this.file);
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNext()) {
            String line = reader.nextLine();
            if (line.contains("z")) {
                list.add(line);
            }
        }

        return list;
    }

    public List<String> wordsEndingInL() throws Exception {
        Scanner reader = new Scanner(this.file);
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNext()) {
            String line = reader.nextLine();
            if (line.endsWith("l")) {
                list.add(line);
            }
        }

        return list;
    }

    public List<String> palindromes() throws Exception {
        Scanner reader = new Scanner(this.file);
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNext()) {
            String line = reader.nextLine();
            for (int i = 0, j = line.length() - 1; i < line.length() && j >= 0; i++, j--) {
                int mid = (int) Math.floor(line.length() / 2);
                if (line.charAt(i) != line.charAt(j)) {
                    break;
                } else if (i == mid) {
                    list.add(line);

                }
            }
        }

        return list;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        Scanner reader = new Scanner(this.file);
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNext()) {
            String line = reader.nextLine();
            if (line.contains("a") && line.contains("e") && line.contains("i") && line.contains("o") && line.contains("u") && line.contains("y") && line.contains("ä") && line.contains("ö")) {
                list.add(line);
            }

        }
        return list;
    }
}

