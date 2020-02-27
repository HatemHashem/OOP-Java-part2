package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/testfile.txt");
        Analysis fileAnalysis=new Analysis(file);
        System.out.println(fileAnalysis.lines());
        System.out.println(fileAnalysis.characters());



    }


}