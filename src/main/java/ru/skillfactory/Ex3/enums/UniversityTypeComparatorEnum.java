package ru.skillfactory.Ex3.enums;

public enum UniversityTypeComparatorEnum {
    FULL_NAME(1),
    UNIVERSITY_ID(2),
    MAIN_PROFILE(3),
    SHORT_NAME(4),
    YEAR_OF_FOUNDATION(5);

    private int universityTypeComparatorEnumValue;

    UniversityTypeComparatorEnum(int universityTypeComparatorEnumValue) {
        this.universityTypeComparatorEnumValue=universityTypeComparatorEnumValue;
    }

    public int getUniversityTypeComparatorEnumValue() {
        return universityTypeComparatorEnumValue;
    }
}
