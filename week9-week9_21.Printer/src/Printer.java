import java.io.File;
import java.util.Scanner;

public class Printer {
    private String fileName;
    private Scanner reader;
    private File f;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
         this.f = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws Exception{
        reader=new Scanner(f);
        while (reader.hasNext()) {
            String line = reader.nextLine();

            if (line.contains(word)) {
                System.out.println(line);
            }

        }


    }

}
