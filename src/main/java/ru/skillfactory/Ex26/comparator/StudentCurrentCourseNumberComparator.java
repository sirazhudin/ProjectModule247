package ru.skillfactory.Ex26.comparator;

import ru.skillfactory.Ex26.model.Student;

public class StudentCurrentCourseNumberComparator implements StudentComparator{
    @Override
    public int compare(Student s0, Student s1){
        return Integer.compare(s0.getCurrentCourseNumber(),s1.getCurrentCourseNumber());
    }
}
