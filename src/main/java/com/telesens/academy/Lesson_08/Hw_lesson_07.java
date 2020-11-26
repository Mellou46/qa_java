package com.telesens.academy.Lesson_08;

import com.telesens.academy.Lesson_04.Hw_new_class.Abonent;
import com.telesens.academy.Lesson_05.HwLesson_05.Date;

import java.util.Arrays;
import java.util.Random;

public class Hw_lesson_07 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = new String[]{
                "Архип","Болеслав","Марат","Семён","Юлиан","Сергей","Нифонт","Максим","Евгений","Геннадий","Володар"
        };

        Abonent[] abonents = new Abonent[10];
        for(int i =0; i < abonents.length; i++){
            Abonent abonent = new Abonent();
            int nextNameIndex = random.nextInt(names.length);
            String nexName = names[nextNameIndex];
            abonent.setFirstName(nexName);
            abonents[i] = abonent;
        }

        random.nextInt(10);
        System.out.println(Arrays.toString(abonents));


        System.out.println("*************");
        Date date = new Date(1, 23, 2020);
        System.out.println(date + "*******");


        try {
            Date date1 = new Date(1, 23, 2020);
            date1.setDate(1, 23, 2020);
            System.out.println(date1);
        }
        catch (WrongMonthException e) {
            System.out.println("error: " + e.getWrongMonth());
        }
        catch (Exception e) {
            System.out.println("Unknown error. Details: " + e.getMessage());
        }
        finally {
            System.out.println("Complete");
        }
    }

}
