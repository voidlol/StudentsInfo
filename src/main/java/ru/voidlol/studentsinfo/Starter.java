package ru.voidlol.studentsinfo;

import ru.voidlol.studentsinfo.comparators.ComparatorService;
import ru.voidlol.studentsinfo.comparators.StudentComparator;
import ru.voidlol.studentsinfo.comparators.UniversityComparator;
import ru.voidlol.studentsinfo.enums.StudentComparators;
import ru.voidlol.studentsinfo.enums.UniversityComparators;
import ru.voidlol.studentsinfo.excel.ExcelReader;
import ru.voidlol.studentsinfo.model.Student;
import ru.voidlol.studentsinfo.model.University;

import java.util.List;
import java.util.stream.Collectors;

public class Starter {

    public static void main(String[] args) {
        StudentComparator sc = ComparatorService.getStudentComparator(StudentComparators.AVG_SCORE);
        UniversityComparator uc = ComparatorService.getUniversityComparator(UniversityComparators.MAIN_PROFILE);
        List<Student> studentList = ExcelReader.readStudents("./src/main/resources/universityInfo.xlsx")
                .stream()
                .sorted(sc)
                .collect(Collectors.toList());
        List<University> universities = ExcelReader.readUniversity("./src/main/resources/universityInfo.xlsx")
                .stream()
                .sorted(uc)
                .collect(Collectors.toList());

        String jsonStudent = JsonUtil.studentToJson(studentList.stream().filter(student -> student.getAvgExamScore() == 5.0f).findFirst().get());
        Student student = JsonUtil.jsonToStudent(jsonStudent);
        System.out.println(student);
        String jsonUniversities = JsonUtil.universitiesToJson(universities);
        List<University> newUniversities = JsonUtil.jsonToUniversities(jsonUniversities);
        System.out.println(newUniversities);
    }

}
