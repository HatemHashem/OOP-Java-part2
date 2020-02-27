package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
 private Set<String>words;
 private int numbOfDub;

    public PersonalDuplicateRemover() {
        words=new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if(words.contains(characterString)){
            numbOfDub++;
        }
        words.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.numbOfDub;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.words;
    }

    @Override
    public void empty() {
        this.words.clear();
        this.numbOfDub=0;

    }
}
