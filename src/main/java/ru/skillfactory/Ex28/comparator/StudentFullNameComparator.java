package ru.skillfactory.Ex28.comparator;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.Ex28.model.Student;

public class StudentFullNameComparator implements StudentComparator {
    @Override
    public int compare(Student s0, Student s1) {
        return StringUtils.compare(s0.getFullName(),s1.getFullName());
    }
}
