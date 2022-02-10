package ru.voidlol.studentsinfo;

import ru.voidlol.studentsinfo.comparators.ComparatorService;
import ru.voidlol.studentsinfo.comparators.StudentComparator;
import ru.voidlol.studentsinfo.comparators.UniversityComparator;
import ru.voidlol.studentsinfo.enums.StudentComparators;
import ru.voidlol.studentsinfo.enums.UniversityComparators;
import ru.voidlol.studentsinfo.excel.ExcelReader;

public class Starter {

    public static void main(String[] args) {
        StudentComparator sc = ComparatorService.getStudentComparator(StudentComparators.AVG_SCORE);
        UniversityComparator uc = ComparatorService.getUniversityComparator(UniversityComparators.MAIN_PROFILE);
        ExcelReader.readStudents("./src/main/resources/universityInfo.xlsx")
                .stream()
                .sorted(sc)
                .forEach(System.out::println);
        ExcelReader.readUniversity("./src/main/resources/universityInfo.xlsx")
                .stream()
                .sorted(uc)
                .forEach(System.out::println);
    }

}
