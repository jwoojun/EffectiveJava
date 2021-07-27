package com.example.effectivejava;




interface Person {
    void personSpeak();

    static void personStaticSpeak() {
      System.out.println("Person Static");
    }
}


class Parent implements Person {
    public void speak() {
      System.out.println("Parent Speak");
    }

    public static void parentStaticSpeak() {
      System.out.println("Parent Static-Speak");
    }

    public void personSpeak() {
      System.out.println("Parent Person-Speak");
    }
}


class Child extends Parent {
    @Override
    public void speak() {
      System.out.println("Child Speak");
    }

    @Override
    public void personSpeak() {
      System.out.println("Child Person-Speak");
    }
}



public class Binding  {

  public static void main(String args[]) {
    Parent parent = new Parent();
    parent.speak();
    parent.personSpeak();

    System.out.println("===================");

    Parent child = new Child();
    child.speak();
    child.personSpeak();
  }

}