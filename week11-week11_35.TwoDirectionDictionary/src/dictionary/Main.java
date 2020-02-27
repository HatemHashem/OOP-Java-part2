package dictionary;

public class Main {
    public static void main(String[] args) {
        MindfulDictionary s = new MindfulDictionary("test/words.txt");
        s.load();
        s.remove("below");
        s.add("tieokone", "computer");
        s.save();
    }
}
