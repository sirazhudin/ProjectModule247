package ru.skillfactory.Ex27.model;

import ru.skillfactory.Ex27.enums.StudyProfile;

public class Statistics {
    private StudyProfile studyProfile;
    //   private float avgExamMark;
    private float avgExamScore;
    private int numberOfStudents;
    private int numberOfUniversities;
    private String nameOfUniversity;

    public StudyProfile getStudyProfile() {return studyProfile; }

    public Statistics setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
        return this;
    }

    public float getAvgExamScore(){ return avgExamScore; }

    public Statistics setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public int getNumberOfStudents() { return numberOfStudents;}

    public Statistics setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        return this;
    }

    public int getNumberOfUniversities() { return numberOfUniversities; }

    public Statistics setNumberOfUniversities(int numberOfUniversities) {
        this.numberOfUniversities = numberOfUniversities;
        return this;
    }

    public String getNameOfUniversity() { return nameOfUniversity;}

    public Statistics setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
        return this;
    }


}
