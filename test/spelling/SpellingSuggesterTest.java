package spelling;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpellingSuggesterTest {

    @Test
    void getSuggestions()
    {
        Dictionary test = new DictionaryTreeSet();

        List<String> expect = Arrays.asList("cher", "sher", "teer", "tier", "thar", "thir", "thor", "thea", "theb", "thed", "thee", "them", "then", "theo", "thew", "they", "her", "ter", "the");

        SpellingSuggester testSuggest = new SpellingSuggester(test);
        List<String> list = testSuggest.getSuggestions("ther");

        System.out.print(list.toString());

        assertArrayEquals(expect.toArray(), list.toArray());
    }

}