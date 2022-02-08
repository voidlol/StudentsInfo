package ru.voidlol.studentsinfo;

import ru.voidlol.studentsinfo.model.Student;
import ru.voidlol.studentsinfo.model.University;
import ru.voidlol.studentsinfo.profile.StudyProfile;

public class Starter {
    public static void main(String[] args) {
        University msu = new University()
            .setFullName("Московский государственный универститет")
            .setShortName("МГУ").setId("1")
            .setYearOfFoundation(1755)
            .setMainProfile(StudyProfile.COMPUTER_SCIENCE)
            .build();

        Student student = new Student()
                .setFullName("Петров Иван Сергеевич")
                .setCurrentCourseNumber(1)
                .setUniversityId("1")
                .setAvgExamScore(3.7f)
                .build();

        System.out.println(msu);
        System.out.println(student);
    }
}
