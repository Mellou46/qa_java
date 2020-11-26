package com.telesens.academy.Lesson_04.Hw_new_class;

public enum Gender {
    MALE,
    FEMALE;
    @Override
    public String toString(){
        if(this == MALE)
            return "MALE";
        else
            return  "FEMALE";
    }
}
