package com.example.effectivejava.chapter09.item60;

import java.math.BigDecimal;

public class Item60 {
    public static void main(String args []){
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price)>=0; price = price.add(price)){
            funds.subtract(price);
            itemBought++;
        }

        System.out.println(itemBought + "개 구입");
        System.out.println("잔돈(달러): " + funds);






//        double funds = 1.00;
//        int itemBought = 0;
//        for(double price = 0.10; funds >= price; price += 0.10) {
//            funds -= price;
//            itemBought++;
//        }
//
//        System.out.println(itemBought + "개 구입");
//        System.out.println("잔돈(달러): " + funds);

    }
}


//System.out.println("1.03 - 0.42= "+(1.03-0.42));
//        System.out.println("1.00 - 9 * 0.1= "+(1.00-9*0.10));


