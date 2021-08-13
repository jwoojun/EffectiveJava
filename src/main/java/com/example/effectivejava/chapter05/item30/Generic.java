package com.example.effectivejava.chapter05.item30;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.UnaryOperator;
public class Generic {

    public static <E>Set<E> union(Set<E> s1,Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

  public static void main(String args[]) {
        String[] strings = {"A", "B", "C"};
        String[] stringsB = {"A", "B", "C"};
        int count=0;
        for(int i=0; i<strings.length; i++){
            if(strings[i].equals(stringsB[i])){
                count++;
            }
      }




//        UnaryOperator<String> sameString = identityFunction();
//        Stream.of(strings)
//                .map(sameString)
//                .forEach(System.out::println);
//
//        Number[] numbers = {1, 2.0, 3L};
//        UnaryOperator<Number> sameNumber = identityFunction();
//        Stream.of(numbers)
//                .map(sameNumber)
//                .forEach(System.out::println);

//        Set<String> alph_a = Set.of("A", "B", "C");
//        Set<String> alpha_b = Set.of("D", "E", "F");
//        Set<String> alpha_c = union(alph_a, alpha_b);
//        System.out.println(alpha_c);
    }


    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }

      public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty()) {
          throw new IllegalArgumentException("컬렉션이 비어있습니다.");
        }

        E result = null;
        for (E e : c) {
          if (result == null || e.compareTo(result) > 0) {
            result = Objects.requireNonNull(e);
          }
        }
        return result;
      }
}

interface Comparable<T> {
    int compareTo(T o);
}

interface Human {}

@ToString
class Person {
      private String name;

      void speak(String talk) {
        System.out.println(talk);
      }

      public String getName() {
        return name;
      }
}

@ToString
class Parent extends Person implements Human {
      private String name;

      public Human test(String str) {
        return new Child(str);
      }

      public static void main(String args[]) {
        Parent parent = new Parent();
        var child = (Child) new Parent().test("김태영");
        System.out.println(child);
      }
}

@Getter
@Setter
class Child extends Person implements Human {
      private String name;

      public Child(String name) {
        this.name = name;
      }
}

enum Day implements Human {
      MONDAY;

      public Human test3() {
        return Day.MONDAY;
      }

      public static void main(String args[]) {
        Day day = Day.MONDAY;
        System.out.println(day.test3());
      }
}
