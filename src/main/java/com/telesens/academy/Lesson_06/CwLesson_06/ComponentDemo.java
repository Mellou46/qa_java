package com.telesens.academy.Lesson_06.CwLesson_06;

import java.util.Random;

public class ComponentDemo {
    public static void main(String[] args) {
        Component[] array = {
                new Component(),
                new Button(),
                new Label(),
                new CheckBox(),
                new RoundButton()
        };
        for (int i = 0; i < array.length; i++) {
            array[i].draw();
        }
        Component[] testElements = {
                new Button(),
                new Label(),
                new CheckBox(),
                new RoundButton()
        };
        Component[] arrayRandom = new Component[100];
        Random random = new Random();
        random.nextInt(4); //0, 1, 2, 3
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = testElements[random.nextInt(testElements.length)]; //случайный тип
        }

        System.out.println("Random components below:");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i].draw();
        }
    }
}
