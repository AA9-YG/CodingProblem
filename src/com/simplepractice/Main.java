package com.practice;

import com.practice.Book;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Bob", "com.practice.Book One", 10);
        Book b2 = new Book("John", "com.practice.Book Two", 20);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(!(false ^ true));   // Not exclusively OR; XNOR; XAND (exclusively AND)

    }
}