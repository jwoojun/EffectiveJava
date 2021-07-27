package com.example.effectivejava.chapter01.item8;

public class AttackVulnerable extends Vulnerable {
    static Vulnerable vulnerable;

    public AttackVulnerable(int value) {
        super(value);
    }

    public void finalize() {
        vulnerable = this;
    }

    public void test(){
        Outter.Inner o = new Outter.Inner(3);
        System.out.println("value= "+o.value);
    }


    public static void main(String[] args) {
        Outter.Inner o = new Outter.Inner(3);
        AttackVulnerable attackVulnerable = new AttackVulnerable(3);
        attackVulnerable.test();


        try {
            new AttackVulnerable(-1);
        } catch (Exception e) {
            System.out.println(e);
        }

        // vm이 gc를 실행하고 모든 finalizer를 실행하도록 권장
        System.gc();
        System.runFinalization();
        if (vulnerable != null) {
            System.out.println("Vulnerable object " + vulnerable + " created!");
        }


    }
}

class Vulnerable {
    Integer value = 0;

    Vulnerable(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Vulnerable value must be positive");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return (value.toString());
    }
}


class Outter{
      public int value;
        void test() {
            System.out.println("test");
        }
      public static class Inner {
        public int value;

        public Inner(int value) {
          this.value = value;
        }
      }

      class InnerSecond {
        public int value;

        public InnerSecond(int value) {
          this.value = value;
        }


      }

      public void main(String args[]) {
        new Inner(3);
        Outter.this.value = 3;
        Outter.this.test();
      }
}
