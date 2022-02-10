package ru.voidlol.studentsinfo.comparators.students;

import ru.voidlol.studentsinfo.comparators.StudentComparator;
import ru.voidlol.studentsinfo.model.Student;

public class StudentAvgScoreComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getAvgExamScore(), o1.getAvgExamScore());
    }
}
