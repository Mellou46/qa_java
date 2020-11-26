package com.telesens.academy.Lesson_05.HwLesson_05;

public class DateTime extends Date {
    protected int hour; //часы
    protected int minute; //минута
    protected int second;//Секунда

    public DateTime() {
        super();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d %02d:%02d:%02d",day,month,year,hour,minute,second);
    }
}
