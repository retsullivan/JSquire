package kihons;

import framework.bases.MapKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKihon extends MapKihonBase {

    @Override
    protected Map<String, String> createMapOfStringToString() {
        return new HashMap<>();
    }
    @Override
    protected void addKeyAndValueToMap(Map<String, String> inputMap, String key, String value) {
        inputMap.put(key, value);
    }

    @Override
    protected String getTheValueAtThisKey(Map<String, String> inputMap, String key) {
        return inputMap.get(key);
    }

    @Override
    protected boolean doesMapContainKey(Map<String, String> inputMap, String input) {
        return inputMap.containsKey(input);
    }

    @Override
    protected void removeKeyFromMap(Map<String, String> inputMap, String key) {
        inputMap.remove(key);
    }

    @Override
    protected int countUniqueWordsInList(List<String> inputWords) {
        int uniqueWords = 0;
        Map<String, Integer> map = new HashMap<>();
        for (var word : inputWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
                uniqueWords++;
            }
        }
        return uniqueWords;

//        Map<String,Integer> map = new HashMap<>();
//        for (String word: inputWords) {
//            if (map.containsKey(word)){
//                map.put(word, +1);
//            }
//            else map.put(word, 1);
//        }
//        return map.size();
    }

}
