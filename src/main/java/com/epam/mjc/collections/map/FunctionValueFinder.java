package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public static void main(String[] args) {
        FunctionValueFinder func = new FunctionValueFinder();
        List<Integer> sourceList = List.of(2, -6, 10, 19, 55, 11);
        func.isFunctionValuePresent(sourceList, 52);
    }

    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if (functionMap.containsValue(requiredValue)) {
            return true;
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer i : sourceList) {
            result.put(i, 5*i+2);
        }

        return result;
    }
}
