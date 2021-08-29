package com.example.effectivejava.chapter09.item58.face;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public enum Face {
    ONE, TWO, THREE, FOUR, FIVE, SIX;

    Collection<Face> faces = EnumSet.allOf(Face.class);

    void hasAnotherBug(){
        for(Iterator<Face> i = faces.iterator(); i.hasNext();){
            for(Iterator<Face> j = faces.iterator(); j.hasNext();){
                System.out.println(i.next() + " "+j.next());
            }
        }
    }
}


