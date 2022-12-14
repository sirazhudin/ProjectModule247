package ru.skillfactory.Ex27.comparator;

import ru.skillfactory.Ex27.model.University;

public class UniversityYearOfFoundationComparator implements UniversityComparator {
    @Override
    public int compare(University u0, University u1) {
        return Integer.compare(u0.getYearOfFoundation(), u1.getYearOfFoundation());
    }
}
