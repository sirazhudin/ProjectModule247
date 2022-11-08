package ru.skillfactory.Ex3.comparator.model;

import ru.skillfactory.Ex3.enums.StudyProfile;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;
    //russian
    String mainProfileRus = "";
    public University(){}

    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile){
        this.id=id;
        this.fullName=fullName;
        this.shortName=shortName;
        this.yearOfFoundation=yearOfFoundation;
        this.mainProfile=mainProfile;
    }
    public String getId() {
        return id;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }

    public University setMainProfileRus(String mainProfileRus) {
        this.mainProfileRus=mainProfileRus;
        return this;
    }

    public String getMainProfileRus() {
        return mainProfileRus;
    }

   public String toString() {
        return "University ID: " + id
                +" : University Name: " + fullName
                +" : University Name: " + shortName
                +" : Founded: " + yearOfFoundation
                +" : Specialization: " + mainProfile
                +" : Ru : " + mainProfileRus;

   }
}
