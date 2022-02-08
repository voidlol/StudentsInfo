package ru.voidlol.studentsinfo;

import ru.voidlol.studentsinfo.excel.ExcelReader;

public class Starter {

    public static void main(String[] args) {
        ExcelReader.readStudents("./src/main/resources/universityInfo.xlsx").forEach(System.out::println);
        ExcelReader.readUniversity("./src/main/resources/universityInfo.xlsx").forEach(System.out::println);
    }

}
