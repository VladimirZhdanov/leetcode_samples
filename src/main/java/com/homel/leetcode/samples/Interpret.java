package com.homel.leetcode.samples;

import java.util.StringJoiner;

public class Interpret {

    public String interpret(String command) {
        var chars = command.split("");

        var result = new StringJoiner("");

        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equalsIgnoreCase("G")) {
                result.add(chars[i]);
            } else if (chars[i].equals("(") && chars[i + 1].equals(")")){
               result.add("o");
            } else if (chars[i].equals("(")
                    && chars[i + 1].equalsIgnoreCase("a")
                    && chars[i + 2].equalsIgnoreCase("l")
                    && chars[i + 3].equals(")")) {
                result.add("al");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Interpret interpret = new Interpret();

        System.out.println(interpret.interpret("G()(al)"));
    }
}
