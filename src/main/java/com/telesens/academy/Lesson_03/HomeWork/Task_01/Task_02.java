package com.telesens.academy.Lesson_03.HomeWork.Task_01;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string next:");
        String inputString = scanner.nextLine();

        strStartD(inputString);
//        strEndEd(inputString);
    }

    public static void strStartD(String str){
        int count = 0;
        for (String a: str.split(" ")) {
            if (a.startsWith("d"))
            System.out.println(a);
                count++;
//           if(a.substring(1).equals('d'))
//            System.out.println(a);
//            count++;
        }
        System.out.println(count);
    }
    public static void strEndEd(String str){
        int count = 0;
        for (String a: str.split("\\s")) {
            if (a.endsWith("ED"))
                System.out.println(a);
            count++;
        }
        System.out.println(count);
    }
}

