package com.example.effectivejava.chapter04.item18;

import lombok.ToString;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;
class InstrumentedSet2<E> extends ForwardingSet<E>{
    private int addCount = 0;
    public InstrumentedSet2(Set<E> s) {
        super(s);
    }


}

public class ForwardingSet<E> implements Set<E> {
    private final Set<E> s;
    public ForwardingSet(Set<E> s) {this.s = s;}

    public int size() {return s.size();}
    public boolean isEmpty() {return s.isEmpty();}
    public boolean contains(Object o) {return s.contains(o);}
    public Iterator<E> iterator() {return s.iterator();}
    public Object[] toArray() {return s.toArray();}
    public <T> T[] toArray(T[] a) {return s.toArray(a);}
    public boolean add(E e) {return s.add(e);}
    public boolean remove(Object o) {return s.remove(o);}
    public boolean containsAll(Collection<?> c) {return s.containsAll(c);}
    public boolean addAll(Collection<? extends E> c) {return s.addAll(c);}
    public boolean retainAll(Collection<?> c) {return s.retainAll(c);}
    public boolean removeAll(Collection<?> c) {return s.removeAll(c);}
    public void clear() {s.clear();}

    @Override
    public String toString() {return "ForwardingSet{" + "s=" + s + '}';}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForwardingSet<?> that = (ForwardingSet<?>) o;
        return Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }


    static void walk(Set<LocalDate> times){
        InstrumentedSet2<LocalDate> iTimes = new InstrumentedSet2<>(times);
    }

    static void test(final Person person){
        person.name = "asdf";
    System.out.println(person);
    }
    public static void main(String args []){
        Person person =new Person();
        person.name = "aaaa";
        test(person);

//        Set<Instant> times = new InstrumentedHashSet<>(new TreeSet<>());
//        Set<E> s = new InstrumentedHashSet<>(new HashSet<>(INIT_CAPACITY))

    }

    @ToString
    static class Person{
        public String name;

    }

}



