package com.telesens.academy.Lesson_03.HomeWork.Task_01;

public class Task_01 {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3, 4, 5},
                {123, 234, 234, 6},
                {8, 65, 4, 6, 8, 9},
                {744, 876, -7879, 1},
                {1, 6, 9},
                {21946, 247847, -1563263, 1}
        };
        System.out.println("Max = " + maxArray2D(array2D));
        System.out.println("*****");
        System.out.println("Min = " + minArray2D(array2D));

        int[] array = {1, 4, 545, -324, -3, -6758};
        int max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (max < array[a]) {
                max = array[a];
            }
            System.out.println("Here is max number of the array: " + max);
        }
        System.out.println("array include only " + array.length + " characters");
        System.out.println(array1(array));
    }
    //нахождение минимального числа двухмерного массива
    public static int minArray2D(int[][] array2D) {
        int min2d = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int k = 0; k < array2D[i].length; k++) {
                //System.out.println(array2D[i][k]);
                //min
                if (min2d > array2D[i][k]) {
                    min2d = array2D[i][k];
                }
            }
        }
        return min2d;
    }
    //нахождение максимального числа двухмерного массива
    public static int maxArray2D (int[][] array2D){
        int max2d = array2D[0][0];
        for (int i = 0; i < array2D.length; i++){
            for (int k = 0; k < array2D[i].length; k++){
                if (max2d < array2D[i][k]){
                    max2d = array2D[i][k];
                }
            }
        }
        return max2d;
    }
    //вывод одномерного массива на консоль
    public static int array1(int[] array){
        int n = 0;
        int abc = array[n];
        for(; n < array.length; n++) {
            System.out.println(array[n]);
        }
        return abc;
    }


}
