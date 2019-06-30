import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> translate;

    public Dictionary() {
        this.translate = new HashMap<String, String>();
    }

    public String translate(String word) {
        String tWord = this.translate.get(word);
        return tWord;
    }

    public void add(String word, String translation) {
        this.translate.put(word, translation);
    }

    public int amountOfWords(){
        return this.translate.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> trans = new ArrayList<String>();

        for (String key : this.translate.keySet() ) {
            trans.add(key + " = " + this.translate.get(key));
        }
        return trans;
    }
}
