package com.telesens.academy.Lesson_01.Task_03;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Ниже должен быть треугольник");
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j < i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
