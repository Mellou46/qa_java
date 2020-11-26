package com.telesens.academy.Lesson_03.Array.Practice;

public class Practice {
    public static void main(String[] args) {
        int[] array = {11, 111, 1, -1, 1111, 121};
        System.out.print("This is max number: "); maxValue(array);
        System.out.print("This is min number: "); minValue(array);
    }

    public static void maxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);
    }

    public static void minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println(min);
    }
}