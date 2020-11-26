package com.telesens.academy.Lesson_11;

import com.telesens.academy.Lesson_05.HwLesson_05.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson_11 {
    public static void main(String[] args) {
        String[] date = {
                "01.01.2019", "01.01.2018", "01.02.2018", "02.02.2018", "01.01.2017"
        };
        List<String> dateList = new ArrayList<>(Arrays.asList(date));
        System.out.println("Original date list" + dateList);
        dateList.sort((s1, s2) -> {
        //    if (s1.equals(s2))
            if (s1.charAt(0) == s2.charAt(0))
                    return 0;
        //    if (s1.compareTo(s2) > 0)
            if (s1.charAt(1) > s2.charAt(1))
                return 1;
            else return -1;
//            return s1.charAt(1).compareTo(s2.charAt(1));
        });
        System.out.println("Sorted date list" + dateList);
    }
}
