package com.telesens.academy.Lesson_02.Task_01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
        if (n < 50)
        for(int i = n; i < n+10; i++){
            System.out.println("It's less than 50!");
            for(int i2 = n; i2 > n-10; i2--){
                System.out.println("It's between 50 and 100!");
            }
        }
        else if (n < 100)
        for (int i2 = n; i2 > n-10; i2--){
                System.out.println("It's between 50 and 100!");
            }
        else System.out.println("Amazing! It's too high number!");
        for(int m = 1; m <= 5; m++){
            for(int j = 5; j <= m; j++) {
            }
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
