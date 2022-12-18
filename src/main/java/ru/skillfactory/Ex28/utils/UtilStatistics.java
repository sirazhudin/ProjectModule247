package ru.skillfactory.Ex28.utils;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.Ex28.enums.StudyProfile;
import ru.skillfactory.Ex28.model.Statistics;
import ru.skillfactory.Ex28.model.Student;
import ru.skillfactory.Ex28.model.University;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class UtilStatistics {
    private UtilStatistics(){}

    public static List<Statistics> createStatistics(List<Student> studentList, List<University> universityList) {
        List<Statistics> statisticsList = new ArrayList<>();
        Set<StudyProfile> studyProfiles = universityList.stream().map(University::getMainProfile).collect(Collectors.toSet());
        //--
        studyProfiles.forEach(studyProfile -> {
            Statistics statistics = new Statistics();
            statisticsList.add(statistics);
            statistics.setStudyProfile(studyProfile);

            //--
            List<String> profileUniversityIds = universityList.stream().filter(university -> university.getMainProfileRus().equals(studyProfile)).map(University::getId).collect(Collectors.toList());
            statistics.setNumberOfUniversities(profileUniversityIds.size());
            statistics.setNameOfUniversity(StringUtils.EMPTY);
            //--
            universityList.stream().filter(university -> profileUniversityIds.contains(university.getId())).map(University::getFullName).forEach(fullNameUniversity -> statistics.setNameOfUniversity(statistics.getNameOfUniversity()+ fullNameUniversity + ";"));
            //-
            List<Student> studentsProfile = studentList.stream().filter(student -> profileUniversityIds.contains(student.getUniversityId())).collect(Collectors.toList());
            statistics.setNumberOfStudents(studentsProfile.size());
            //--
            OptionalDouble avgExamScore = studentsProfile.stream().mapToDouble(Student::getAvgExamScore).average();
            statistics.setAvgExamScore(0);
            avgExamScore.ifPresent(val -> statistics.setAvgExamScore((float) BigDecimal.valueOf(val).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        });
        return statisticsList;
    }
}
