package com.telesens.academy;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Bla-bla-bla");
        //ввод чего либо делается так:
        Scanner scanner = new Scanner(System.in);
        //сохранение строковой переменной
        String name = scanner.nextLine();
 //       System.out.println("Hello");
 //       System.out.println(name);
 //       System.out.println("Hallo" + name);
         Scanner scanner1 = new Scanner(System.in);
         String age = scanner1.nextLine();
         System.out.println("Name " + name);
        System.out.println("Name " + age);    }
}

