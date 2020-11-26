package com.telesens.academy.Lesson_06.HwLesson_06;

public enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATUREDAY;

    public void getDayAfterTomorrow(){
        int future = ordinal()+2;
        if(future >6)
            System.out.println(values()[future-7]);
        else System.out.println(values()[future]);
    }

    public void getDayBeforeYesterday(){
        int future = ordinal()-2;
        if(future < 0)
            System.out.println(values()[future+7]);
        else System.out.println(values()[future]);
    }

    @Override
    public String toString() {
        if (this == SUNDAY)
            return "Воскресенье";
        else if (this == MONDAY)
            return "Понедельник";
        else if (this == TUESDAY)
            return "Вторник";
        else if (this == WEDNESDAY)
            return "Среда";
        else if (this == THURSDAY)
            return "Четверг";
        else if (this == FRIDAY)
            return "Пятница";
        else
            return "Суббота";

    }
}
