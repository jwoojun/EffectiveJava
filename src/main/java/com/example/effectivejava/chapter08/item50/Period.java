package com.example.effectivejava.chapter08.item50;

import java.util.Date;

public class Period {
      private final Date start;
      private final Date end;

      public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(end) > 0) {
          throw new IllegalAccessError(start + "가 " + end + "보다 늦다.");
        }
      }

      public Date start(){
          return new Date(start.getTime());
      }

      public Date end(){
          return new Date(end.getTime());
      }
}


//    public Period(Date start, Date end) {
//        if (start.compareTo(end) > 0) {
//          throw new IllegalAccessError(start + "가 " + end + "보다 늦다.");
//        }
//        this.start = start;
//        this.end = end;
//      }


//    public static void main(String args []){
//        Date start = new Date();
//        Date end = new Date();
//        Period p = new Period(start, end);
//        end.setYear(78);
//    }