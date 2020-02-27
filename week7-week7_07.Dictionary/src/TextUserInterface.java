import java.util.Scanner;

public class TextUserInterface {
    private Dictionary dictionary;
    private Scanner scanner;

    public TextUserInterface( Scanner scanner,Dictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Statements:\n" +
                "  add - adds a word pair to the dictionary\n" +
                "  translate - asks a word and prints its translation\n" +
                "  quit - quits the text user interface");
        String input=scanner.nextLine();
        while (true) {
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;

            }else if(input.equals("add")){
                System.out.println("test");
               this.add();
                System.out.print("Statement:");
                input=scanner.nextLine();
            }else if(input.equals("translate")){
               this.translate();
                System.out.print("Statement:");
                input=scanner.nextLine();
            } else {
                System.out.println("Unknown statement");
                System.out.print("Statement:");
                input=scanner.nextLine();
            }
        }
    }
    public void add(){
        System.out.print("In Finnish: ");
        String finnish=scanner.nextLine();
        System.out.print("Translation: ");
        String translation=scanner.nextLine();
        this.dictionary.add(finnish,translation);
        System.out.println();
    }
    public void translate(){
        System.out.print("Give a word: ");
        String word=scanner.nextLine();
         String translation=dictionary.translate(word);
        System.out.println("Translation: "+translation);
        System.out.println();

    }
}
