package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book remark = new Book("Three Comrades", 326);
        Book tolkien = new Book("Lords of the rings", 867);
        Book job4j = new Book("Clean codee", 245);
        Book rowling = new Book("Harry Potter", 560);
        Book[] books = new Book[4];
        books[0] = remark;
        books[1] = tolkien;
        books[2] = job4j;
        books[3] = rowling;
        for (int i = 0; i < books.length; i++) {
            Book booki = books[i];
            System.out.println(booki.getName() + " - " + booki.getPages());
        }
        System.out.println("Replace 0 -> 3");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book booki = books[i];
            System.out.println(booki.getName() + " - " + booki.getPages());
        }
        System.out.println("Shown only books with name Clean Code");
        for (int i = 0; i < books.length; i++) {
            Book booki = books[i];
            if ("Clean code".equals(booki.getName())) {
                System.out.println(booki.getName() + " - " + booki.getPages());
            }
        }
    }
}