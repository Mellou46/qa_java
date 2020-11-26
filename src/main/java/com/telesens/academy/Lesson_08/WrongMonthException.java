package com.telesens.academy.Lesson_08;


    public class WrongMonthException extends Exception {
        private int wrongMonth;

        public WrongMonthException(int wrongMonth) {
            this.wrongMonth = wrongMonth;
        }

        public int getWrongMonth() {
            return wrongMonth;
        }
    }

