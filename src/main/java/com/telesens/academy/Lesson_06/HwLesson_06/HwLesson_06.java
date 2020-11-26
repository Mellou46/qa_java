package com.telesens.academy.Lesson_06.HwLesson_06;

public class HwLesson_06 {

    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.SATUREDAY;
        System.out.println("**********");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        System.out.println("Сегодня: " + dow);
        System.out.print("Послезавтра будет: ");
        dow.getDayAfterTomorrow();
        System.out.print("Позавчера было: ");
        dow.getDayBeforeYesterday();
        System.out.println("**********");
        System.out.println("***Seasons bellow***");
        Season season = Season.SUMMER;

        for(Season seasons:Season.values()){
        System.out.println(seasons);
        }

        System.out.print("Следующий сезон: ");
        season.getNextSeason();
        System.out.println("Текущий сезон: " + season);
        System.out.print("Предыдущий сезон: ");
        season.getPreviousSeason();
    }
}
