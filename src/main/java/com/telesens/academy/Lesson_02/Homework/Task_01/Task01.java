package com.telesens.academy.Lesson_02.Homework.Task_01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Enter your first number next:");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println("Enter your second number next:");
        int B = scanner.nextInt();
        System.out.println("Enter your third number next:");
        int C = scanner.nextInt();
        int X;
        if (A>B && A>C){
        System.out.println("Max: " + A);
        }
            else if (B>A && B>C){
            System.out.println("Max: " + B);
            }
            else System.out.println("Max: " + C);
        if (A>B && A<C){
            System.out.println("Middle: " + A);
        }
            else if (B>A && B<C){
            System.out.println("Middle: " + B);
            }
            else System.out.println("Middle: " + C);
        if (A<B && A<C){
            System.out.println("Min: " + A);
        }
        else if (B<A && B<C){
            System.out.println("Min: " + B);
        }
        else System.out.print("Min: " + C);
    }
}
