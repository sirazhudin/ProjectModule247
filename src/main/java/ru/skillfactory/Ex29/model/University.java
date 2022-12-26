package ru.skillfactory.Ex29.model;

import com.google.gson.annotations.SerializedName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
import ru.skillfactory.Ex29.enums.StudyProfile;
@XmlAccessorType(XmlAccessType.FIELD)
public class University {
    @SerializedName(value = "universityId", alternate = "id")
    @XmlElement(name = "UniversityID")
    String id;
    @SerializedName(value = "universityName", alternate = "fullName")@XmlElement(name="UniversityName")
    String fullName;
    @SerializedName(value = "universityShortName",alternate = "shortName")
    @XmlTransient
    String shortName;

    @SerializedName(value = "founded",alternate = "yearOfFounddation")
    @XmlElement(name = "Founded")
    int yearOfFoundation;
    @SerializedName(value = "profile",alternate = "mainProfile")
    @XmlElement(name = "Profile ")
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
