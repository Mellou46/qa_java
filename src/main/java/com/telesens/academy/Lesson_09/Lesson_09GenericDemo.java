//package com.telesens.academy.Lesson_09;
//
//import com.telesens.academy.Lesson_04.Hw_new_class.Abonent;
//
//import java.util.List;
//
//public class Lesson_09GenericDemo {
//    public static void main(String[] args) {
//        List<String> list;
//        List<Integer> list2;
//        List<Abonent> list3;
//
//        Object universal = "Hello";
//        universal = 1;
//        universal = new Abonent();
//        universal = "Ivan";
//        if(universal instanceof String) {
//            //universal = 1; //будет эксепшен тошо мы пытаемся интеджер запихать в стрингу
//            universal = ((String) universal).toUpperCase();
//        }
//        System.out.println(universal);
//
//        Generic<Integer, String> generic = new Generic();
//        generic.setVal1(12);
//        generic.setVal2("Vasya");
//        System.out.println(generic.getVal1() + " " + generic.getVal2());
//    }
//}
