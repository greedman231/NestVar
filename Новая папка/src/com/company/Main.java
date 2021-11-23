package com.company;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("count = " + count);

        //int count=2;
        System.out.println("Первый независимы блок: count = " + count);

        int n = 3;
        System.out.println("Первый независимы блок: n = " + n);
    }
    {
        int n = 5;
        System.out.println("Второй независимы блок: n = " + n);
    }
}