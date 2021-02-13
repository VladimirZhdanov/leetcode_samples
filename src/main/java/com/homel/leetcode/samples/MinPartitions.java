package com.homel.leetcode.samples;


// A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
// For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
// Given a string n that represents a positive decimal integer,
// return the minimum number of positive deci-binary numbers needed so that they sum up to n.

public class MinPartitions {

    public int minPartitions(String n) {
        int m = Integer.MIN_VALUE;

        for(int i = 0; i < n.length(); i++) {

            int temp = n.charAt(i) - '0'; // 51 - 48 = 3     50 - 48 = 2

            if (temp > m) {
                m = temp;
            }
        }

        return m;
    }

    public static void main(String[] args) {
        MinPartitions minPartitions = new MinPartitions();
        System.out.println(minPartitions.minPartitions("32"));
    }
}