package com.example.effectivejava;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedT {
    static List<Node> lst = new LinkedList<>();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String args []){
        Node<String> node1 = new Node<>("A");
        Node<String> node2 = new Node<>("B");
        Node<String> node3 = new Node<>("C");
        Node<String> node4 = new Node<>("D");
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
        lst.add(node1);
        lst.add(node2);
        lst.add(node3);
        lst.add(node4);

        lst.stream()
                .filter(
                        x -> {
                            System.out.println("filter1= "+x);
                            System.out.println("===============================");
                            System.out.println(x.hashCode());
                            System.out.println(System.identityHashCode(x));
                            return x.data.equals("A") || x.data.equals("B");
                        })
                .filter(
                        x -> {
                            System.out.println("filter2= "+x);
                            System.out.println("===============================");
                            System.out.println(x.hashCode());
                            System.out.println(System.identityHashCode(x));
                            System.out.println("===============================");
                            return x.equals(node2);
                        })
                .forEach(System.out::println);
        System.out.println("===============================");



        Stream<Node> test1 =  lst.stream().filter(x->x.next.equals(node3));
        System.out.println(test1);
        Stream<Node> test2 = Stream.of(node2);
        System.out.println(test2);
        Stream<Node> test3 = lst.stream().filter(x->x.equals(node2));
        System.out.println(test3);
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test3));
        System.out.println(test1==test3);
        System.out.println("test1= "+test1);
        System.out.println("test3= "+test3);
    }


    static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(data, node.data) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }
    }
}
