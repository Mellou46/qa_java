package com.telesens.academy.Lesson_03.SecondPart;

public class lesson_03 {
    //подсчет количества "о" в строке
    public static void main(String[] args) {
        String str = "Hello World!!!";
        int resoult = 0;
        for(int i = 0; i < str.length(); i++) {
           char a = str.charAt(i);
                   if (a == 'o')
                resoult++;
            //assert(resoult = 2);
        }

        System.out.println("count is " + resoult);
    }
}
