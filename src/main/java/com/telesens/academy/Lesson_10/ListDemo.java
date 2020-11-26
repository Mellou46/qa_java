package com.telesens.academy.Lesson_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] names = { "Марат","Архип", "Марат", "Болеслав", new String("Марат"), "Семён","Юлиан","Сергей","Нифонт", "Марат","Максим","Евгений","Геннадий","Володар","Ждан","Марк","Григорий","Леонид","Олег"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);
 //       nameList.remove(2);
        System.out.println(nameList);
        nameList.sort((s1, s2) -> {
//        if (s1.equals(s2))
//                return 0;
//        if (s1.compareTo(s2) > 0)
//            return 1;
//        else return -1;
            return s2.compareTo(s1);
        });

        System.out.println("********" + nameList);

        for (int i = 0; i < nameList.size(); i++){
           if(nameList.get(i).charAt(0) != 'С');

        }

    }
}
