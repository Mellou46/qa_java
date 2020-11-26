package com.telesens.academy.Lesson_12;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Writer {
    public static void main(String[] args) throws IOException {
        //String maleNames ="C:\\demo\\мужские имена.txt";
        List <String> manNames = Files.lines(Paths.get("C:\\demo\\мужские имена.txt"),
                StandardCharsets.UTF_8).collect(Collectors.toList());
        System.out.println(manNames);
        List <String> manLastNames = Files.lines(Paths.get("C:\\demo\\мужские фамилии.txt"),
                StandardCharsets.UTF_8).collect(Collectors.toList());
        System.out.println(manLastNames);

    }

}
