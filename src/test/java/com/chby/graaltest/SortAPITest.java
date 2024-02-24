package com.chby.graaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class SortAPITest {
    @Test
    public void generateNums() {
        SortAPI sortAPI = new SortAPI();
        int count = 10;
        List<Integer> sorted = sortAPI.getSortedList(count, 1, 9);

        List<Integer> resort = sorted.stream().sorted().collect(Collectors.toList());
        Assertions.assertIterableEquals(sorted, resort);
        assert(sorted.size() == count);
    }

}