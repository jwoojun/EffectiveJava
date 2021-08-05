package com.example.effectivejava.chapter2.item12;


import lombok.Getter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

//@Getter
public class ToStringParent {

      private String areaCode;
      private String prefix;
      private String lineNum;

      public ToStringParent(String areaCode, String prefix, String lineNum) {
            this.areaCode = areaCode;
            this.prefix = prefix;
            this.lineNum = lineNum;
      }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getLineNum() {
        return lineNum;
    }

    /**
       * 해당 문자열은 "XXX-YYY-ZZZZ" 형태의 12글자로 구성된다.
       * XXX는 지역코드, YYY는 프리픽스, ZZZZ는 가입자 번호이며
       * 각각의 대문자는 10진수 숫자 하나를 나타낸다.
       *
       * 전화번호의 각 부분의 값이 너무 작아서 자릿수를 채울 수 없다면
       * 앞에서부터 0으로 채워나간다.
       * ex) 123 -> 0123
       * */
//      @Override
//      public String toString() {
//        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
//
//      }


      @Override
      public String toString() {
            return "ToStringExample{" +
                    "areaCode='" + areaCode + '\'' +
                    ", prefix='" + prefix + '\'' +
                    ", lineNum='" + lineNum + '\'' +
                    '}';
      }

}

@Getter
class ToStringChild extends ToStringParent {

      private String country;

      public ToStringChild(String areaCode, String prefix, String lineNum, String country) {
        super(areaCode, prefix, lineNum);
        this.country = country;
      }

     // @Override
     // public String toString() {
     //   return "ToStringChild{" + "country='" + country + '\'' + '}';
     // }

      @Override
      public String toString() {
        return "ToStringChild{" + "country='" + country + '\'' + ", "+
                "areaCode='" + super.getAreaCode() + '\''+", " +
                "prefix='" + super.getPrefix()+'\''+", "+
                "lineNum='" + super.getLineNum()+"}";
      }

      public static void main(String args[]) {
        ToStringParent parent = new ToStringParent("123", "456", "7890");
        System.out.println(parent);
        System.out.println(parent.toString());

        ToStringChild child = new ToStringChild("123", "456", "7890", "Korea");
        System.out.println(child.toString());


        BigDecimal bigDecimal = new BigDecimal("30033333333033324234829103481333333");
        System.out.println(bigDecimal.toPlainString());
        System.out.println(bigDecimal.toPlainString().getClass());

      }

}

class LoggerTest {

      Logger logger = LoggerFactory.getLogger(this.getClass());

      public void log() {
        ToStringChild child = new ToStringChild("123", "456", "7890", "Korea");
        logger.info("Child={}", String.valueOf(child));
      }

      public static void main(String args[]) {
        LoggerTest loggerTest = new LoggerTest();
        loggerTest.log();
      }

}

enum DayOfTheWeek{

    SUNDAY("A",1), MONDAY("B",2), TUESDAY("C",3),
    WEDNESDAY("D", 4), THURSDAY("E", 5), FRIDAY("F", 6),
    SATURDAY("G",7);

    private final String alpha;
    private final int number;

    DayOfTheWeek(String alpha, int number) {
        this.alpha = alpha;
        this.number = number;
    }

    public static void main(String args []){
        System.out.println(DayOfTheWeek.MONDAY);
        System.out.println(MONDAY);
    }

        @Override
    public String toString() {
        return "EnumToString{" +
                "alpha='" + alpha + '\'' +
                ", number=" + number +
                '}';
    }


      /** final이기 때문에 재정의 불가 */
      //@Override
      //public String name() {
      //  return "";
      //}
}





@ToString
class LombokTest{

      private String name;

      @ToString.Exclude
      private int age;

      public LombokTest(String name, int age) {
        this.name = name;
        this.age = age;
      }

      public static void main(String args[]) {
        LombokTest lombokTest = new LombokTest("Jake", 20);
        System.out.println(lombokTest);
      }
}

