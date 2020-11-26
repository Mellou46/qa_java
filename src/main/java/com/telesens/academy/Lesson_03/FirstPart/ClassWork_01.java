package com.telesens.academy.Lesson_03.FirstPart;

import java.util.Arrays;

public class ClassWork_01 {
    public static void main(String[] args) {
        int [] bla = {1, 7, -6, 3, 5, 66, 7};
        //console
        printBla(bla);
        System.out.println("***********");
//        for(int i=0; i<bla.length; i++){
//            System.out.println(bla[i]);
//        }

//        //min and max
//        int min = bla [0];
//        for (int i = 1; i<bla.length; i++) {
//            if (bla[i] < min)
//            min = bla [i];
//        }
            System.out.println("Min " + minimum(bla));
        System.out.println("***********");

        //max
//        int max = bla[0];
//        for (int i = 1; i<bla.length; i++){
//            if (bla[i] > max)
//                max = bla [i];
//        }
        System.out.println("Max " + maximum(bla));
        System.out.println("***********");

        //вложенный массив
        int [][] array2D = {
                {5, 8, 3},
                {3, -6, 64, 456},
                {2, 976, 545, -43, 666},
                {0, 7}
        };
//        System.out.println(array2D[2][3]);
//        //вывести нужную часть массива
//        System.out.println(Arrays.toString(array2D[2]));
//        //вывести весь массив целиком
//        System.out.println(Arrays.deepToString(array2D));

//        int min2d = array2D[0][0];
//        int max2d = array2D[0][0];
//        for(int i=0;i<array2D.length; i++){
//            for(int k = 0; k < array2D[i].length; k++) {
//                System.out.println(array2D[i][k]);
//                //min
//                if (min2d > array2D[i][k]) {
//                    min2d = array2D[i][k];
//                }
//                //max
//                if (max2d < array2D[i][k]) {
//                    max2d = array2D[i][k];
//                }
//            }
            //System.out.println(Arrays.toString(array2D[i]));
        System.out.println("oooooooooooooooooooooooooooooooo");
            System.out.println("min = " + minArray2D(array2D));
            System.out.println("max = " + maxArray2D(array2D));
        System.out.println("oooooooooooooooooooooooooooooooo");
        //arrays.reverse;
        System.out.println("Тут должны быть отсортированные значения" + Arrays.toString(reverse(bla)));
        //для вывода массива нужно использовать arrays
        //разобраться как работает



        }

    public static int[] reverse (int[] bla) {
        for(int i = 0, j = bla.length - 1; i < j; i++, j--){
            int tmp = bla[i];
            bla[i] = bla[j];
            bla[j] = tmp;
        }
        return bla;
    }

    public static void printBla(int[] bla){
        for(int i=0; i<bla.length; i++){
            System.out.println(bla[i]);
        }
    }
    public static int minimum (int[] bla){
        int min = bla [0];
        for (int i = 1; i<bla.length; i++) {
            if (bla[i] < min)
                min = bla [i];
        }
        return min;
    }


    public static int maximum (int[] bla){
        int max = bla[0];
        for (int i = 1; i<bla.length; i++){
            if (bla[i] > max)
                max = bla [i];
        }
        return  max;
    }


    public static int minArray2D (int[][] array2D){
        int min2d = array2D[0][0];
        for(int i=0;i<array2D.length; i++) {
            for (int k = 0; k < array2D[i].length; k++) {
                //System.out.println(array2D[i][k]);
                //min
                if (min2d > array2D[i][k]) {
                    min2d = array2D[i][k];
                }
            }
        }
        return  min2d;
    }
    public static int maxArray2D (int[][] array2D){
        int max2d = array2D[0][0];
        for(int i=0;i<array2D.length; i++) {
            for (int k = 0; k < array2D[i].length; k++) {
                //System.out.println(array2D[i][k]);
                //max
                if (max2d < array2D[i][k]) {
                    max2d = array2D[i][k];
                }
            }
        }
        return  max2d;
    }
}

