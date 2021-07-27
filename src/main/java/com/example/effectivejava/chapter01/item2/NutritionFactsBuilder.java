package com.example.effectivejava.chapter01.item2;

public class NutritionFactsBuilder {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {
    // 필수 매개변수
    private final int servingSize;
    private final int servings;

    // 선택 매개변수
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int value) {
      this.calories = value;
      return this;
    }

    public Builder fat(int value) {
      this.fat = value;
      return this;
    }

    public Builder sodium(int value) {
      this.sodium = value;
      return this;
    }

    public Builder carbohydrate(int value) {
      this.carbohydrate = value;
      return this;
    }

    public NutritionFactsBuilder builder() {
      return new NutritionFactsBuilder(this);
    }
  }

  private NutritionFactsBuilder(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }

  public static void main(String args[]) {
    NutritionFactsBuilder nb =
        new Builder(240, 8).calories(100).sodium(35).carbohydrate(27).builder();
  }
}
