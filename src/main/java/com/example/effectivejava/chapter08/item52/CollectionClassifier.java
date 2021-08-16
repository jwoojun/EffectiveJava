package com.example.effectivejava.chapter08.item52;

import java.util.*;

public class CollectionClassifier {
      public String classify(Set<?> s) {
            return "Set";
      }

      public String classify(List<?> lst) {
            return "List";
      }

      public String classify(Collection<?> c) {
            return "Etc..";
      }

      public static void main(String args[]) {
            CollectionClassifier cc = new CollectionClassifier();
            Collection<?>[] collections = {
              new HashSet<>(), new ArrayList<>(), new HashMap<String, String>().values()
            };

            for (Collection<?> c : collections) {
              System.out.println(cc.classify(c));
            }
      }
}

