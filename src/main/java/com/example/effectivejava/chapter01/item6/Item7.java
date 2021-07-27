package com.example.effectivejava.chapter01.item6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class Item7 {
  String s = new String("alpha");
  String s2 = "alpha";

  Map<String, String> map = new HashMap<>();
  

  {
    map.put("str1", "str1");
  }

  void print_() {
    for (String key : map.keySet()) {
      String value = map.get(key);
      System.out.println("[key]:" + key + ", [value]:" + value);
    }
  }

  Boolean bl = new Boolean("String");
  Boolean bl2 = Boolean.valueOf("String");

  static boolean isRomanNumeralSlow(String s) {
    return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
  }

  private static final Pattern ROMAN =
      Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

  static boolean isRomanNumeral(String s) {
    return ROMAN.matcher(s).matches();
  }
}
