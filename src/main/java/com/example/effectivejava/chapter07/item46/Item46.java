package com.example.effectivejava.chapter07.item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Item46 {

    public static void main(String args []) throws FileNotFoundException {
        File file = new File("src/main/resources/words.txt");
        Map<String, Long> freq = new HashMap<>();
        try(Stream<String> words = new Scanner(file).tokens()){
            freq = words.collect(Collectors.groupingBy(String::toLowerCase, counting()));
        }

        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());



        // 잘못된 예시
//        try(Stream<String> words = new Scanner(file).tokens()) {
//            words.forEach(word->{
//                freq.merge(word.toLowerCase(), 1L, Long::sum);
//            });
//
//        }

    }
}

class Artist {

    public String name;
    public String group;

    public Artist(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name) && Objects.equals(group, artist.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

class Album {
    private Artist artist;
    private String name;
    private BigDecimal sale;

    public Album(Artist artist, String name, BigDecimal price) {
        this.artist = artist;
        this.name = name;
        this.sale = price;
    }

    public Artist artist(){
        return artist;
    }
    public String name(){
        return name;
    }

    public BigDecimal sale(){
        return sale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(artist, album.artist) && Objects.equals(name, album.name) && Objects.equals(sale, album.sale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, name, sale);
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist=" + artist +
                ", name='" + name + '\'' +
                ", price=" + sale +
                '}';
    }

    public static void main(String args []){
        List<Album> albums = List.of(
                new Album(new Artist("Alice", null), "Alice", new BigDecimal("39800")),
                new Album(new Artist("Brian", "A"), "The World", new BigDecimal("49000")));

        Map<Artist, Album> topHits = albums.stream().collect(toMap(
                Album::artist, Function.identity(), (oldValue, newValue)->newValue));

        Map<Artist, Album> collect = albums.stream().collect(
                toMap(Album::artist, Function.identity(), BinaryOperator.maxBy(comparing(Album::sale)))
        );

    }
}