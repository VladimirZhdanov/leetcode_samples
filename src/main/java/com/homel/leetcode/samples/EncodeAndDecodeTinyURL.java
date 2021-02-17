package com.homel.leetcode.samples;

import java.util.HashMap;

public class EncodeAndDecodeTinyURL {

    HashMap<String, String> db = new HashMap<>();
    String baseUrl = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = baseUrl + longUrl.hashCode();
        db.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return db.get(shortUrl);
    }

    public static void main(String[] args) {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";

        EncodeAndDecodeTinyURL test = new EncodeAndDecodeTinyURL();
        String shortUrl = test.encode(longUrl);
        System.out.println("Short url: " + shortUrl);
        System.out.println("Long url: " + test.decode(shortUrl));
    }
}
