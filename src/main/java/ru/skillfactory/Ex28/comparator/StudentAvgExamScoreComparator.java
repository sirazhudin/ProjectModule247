package ru.skillfactory.Ex28.comparator;

import ru.skillfactory.Ex28.model.Student;


public class StudentAvgExamScoreComparator implements StudentComparator {
    @Override
    public int compare(Student s0, Student s1) {
        return Float.compare(s0.getAvgExamScore(), s1.getAvgExamScore());
    }
}
