package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public static void main(String[] args) {
        Map<Integer, String> input = Map.of(
                1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday",
                7, "Sunday",
                10, "Friday");
        KeyValueSwapper keyValueSwapper = new KeyValueSwapper();
        keyValueSwapper.swap(input);
    }

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        if (sourceMap.size() == 0) return result;

        for (Map.Entry<Integer, String> i : sourceMap.entrySet()) {
            result.put(i.getValue(), i.getKey());
        }

        return result;
    }
}
