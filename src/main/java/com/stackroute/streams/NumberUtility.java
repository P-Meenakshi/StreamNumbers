package com.stackroute.streams;
import java.util.ArrayList;
import java.util.*;



/**
 * Utility class for analyzing numbers in a List
 */
public class NumberUtility {
    int count=0;
    /**
     * Returns count of even numbers in the given list of integers
     * Returns 0 if there are no even numbers or if the passed list is null
     */
    public long getEvenNumberCount(List<Integer> numbers) {
        if( numbers==null|| numbers.size()==0)
        {return count;}
        for (int e : numbers) {
            if (e % 2 == 0)
            {count++;}
        }
        return count;
    }

    /**
     * Returns a list of even multiples of three from the given list of integers
     * Returns empty List, is the given list is null or empty
     */
    public List<Integer> getEvenMultiplesOfThree(List<Integer> numbers) {
        List<Integer> num = new ArrayList<>();
        if(numbers==null|| numbers.isEmpty())
        { return num;}

        else
        for( int num1:numbers)

            if ((num1 % 3 == 0) && (num1 % 2 == 0))
            {
                num.add(num1);
            }


        return num;
    }
    /**
     * Returns maximum of odd numbers
     * Returns 0 if there are no odd numbers or if the passed list is null
     */
    public Integer getMaximumOfOddNumbers(List<Integer> numbers) {
      if( numbers==null|| numbers.isEmpty()){return 0;}
        List<Integer> num2 = new ArrayList<>();
        for(Integer number: numbers){
            if(number % 2!=0)
            {
                num2.add(number);
            }
        }
        if((num2.size()==0) )
        {return 0;}
        else
            return Collections.max(num2);
}}