package ru.skillfactory.Ex28.comparator;

import ru.skillfactory.Ex28.model.Student;

public class StudentCurrentCourseNumberComparator implements StudentComparator {
    @Override
    public int compare(Student s0, Student s1){
        return Integer.compare(s0.getCurrentCourseNumber(),s1.getCurrentCourseNumber());
    }
}
