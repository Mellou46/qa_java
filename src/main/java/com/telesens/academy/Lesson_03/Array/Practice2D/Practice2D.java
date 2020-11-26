package com.telesens.academy.Lesson_03.Array.Practice2D;

public class Practice2D {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 4, 3, 2},
                {76, 76, 444, 3},
                {-54, -65, -8979},
                {5, 7, -43, -656}
        };
        System.out.println("max = " + maxArray2D(array2D));
        System.out.println("min = " + minArray2D(array2D));
    }

    public static int maxArray2D (int[][] array2D) {
        int max1 = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int k = 0; k < array2D[i].length; k++) {
                if (max1 < array2D[i][k]) {
                    max1 = array2D[i][k];
                }
            }
        }
        return max1;
    }
    public static int minArray2D(int[][] array2D){
        int min2d = array2D[0][0];
        for(int a = 0; a<array2D.length;a++){
            for(int b = 0; b < array2D[a].length; b++){
                if (min2d > array2D[a][b])
                    min2d = array2D[a][b];
            }
        }
        return min2d;
    }
}
