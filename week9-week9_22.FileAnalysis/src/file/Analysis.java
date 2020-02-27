package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    private ArrayList<String> lines;

    public Analysis(File file) {
        lines = new ArrayList<String>();

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String line = reader.nextLine();
                line+="\n";
                lines.add(line);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public int lines() {
        return lines.size();
    }
    public int characters() {
        int numbOfCharacters=0;
        for (String line : lines) {
            for(int i=0;i<line.length();i++){
                numbOfCharacters++;
            }


        }

        return numbOfCharacters;
    }
}
