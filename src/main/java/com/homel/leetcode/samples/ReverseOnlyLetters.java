package com.homel.leetcode.samples;

import java.util.StringJoiner;

import static java.lang.Character.isAlphabetic;
import static java.lang.String.copyValueOf;

/**
 * Anagrams
 * An application that provides method to reverse alphabetic symbols in given string.
 *
 * @author Vladimir Zhdanov (mailto:constHomeSpb@gmail.com)
 * @since 0.1
 */
public class ReverseOnlyLetters {
    private static final String WHITESPACE = " ";

    /**
     * Reverse each alphabetic symbol in given array of char, non-alphabetic will be skipped.
     *
     * @param word - a word with letters that need to be reversed.
     * @return reversed word.
     */
    private String reverseWord(char[] word) {
        int rightPointer = word.length - 1;
        int leftPointer = 0;
        String result = copyValueOf(word);

        while (leftPointer < rightPointer) {
            if (!isAlphabetic(word[leftPointer])) {
                leftPointer++;
            } else if (!isAlphabetic(word[rightPointer])) {
                rightPointer--;
            } else {
                swapLetters(rightPointer, leftPointer, word);
                result = copyValueOf(word);
                leftPointer++;
                rightPointer--;
            }
        }
        return result;
    }

    /**
     * Swap letters on the specified positions: "rightPointer" and "leftPointer".
     *
     * @param rightPointer - right pointer.
     * @param leftPointer - left pointer.
     * @param word - a word for swap letters.
     */
    private void swapLetters(int rightPointer, int leftPointer, char[] word) {
        char temp = word[leftPointer];
        word[leftPointer] = word[rightPointer];
        word[rightPointer] = temp;
    }

    /**
     * Reverse each alphabetic symbol in given string, word by word,
     * non-alphabetic will be skipped.
     *
     * @param string string that you want to reverse
     * @return reversed string
     * @throws IllegalArgumentException throws IAE when put a null.
     */
    public String reverseString(String string) {
        if (string == null) throw new IllegalArgumentException("String should not be null");

        StringJoiner joiner = new StringJoiner(WHITESPACE);
        String[] stringArray = string.split(WHITESPACE);
        for (String s : stringArray) {
            char[] word = s.toCharArray();
            joiner.add(reverseWord(word));
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        System.out.println(reverseOnlyLetters.reverseString("4324home ty3pe"));
    }
}
