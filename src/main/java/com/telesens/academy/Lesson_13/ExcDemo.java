package com.telesens.academy.Lesson_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcDemo {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>(Arrays.asList("name1", "name2", "name3"));
        List<String> names2 = new ArrayList<>(Arrays.asList("name2", "name1", "name3"));
        names1.sort(String::compareTo);
        names2.sort(String::compareTo);

        System.out.println(names1.equals(names2));


    }
}
