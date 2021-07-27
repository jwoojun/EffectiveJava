package com.example.effectivejava.chapter01.item1;


public class Member {

    private Long id;
    private String name;
    private int age;
    private int height;

    public static void main(String args []){
        Boolean a = Boolean.valueOf("true");
    System.out.println(a);
    }

    public Member(Long id, String name, int age, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Member(Long id, int age, String name, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Member(Long id, int age, int height, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }





    public static Member createMember(Long id, String name, int age, int height){
        Member member = new Member();
        member.setId(id);
        member.setName(name);
        member.setAge(age);
        member.setHeight(height);
        return member;
    }

    Member(){};
    public static Member createMember(Long id, String name, int height){
        Member member = new Member();
        member.setId(id);
        member.setName(name);
        member.setHeight(height);
        return member;
    }

    public static Member createMember(Long id, String name){
        Member member = new Member();
        member.setId(id);
        member.setName(name);
        return member;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
