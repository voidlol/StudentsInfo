package ru.voidlol.studentsinfo.comparators;

import ru.voidlol.studentsinfo.model.Student;

import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    @Override
    int compare(Student o1, Student o2);
}
