package ru.skillfactory.Ex3.comparator;

import ru.skillfactory.Ex3.model.University;

public class UniversityYearOfFoundationComparator implements UniversityComparator {
    @Override
    public int compare(University u0, University u1) {
        return Integer.compare(u0.getYearOfFoundation(), u1.getYearOfFoundation());
    }
}
