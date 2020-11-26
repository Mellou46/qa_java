package com.telesens.academy.Lesson_05.HwLesson_05;

import com.telesens.academy.Lesson_08.WrongMonthException;

public class Date {
    protected int day; //день
    protected int month; //месяц
    protected int year; //год

    public Date() {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDate(int day, int month, int year) throws WrongMonthException{
        if (month > 12)
            throw new WrongMonthException(month);
        else
            this.month = month;
    }

    @Override
    public String toString() {
//        return String.format("%02d",day)+"."+String.format("%02d",month)+"."+String.format("%d",year);
        return String.format("%02d.%02d.%d",day,month,year);
    }
}
