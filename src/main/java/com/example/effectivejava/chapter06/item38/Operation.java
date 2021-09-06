package com.example.effectivejava.chapter06.item38;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

public interface Operation {
    BigDecimal apply(BigDecimal x, BigDecimal y);
}

enum BasicOperation implements Operation{
    PLUST("+"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.add(y);
        }
    },
    MINUS("-"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.subtract(y);
        }
    },
    TIMES("*"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.multiply(y);
        }
    },
    DIVIDE("/"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.divide(y, RoundingMode.HALF_UP);
        }
    },
    EXP("^"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.pow(y.intValue());
        }
    },
    REMAINDER("%"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.remainder(y);
        }
    };

    private final String symbol;

    BasicOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public BigDecimal apply(BigDecimal x, BigDecimal y) {
        return BigDecimal.valueOf(1);
    }

}

enum ExtendedOperation implements Operation {
    EXP("^"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.pow(y.intValue());
        }
    },
    REMAINDER("%"){
        public BigDecimal apply(BigDecimal x, BigDecimal y){
            return x.remainder(y);
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }



    @Override
    public String toString() {
        return symbol;
    }

    static String[] args = {"3", "5"};

    public static void main(String[] args) {
        Stream.of("A", "B", "C")
                .filter(x->{
                    return x.equals("A");
                })
                .map(x->{
                    String y = x+"BB";
                    return y;
                })
                .forEach(System.out::println);
//        String [] arguments = {"3", "5"};
//        BigDecimal x = BigDecimal.valueOf(Double.parseDouble(arguments[0]));
//        BigDecimal y = BigDecimal.valueOf(Double.parseDouble(arguments[1]));
//        test(ExtendedOperation.class, x, y);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, BigDecimal x, BigDecimal y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x,y));
    }

}

