package ru.skillfactory.Ex26.comparator;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.Ex26.model.University;

public class UniversityMainProfileComparator implements UniversityComparator {
    @Override
    public int compare(University u0, University u1) {
        return StringUtils.compare(u0.getMainProfile().name(), u1.getMainProfile().name());
    }
}
