package com.telesens.academy.Lesson_06.HwLesson_06;

public enum Season {
    SUMMER, AUTUMN, WINTER, SPRING;

    public void getNextSeason(){
        int nextS = ordinal()+1;
        if (nextS > 3)
            System.out.println(values()[nextS-4]);
        else System.out.println(values()[nextS]);
    }
    public void getPreviousSeason(){
        int PrevS = ordinal()-1;
        if (PrevS < 0)
            System.out.println(values()[PrevS+4]);
        else System.out.println(values()[PrevS]);
    }
    @Override
    public String toString() {
        if(this == SUMMER)
            return "Лето";
        else if(this == AUTUMN)
            return "Осень";
        else if(this == WINTER)
            return "Зима";
        else
            return "Весна";
    }

}
