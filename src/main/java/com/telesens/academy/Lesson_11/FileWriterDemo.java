package com.telesens.academy.Lesson_11;

import java.io.*;
import java.util.Properties;

public class FileWriterDemo {
    public static void main(String[] args) {
//        String path = "C:\\demo\\file.txt";
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
//            writer.write("abc"); // записывает данные в буфер
//            writer.flush(); //записывает данные в файл из буфера
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Properties properties = new Properties();
//         Связь переменной is c файлом с пропертями
        try (InputStream is = FileReaderDemo.class.getClassLoader().getResourceAsStream("demo.properties")) {
            properties.load(is); // загружаем пропертя из файла "demo.properties"
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = properties.getProperty("path.out"); // читаем проперти по ключу
        try(PrintWriter writer = new PrintWriter(new FileWriter(path))) { //инициализировать все ресурсы нужно вот так
//            PrintWriter writer = new PrintWriter(new FileWriter(path));
            writer.write("abc printwriter"); // записывает данные в буфер
            writer.flush(); //записывает данные в файл из буфера.

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
