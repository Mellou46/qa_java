package com.telesens.academy.Lesson_09;

import com.telesens.academy.Lesson_04.Hw_new_class.Abonent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.telesens.academy.Lesson_04.Hw_new_class.Gender.FEMALE;
import static com.telesens.academy.Lesson_04.Hw_new_class.Gender.MALE;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(-68);
        list.add(-14);
        list.add(12345);
        System.out.println("List size is: " + list.size());
        System.out.println(list.get(0));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Comparator<Integer> sortRule = new Comparator<>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 == o2)
                    return 0;
                if(o1 > o2)
                    return -1;
                return 1;
            };
        };
        Comparator<Integer> sortRuleLambda = (o1, o2) ->{
            if(o1 == o2)
                return 0;
            if(o1 > o2)
                return -1;
            return 1;
        };

        System.out.println("***************");
        List<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("holla");
        listStr.add("hi");
        listStr.add("Ben");
        listStr.add("BigBan");
        listStr.add("Ola");
        System.out.println("not sorted list: " + listStr);
        Collections.sort(listStr);
        System.out.println("sorted list: " + listStr);

        System.out.println("Задача сортировки по алфавиту ниже:");

        Abonent abonent1 = new Abonent();
        abonent1.setFirstName("Ivan");
        abonent1.setAge(23);
        abonent1.setGender(MALE);

        Abonent abonent2 = new Abonent();
        abonent2.setFirstName("Kolya");
        abonent2.setAge(65);
        abonent2.setGender(MALE);

        Abonent abonent3 = new Abonent();
        abonent3.setFirstName("Helen");
        abonent3.setAge(18);
        abonent3.setGender(FEMALE);

        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);

//        Collections.sort(abonents);
        abonents.sort((a1, a2) -> {
            if (a1.getAge() == a2.getAge())
                return 0;

//            a1.getFirstName().compareTo(a2.getFirstName());
                if (a1.getAge() < a2.getAge())
                    return 1;

            return -1;
        } );

        abonents.sort(Comparator.comparingInt(Abonent::getAge));
        abonents.sort((o1, o2) -> {
            return o1.getFirstName().compareTo(o2.getFirstName());
        });
        System.out.println("Sorted by name: " + abonents);

    }
}
