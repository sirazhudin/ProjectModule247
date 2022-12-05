package ru.skillfactory.Ex27.comparator;

import ru.skillfactory.Ex26.model.Student;

public class StudentAvgExamScoreComparator implements StudentComparator {
    @Override
    public int compare(Student s0,Student s1) {
        return Float.compare(s0.getAvgExamScore(), s1.getAvgExamScore());
    }
}
