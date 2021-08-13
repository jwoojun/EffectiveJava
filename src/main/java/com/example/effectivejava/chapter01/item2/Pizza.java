package com.example.effectivejava.chapter01.item2;

import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;



public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
      EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

      public T addTopping(Topping topping) {
        toppings.add(Objects.requireNonNull(topping));
        return self();
      }

      abstract Pizza builder();

      // 하위 클래스에서 이 메서드를 재정의해서
      // this를 반환하도록 한다.
      protected abstract T self();
  }

    Pizza(Builder<?> builder) {
      toppings = builder.toppings.clone();
    }
    public static void main(String args []){
        String a = "123";
        int k = 123;
        int [] kk = new int[k];


    }
}


class NyPizza extends Pizza{
    public enum Size{SMALL, MEDIUM, LARGE};
    private final Size size;

    static class Builder extends Pizza.Builder<Builder>{
      private final Size size;

      public Builder(Size size){
        this.size = Objects.requireNonNull(size);
      }

      @Override
      Pizza builder() {
        return new NyPizza(this);
      }

      @Override
      protected Builder self() {
        return this;
      }
    }

    private NyPizza(Builder builder){
      super(builder);
      size = builder.size;
    }

}
