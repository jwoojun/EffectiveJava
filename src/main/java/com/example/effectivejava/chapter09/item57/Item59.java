package com.example.effectivejava.chapter09.item57;

import javax.swing.text.Element;
import java.util.Iterator;
import java.util.List;

public class Item59 {
    void loop(List<Element> c){
        for(Element e : c){
            /**
             * 로직
             * */
        }
    }

    void iterator(List<Element> c){
        for(Iterator<Element> i = c.iterator(); i.hasNext();){
            Element e = i.next();
        }
    }


    void whileLoop(List<Element> c, List<Element> c2){
        Iterator<Element> i = c.iterator();
        while(i.hasNext()){
            doSomething(i.next());
        }

        Iterator<Element> i2 = c2.iterator();
        while(i.hasNext()){
            doSomething(i2.next());
        }


    }

    void doSomething(Object o){
        System.out.println("Do Something");
    }
}
