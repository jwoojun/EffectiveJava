package com.example.effectivejava.chapter01.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
  public enum Topping {
    HAM,
    MUSHROOM,
    ONION,
    PEPPER,
    SAUSAGE
  }

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
}
