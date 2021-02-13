package com.homel.leetcode.samples;

// Given the array candies and the integer extraCandies,
// where candies[i] represents the number of candies that the ith kid has.
// For each kid check if there is a way to distribute extraCandies among
// the kids such that he or she can have the greatest number of candies among them.
// Notice that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = 0;

        for (int amount : candies) {
            if (amount > max) {
                max = amount;
            }
        }

        for (int amount : candies) {
            boolean bool = amount + extraCandies >= max;
            result.add(bool);
        }

        return result;
    }


    public static void main(String[] args) {
        KidsWithCandies kidsWithCandies = new KidsWithCandies();
        System.out.println(kidsWithCandies.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }
}
