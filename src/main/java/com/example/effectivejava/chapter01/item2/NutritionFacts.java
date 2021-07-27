package com.example.effectivejava.chapter01.item2;

public class NutritionFacts {

      private int calories;
      private int fat;
      private int sodium;
      private Boolean vitamin;

      public NutritionFacts() {}


    public static void main(String args[]) {

        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setCalories(300);
        nutritionFacts.setFat(30);


        Check check = new Check();
        System.out.println(check.hasVitaminOf(nutritionFacts));

      }


    public Boolean getHasVitamin() {
        return vitamin;
    }

    public void setHasVitamin(Boolean vitamin) {
        this.vitamin = vitamin;
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




}
class Check {

    public Boolean hasVitaminOf(NutritionFacts nutritionFacts){
    System.out.println();
        return nutritionFacts.getHasVitamin();
    }

}


