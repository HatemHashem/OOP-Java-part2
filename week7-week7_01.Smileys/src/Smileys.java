public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");


    }

    private static void printWithSmileys(String word){
        int numberOfSmiles;
        String smiley=":)";

        if(word.length()%2!=0){
            word+=" ";
        }
        //refactor this
        numberOfSmiles=word.length()+2+(smiley.length()*2);
        printSmilesRow(numberOfSmiles);
        System.out.println(smiley+" "+word+" "+smiley);
        //refactor this
       printSmilesRow(numberOfSmiles);
    }
    private static void printSmilesRow(int numberOfSmiles){
        for(int i=0;i<numberOfSmiles/2;i++){
            System.out.print(":)");
        }
        System.out.println();

    }
}
