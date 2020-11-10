package spelling;

import java.util.*;

public class SpellingSuggester {

    private Dictionary dictionary;

    public SpellingSuggester(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getSuggestions(String word) {
        List<String> list = new ArrayList<>();
        //list.add(word); // for testing

        //call the replacements, deletions etc methods and add results to list

        //list.add(replacements(word).toString().replace("[", "").replace("]", "")
         //       + ", " + deletions(word).toString().replace("[", "").replace("]", ""));

        list.addAll(replacements(word));
        list.addAll(deletions(word));

        return list;

    }

    private List<String> replacements(String word) {
        // All replacements of a letter in word

        List<String> list = new ArrayList();

        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (word.charAt(i) != c) {
                    String s = word.substring(0, i) + String.valueOf(c) + word.substring(i + 1);
                    if (dictionary.isWord(s)) {
                        list.add(s);
                    }
                }
            }
        }
        return list;
    }

    private List<String> deletions(String word) {
        // All deletions of a letter in word

        List<String> list = new ArrayList<>();

        for(int i = 0; i < word.length(); i++)
        {
            for (char b = 'a'; b <= 'z'; b++)
            {
                if (word.charAt(i) == b)
                {
                    String delete = word.replace(b, ' ');
                    String deleteSpace = delete.replace(" ", "");
                    if (dictionary.isWord(deleteSpace))
                    {
                        list.add(deleteSpace);
                    }
                }
            }
        }
        return list;
    }

    private List<String> insertions(String word) {
        // All insertions of a letter in word

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<String> transpositions(String word){
        // All transpositions of two letters in word i.e. swap adjacent letters

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
