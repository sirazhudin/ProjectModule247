package ru.skillfactory.Ex26.enums;

public enum StudentTypeComparatorEnum {
    AVG_EXAM_SCORE(1),
    CURRENT_COURSE_NUMBER(2),
    FULL_NAME(3),
    UNIVERSITY_ID(4);

    private int studentTypeComparatorEnumValue;

    StudentTypeComparatorEnum(int studentTypeValue) {
         this.studentTypeComparatorEnumValue =studentTypeValue;
    }

    public int getStudentTypeComparatorEnumValue() {
        return studentTypeComparatorEnumValue;
    }
}
