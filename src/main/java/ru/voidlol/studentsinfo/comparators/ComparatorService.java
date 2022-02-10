package ru.voidlol.studentsinfo.comparators;

import ru.voidlol.studentsinfo.comparators.students.StudentAvgScoreComparator;
import ru.voidlol.studentsinfo.comparators.students.StudentCourseComparator;
import ru.voidlol.studentsinfo.comparators.students.StudentFullNameComparator;
import ru.voidlol.studentsinfo.comparators.students.StudentUniversityComparator;
import ru.voidlol.studentsinfo.comparators.university.*;
import ru.voidlol.studentsinfo.enums.StudentComparators;
import ru.voidlol.studentsinfo.enums.UniversityComparators;

public class ComparatorService {
    private ComparatorService() {}

    public static UniversityComparator getUniversityComparator(UniversityComparators uc) {
        switch (uc) {
            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case MAIN_PROFILE:
                return new UniversityProfileComparator();
            case YEAR_OF_FOUNDATION:
                return new UniversityFoundationComparator();
        }
        throw new IllegalArgumentException();
    }

    public static StudentComparator getStudentComparator(StudentComparators sc) {
        switch (sc) {
            case FULL_NAME:
                return new StudentFullNameComparator();
            case COURSE:
                return new StudentCourseComparator();
            case AVG_SCORE:
                return new StudentAvgScoreComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityComparator();
        }
        throw new IllegalArgumentException();
    }
}
