package com.stackroute.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * Utility class for analyzing numbers in a List
 */
public class NumberUtility {

    /**
     * Returns count of even numbers in the given list of integers
     * Returns 0 if there are no even numbers or if the passed list is null
     */
    public long getEvenNumberCount(List<Integer> numbers) {
        if(numbers == null){
            return 0;
        }

        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
    }

    /**
     * Returns a list of even multiples of three from the given list of integers
     * Returns empty List, is the given list is null or empty
     */
    public List<Integer> getEvenMultiplesOfThree(List<Integer> numbers) {
        if (numbers == null) {
            return Collections.emptyList();
        }
        return numbers.stream()
                .filter(number -> number % 2 == 0 && number % 3 == 0)
                .collect(Collectors.toList());
    }

    /**
     * Returns maximum of odd numbers
     * Returns 0 if there are no odd numbers or if the passed list is null
     */
    public Integer getMaximumOfOddNumbers(List<Integer> numbers) {
        if(numbers == null){
            return 0;
        }
        final Optional<Integer> max = numbers.stream()
                .filter(number -> number % 2 != 0)
                .max(Comparator.comparing(Integer::intValue));

        return max.orElse(0);
    }

}