package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private HashMap<String,Set<String>>wordAndTranslations;

    public PersonalMultipleEntryDictionary() {
        wordAndTranslations=new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {

        if(!wordAndTranslations.containsKey(word)){
            wordAndTranslations.put(word,new HashSet<String>());
            }
            this.wordAndTranslations.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        Set<String>translations=new HashSet<String>();
       if(wordAndTranslations.containsKey(word)){
           translations=wordAndTranslations.get(word);
           return translations;
       }

        return null;
    }

    @Override
    public void remove(String word) {
        if(wordAndTranslations.containsKey(word)){
            wordAndTranslations.remove(word);
        }
    }
}
