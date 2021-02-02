package ru.job4j.oop;

import com.sun.source.util.SourcePositions;

import java.util.Arrays;

public class Fix {
     private String desc;

     public Fix(String text) {
         this.desc = text;
     }

    public static void main(String[] args) {
        Fix blabla = new Fix("Чьерт побьери");
        System.out.println(blabla.desc);
    }
}
