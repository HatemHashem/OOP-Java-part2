import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");

        if (clockTime(reader.nextLine())) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }


    }

    public static boolean isAWeekDay(String string) {

        if (string.matches("(mon|tue|wed|thu|fri|sat|sun)")) {
            return true;
        }
        return false;

    }

    public static boolean allVowels(String string) {

        //finland vowels
        if (string.matches("(a|e|i|o|u|ö|ä)+")) {
            return true;
        }
        return false;
    }

    public static boolean clockTime(String string) {
        if (string.matches("((0|1)[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        }
        return false;
    }
}
