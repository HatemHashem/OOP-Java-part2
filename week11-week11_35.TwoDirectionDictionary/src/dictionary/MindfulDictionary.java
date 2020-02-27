package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    private Map<String, String> dictionary;
    private  File file;

    public MindfulDictionary() {
        dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file)  {
        this.file = new File(file);
        dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        while (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }

    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (dictionary.containsValue(word)) {
            for (String current : dictionary.keySet()) {
                if (dictionary.get(current).equals(word)) {
                    return current;
                }

            }
        }
        return null;
    }
    public void remove(String word){
        if(dictionary.containsKey(word)){
            dictionary.remove(word);
        }else if(dictionary.containsValue(word)){
            for(String currentKey:dictionary.keySet()){
                if(dictionary.get(currentKey).equals(word)){
                  dictionary.remove(currentKey);
                    break;
                }
            }
        }
    }
    public boolean load(){
        try {
            Scanner reader=new Scanner(this.file);
            while (reader.hasNext()){
                String line=reader.nextLine();
                String part[]=line.split(":");
              dictionary.put(part[0],part[1]);

            }
            return true;
        }catch (Exception e){
            System.out.println(e);
        }
       return false;
    }
    public boolean save() {

        FileWriter writer= null;
        try {
            writer = new FileWriter(this.file.getPath());

            for(String currentKey:dictionary.keySet()){
                writer.write(currentKey+":"+dictionary.get(currentKey)+"\n");
            }
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("hey");
        }


           return false;


    }
}
