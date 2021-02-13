package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            String sb = "";
            if (i % 3 == 0) {
                sb += "Fizz";
            }
            if (i % 5 == 0) {
                sb += "Buzz";
            }
            if (sb.equals("")) {
                result.add(i + "");
            } else {
                result.add(sb);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(15).forEach(System.out::println);
    }
}
