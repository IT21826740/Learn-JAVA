package com.example.strings;

public class StringUtils {
  public static String reverse (String text){
        return new StringBuilder(text).reverse().toString();
    }

    public static String uppercase(String text){
      return text.toUpperCase();
    }
}
