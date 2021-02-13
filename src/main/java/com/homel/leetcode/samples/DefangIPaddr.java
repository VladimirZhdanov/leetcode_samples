package com.homel.leetcode.samples;

import java.util.Arrays;

public class DefangIPaddr {

//    public String defangIPaddr(String address) {
//       return address.replace(".", "[.]");
//    }

    public String defangIPaddr(String address) {

        var chars = address.split("");

        var result = Arrays.stream(chars).map(item -> {
            if (item.equals(".")) {
                return "[.]";
            } else {
                return item;
            }
        }).toArray(String[]::new);

        return String.join("", result);
    }

    public static void main(String[] args) {
        DefangIPaddr defangIPaddr = new DefangIPaddr();

        System.out.println(defangIPaddr.defangIPaddr("255.100.50.0"));
    }
}
