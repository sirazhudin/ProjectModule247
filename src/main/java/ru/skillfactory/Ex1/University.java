package ru.skillfactory.Ex1;

public class University {
    String id,fullName, shortName, mainProfileRus = "";
    int yearOfFoundation;
    StudyProfile mainProfile;
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
                +"\nUniversity Name: " + fullName
                +"\nUniversity Name: " + shortName
                +"\nFounded: " + yearOfFoundation
                +"\nSpecialization: " + mainProfile
                +"\nRu : " + mainProfileRus;

   }
}
