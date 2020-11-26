package com.telesens.academy.Lesson_04;

public class cwLesson_04 {
    public static void main(String[] args) {

        //Strings
        //Работа с сабстрингом
        String str = "Ivan_Ivanov";
        String firstName = str.substring(0, 4); // Ivan
        String lastName = str.substring(5); // Ivanov
        System.out.println(firstName);
        System.out.println(lastName);

        String str2 = "ivAn";
        System.out.println(str2);
        String str3 = str2.toUpperCase();
        String str4 = str2.toLowerCase();

//        String a = str3.substring(0,1);
//        String b = str2.substring(1);
        String a = str3.substring(0,1);
        String b = str4.substring(1);
        System.out.println(a+b);

        String strDemo = "   Ivan   ";
        System.out.println(strDemo.trim());

        String[] parts = str.split("_");
        String fName = parts[0];
        String lName = parts[1];
        System.out.println(fName);
        System.out.println(lName);

        String strDemo2 = "   Ivan  ,  Ivanov  ";
        //убираем пробелы
        //String noSpaces = strDemo2.trim();
        String noSpaces = strDemo2.replaceAll(" ", "");
        //разделяем по запятой
        String[] s1 = noSpaces.split(",");
        String fName1 = s1[0];
        String lName1 = s1[1];
        System.out.println("**********");
        System.out.println(fName1);
        System.out.println(lName1);

        //подсчет количества "о" в строке
        String str1 = "Hello Wooooooooorld!!!";
        int resoult = 0;
            for(int i = 0; i < str1.length(); i++) {
                char a1 = str1.charAt(i);
                if (a1 == 'o')
                    resoult++;
            }
        System.out.println("*****count is " + resoult);


//        String[] tracks = {
//                "track_01", "track_03", "track_21", "track_15",
//                "track_12", "track_99", "track_11", "track_10"
//        };
//        filterTrack(tracks);
//    }
//
//    public static void filterTrack(String[] tracks) {
//        for (int i = 0; i < tracks.length; i++){
//            String digits = cutLastDigitsVer4(tracks[i]);
//            int number = Integer.parseInt(digits);
//            if(number >= 10 && number <= 15){
//                System.out.println(tracks[i]);
//            }
//        }
//    }
//
//    public static String cutLastDigitsVer4(String[] tracks) {
//        for(int i = 0; )
//
//    }
}}
// перевод строки в цифры int number = Integer.parseInt(digits);