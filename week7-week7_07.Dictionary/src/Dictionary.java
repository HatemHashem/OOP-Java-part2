import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String>wordTranslation;

    public Dictionary() {
        this.wordTranslation=new HashMap<String, String>();
    }

    public String translate(String word){
        if(wordTranslation.containsKey(word)){
            return wordTranslation.get(word);
        }
        return null;
    }
    public void add(String word, String translation){
        this.wordTranslation.put(word,translation);

    }
    public int amountOfWords(){

        return wordTranslation.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String>wordAndTranslation=new ArrayList<String>();
        for(String word:wordTranslation.keySet()){
            wordAndTranslation.add(word+"="+wordTranslation.get(word));

        }

        return wordAndTranslation;
    }

}
