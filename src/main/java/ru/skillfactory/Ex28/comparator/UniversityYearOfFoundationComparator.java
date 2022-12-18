package ru.skillfactory.Ex28.comparator;

import ru.skillfactory.Ex28.model.University;

public class UniversityYearOfFoundationComparator implements UniversityComparator {
    @Override
    public int compare(University u0, University u1) {
        return Integer.compare(u0.getYearOfFoundation(), u1.getYearOfFoundation());
    }
}
