package ru.skillfactory.Ex27.comparator;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.Ex26.model.Student;

public class StudentUniversityIdComparator implements StudentComparator {
    @Override
    public int compare(Student s0, Student s1) {
        return StringUtils.compare(s0.getUniversityId(),s1.getUniversityId());
    }
}
