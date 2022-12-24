package ru.skillfactory.Ex29.comparator;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.Ex29.model.University;

public class UniversityIdComparator implements UniversityComparator {
    @Override
    public int compare(University u0, University u1) {
        return StringUtils.compare(u0.getId(), u1.getId());
    }
}
