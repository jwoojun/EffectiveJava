package com.example.effectivejava.chapter07.item47;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class PowerSet {
      public static final <E> Collection<Set<E>> of(Set<E> s) {
        List<E> src = new ArrayList<>(s);
        if (src.size() > 30) {
          throw new IllegalArgumentException("원소가 너무 많습니다. 최대 30개 이하만 가능합니다.");
        }
        return new AbstractList<Set<E>>() {

          @Override
          public Set<E> get(int index) {
            Set<E> result = new HashSet<>();
            for (int i = 0; index != 0; i++, index >>= 1) {
              if ((index & 1) == 1) result.add(src.get(i));
            }
            return result;
          }

          @Override
          public int size() {
            return 1 << src.size();
          }

          @Override
          public boolean contains(Object o) {
            return o instanceof Set && src.containsAll((Set) o);
          }
        };
      }

//      public void invalid(){
//            for(ProcessHandle ph : ProcessHandle.allProcesses()::iterator;){
//
//          }
//
//      }

    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }


    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
