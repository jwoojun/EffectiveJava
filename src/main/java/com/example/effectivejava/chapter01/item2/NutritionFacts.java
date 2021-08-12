package com.example.effectivejava.chapter01.item2;

//public class NutritionFacts {
//      private final int servingSize;
//      private final int servings;
//      private final int calories;
//      private final int fat;
//      private final int sodium;
//      private final int carbohydrate;
//
//      public NutritionFacts(int servingSize, int servings) {
//        this(servingSize, servings, 0);
//      }
//
//      public NutritionFacts(int servingSize, int servings, int calories) {
//        this(servingSize, servings, calories, 0);
//      }
//
//      public NutritionFacts(int servingSize, int servings, int calories, int fat) {
//        this(servingSize, servings, calories, fat, 0);
//      }
//
//      public NutritionFacts(int servingSize, int servings, int calories, int fat, int carbohydrate) {
//        this(servingSize, servings, calories, fat, carbohydrate, 0);
//      }
//
//      public NutritionFacts(
//          int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = fat;
//        this.sodium = sodium;
//        this.carbohydrate = carbohydrate;
//      }
//}

// public class NutritionFacts {
//
//      private int calories;
//      private int fat;
//      private int sodium;
//      private Boolean vitamin;
//
//      public NutritionFacts() {}
//
//
//    public static void main(String args[]) {
//
//        NutritionFacts nutritionFacts = new NutritionFacts();
//        nutritionFacts.setCalories(300);
//        nutritionFacts.setFat(30);
//
//
//        Check check = new Check();
//        System.out.println(check.hasVitaminOf(nutritionFacts));
//
//      }
//
//
//    public Boolean getHasVitamin() {
//        return vitamin;
//    }
//
//    public void setHasVitamin(Boolean vitamin) {
//        this.vitamin = vitamin;
//    }
//
//    public int getCalories() {
//        return calories;
//    }
//
//    public void setCalories(int calories) {
//        this.calories = calories;
//    }
//
//    public int getFat() {
//        return fat;
//    }
//
//    public void setFat(int fat) {
//        this.fat = fat;
//    }
//
//    public int getSodium() {
//        return sodium;
//    }
//
//    public void setSodium(int sodium) {
//        this.sodium = sodium;
//    }
//
//
//
//
// }
// class Check {
//
//    public Boolean hasVitaminOf(NutritionFacts nutritionFacts){
//    System.out.println();
//        return nutritionFacts.getHasVitamin();
//    }
//
// }
//
//
