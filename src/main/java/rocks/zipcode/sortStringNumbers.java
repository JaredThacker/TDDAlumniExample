package rocks.zipcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sortStringNumbers {
//    Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
//    Task: sort the numbers
//    Restriction: the numbers must stay strings - no converting to integers
//    Edge Cases: Decimals, Negatives, Large number with comma, leading zero nums, spelling out nums, fractions

    public String[] sortNumbers(String[] input) {

        String[] sortedArr = input;

//        Arrays.sort(input, new Comparator<String>()
//        {
//            public int compare(String s1, String s2) {
//                String[] s1Split = s1.split("\\.");
//                String[] s2Split = s2.split("\\.");
//
//                if(s1Split[0].length() > (s2Split[0].length())){
//                    return 1;
//                } else if (s1Split[0].length() < s2Split[0].length()){
//                    return -1;
//                }
//
//                if (s1Split[0].length() == s2Split[0].length()){
//                    return (s1).compareTo(s2);
//                } else {
//                    return Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length()));
//                }
//            }
//        });

        {
            int n = input.length;
            for (int i = 0; i < n - 1; i++)
                // number of times algo runs
                // not most time efficient
                for (int j = 0; j < n - i - 1; j++)
                    // going thru entire array once
                    if (compare(input[j], input[j + 1]) > 0) {
                        //if first num greater than second num swap
                        String temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    }
        }

        return sortedArr;
    }

    public int compare(String s1, String s2) {
        String[] s1Split = s1.split("\\.");
        String[] s2Split = s2.split("\\.");



        if(s1Split[0].length() > (s2Split[0].length())){
            return 1;
        } else if (s1Split[0].length() < s2Split[0].length()){
            return -1;
        }

        if (s1Split[0].length() == s2Split[0].length()){
            return (s1).compareTo(s2);
        } else {
            return Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length()));
        }
    }
}