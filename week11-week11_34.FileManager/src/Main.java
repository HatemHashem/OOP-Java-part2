
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();
        List<String> tekstit = new ArrayList<String>();
        tekstit.add("eins");
        tekstit.add("zwei");
        tekstit.add("drei");
        t.save("test/tmp/tmp36280.txt",tekstit);
    }
}
