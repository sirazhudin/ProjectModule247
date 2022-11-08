package ru.skillfactory.Ex3.utils;

import ru.skillfactory.Ex3.comparator.*;
import ru.skillfactory.Ex3.enums.StudentTypeComparatorEnum;
import ru.skillfactory.Ex3.enums.UniversityTypeComparatorEnum;

public class UtilComparator {
    private  UtilComparator () {}

    public static StudentComparator getStudentComparatorTypeClass(StudentTypeComparatorEnum studentTypeComparatorEnum) {

        switch(studentTypeComparatorEnum) {

            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            case CURRENT_COURSE_NUMBER:
                return new StudentCurrentCourseNumberComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();

        } return new StudentFullNameComparator();
    }
    public static UniversityComparator getUniversityComparatorTypeClass (UniversityTypeComparatorEnum universityTypeComparatorEnum) {
        switch(universityTypeComparatorEnum) {
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case UNIVERSITY_ID:
                return new UniversityIdComparator();
            case MAIN_PROFILE:
                return new UniversityMainProfileComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case YEAR_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }

}
