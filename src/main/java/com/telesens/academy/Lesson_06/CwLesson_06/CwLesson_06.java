package com.telesens.academy.Lesson_06.CwLesson_06;

import com.telesens.academy.Lesson_05.HwLesson_05.Date;
import com.telesens.academy.Lesson_05.HwLesson_05.DateTime;
import com.telesens.academy.Lesson_08.WrongMonthException;

public class CwLesson_06 {
    public static void main(String[] args) throws WrongMonthException {
        Date date = new Date(3, 12, 20);

        Object date2 = new Date(3, 12, 20);
        Date date3 = new DateTime();
        //String date4 = new Date(3,12,20); //так не сделаешь и пробовать не нужно
        //DateTime date5 = new Date(3,12,20);//так не сделаешь и пробовать не нужно

        DateTime origin2 = null;
        DateTime origin = (DateTime)date3;
//        if(date3 instanceof DateTime){
//            origin2 = (DateTime) date;
//            origin2.setHour(2);
//        }
        origin.setHour(2);

//        ((DateTime)date3).setHour(5);
        date3.setDay(5);



        DateTime dateTime = new DateTime();
        dateTime.setHour(0);
        dateTime.setMinute(0);
        dateTime.setSecond(0);

        dateTime.setYear(20);
        dateTime.setMonth(8);
        dateTime.setDay(1);

        Date[] arr = {date, dateTime};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("*********************");
        Object[] arr2 = {date, dateTime, "Hello World!!!"};
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }



        Date[] dateargs = new Date[3];
        dateargs[0] = new Date(1,12,20);
        dateargs[1] = new Date(1,12,20);
        dateargs[2] = new Date(1,12,20);
        newStr(dateargs);
        }

        public static void newStr(Date[] dateargs) {
        for(int i = 0; i<dateargs.length; i++)
            System.out.println(dateargs[i]);
        }
    }


