package com.chby.graaltest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class SortAPI {
    @GetMapping("/sorted_random")
    public @ResponseBody String getSorted(@RequestParam int count, @RequestParam int start, @RequestParam int end) {
        return getSortedList(count, start, end).toString();
    }

    public List<Integer> getSortedList( int count,int start, int end) {
        ThreadLocalRandom tl = ThreadLocalRandom.current();
        IntStream ints = tl.ints(count, start, end);
        return ints.boxed()
                .sorted()
                .collect(Collectors.toList());
    }
}
