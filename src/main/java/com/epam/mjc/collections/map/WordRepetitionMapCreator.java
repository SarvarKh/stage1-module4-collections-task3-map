package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public static void main(String[] args) {
        String input = "hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe.";
        WordRepetitionMapCreator wrmc = new WordRepetitionMapCreator();
        wrmc.createWordRepetitionMap(input);
    }

    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        if (sentence.length() == 0) {
            return resultMap;
        }

        sentence = sentence.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] sentenceArr = sentence.split(" ");

        for (int i = 0; i < sentenceArr.length; i++) {
            if (resultMap.containsKey(sentenceArr[i])) {
                resultMap.put(sentenceArr[i], resultMap.get(sentenceArr[i]) + 1);
            } else {
                resultMap.put(sentenceArr[i], 1);
            }
        }

        System.out.println(resultMap);
        return resultMap;
    }
}
