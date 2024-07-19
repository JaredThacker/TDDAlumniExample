package rocks.zipcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sortStringNumbers {
//    Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
//    Task: sort the numbers
//    Restriction: the numbers must stay strings - no converting to integers
//    Edge Cases: Decimals, Negatives, Large number with comma

    public String[] sortNumbers(String[] input) {

        String[] sortedArr = input;

        Arrays.sort(input, new Comparator<String>()
        {
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
        });

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