package com.example.effectivejava.chapter01.item2;

public class NutritionFact {
  //        private final int servingSize;
  //        private final int servings;
  //        private final int calories;
  //        private final int fat;
  //        private final int sodium;
  //        private final int carbohydrate;
  private int servingSize;
  private int servings;
  private int calories;
  private int fat;
  private int sodium;
  private int carbohydrate;

  public NutritionFact() {}

  public NutritionFact(int servingSize, int servings) {
    this(servingSize, servings, 0);
  }

  public NutritionFact(int servingSize, int servings, int calories) {
    this(servingSize, servings, calories, 0);
  }



  public NutritionFact(int servingSize, int servings, int calories, int fat) {
    this(servingSize, servings, calories, fat, 0);
  }

  public NutritionFact(int servingSize, int servings, int calories, int fat, int carbohydrate) {
    this(servingSize, servings, calories, fat, carbohydrate, 0);
  }

  public NutritionFact(
      int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
    this.servingSize = servingSize;
    this.servings = servings;
    this.calories = calories;
    this.fat = fat;
    this.sodium = sodium;
    this.carbohydrate = carbohydrate;
  }

  public int getServingSize() {
    return servingSize;
  }

  public void setServingSize(int servingSize) {
    this.servingSize = servingSize;
  }

  public int getServings() {
    return servings;
  }

  public void setServings(int servings) {
    this.servings = servings;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public int getFat() {
    return fat;
  }

  public void setFat(int fat) {
    this.fat = fat;
  }

  public int getSodium() {
    return sodium;
  }

  public void setSodium(int sodium) {
    this.sodium = sodium;
  }

  public int getCarbohydrate() {
    return carbohydrate;
  }

  public void setCarbohydrate(int carbohydrate) {
    this.carbohydrate = carbohydrate;
  }

  public static void main(String args[]) {

    NutritionFact ide = new NutritionFact(3, 3, 4, 5, 3);
    NutritionFact noIde = new NutritionFact(3, 3, 4, 5, 3);

    NutritionFact nutritionFacts = new NutritionFact();
    nutritionFacts.setCalories(300);
    nutritionFacts.setFat(30);
    nutritionFacts.setSodium(30);
  }
}
