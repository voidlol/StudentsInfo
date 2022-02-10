package ru.voidlol.studentsinfo.model;

import com.google.gson.annotations.SerializedName;
import ru.voidlol.studentsinfo.enums.StudyProfile;

public class University {

    @SerializedName("ID")
    private String id;

    @SerializedName("Full Name")
    private String fullName;

    @SerializedName("Short Name")
    private String shortName;

    @SerializedName("Year of Foundation")
    private int yearOfFoundation;

    @SerializedName("Main Profile")
    private StudyProfile mainProfile;

    public University() {
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile.getRuProfileName() +
                '}';
    }
}
