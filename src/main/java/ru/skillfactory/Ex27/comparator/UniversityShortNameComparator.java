package ru.skillfactory.Ex27.comparator;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.Ex26.model.University;

public class UniversityShortNameComparator implements UniversityComparator {
    @Override
    public int compare(University u0, University u1) {
        return StringUtils.compare(u0.getShortName(), u1.getShortName());
    }
}
