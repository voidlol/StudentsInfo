package ru.voidlol.studentsinfo.comparators.students;

import org.apache.commons.lang3.StringUtils;
import ru.voidlol.studentsinfo.comparators.StudentComparator;
import ru.voidlol.studentsinfo.model.Student;

public class StudentUniversityComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getUniversityId(), o2.getUniversityId());
    }
}
