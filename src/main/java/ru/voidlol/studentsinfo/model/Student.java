package ru.voidlol.studentsinfo.model;

import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("University ID")
    private String universityId;

    @SerializedName("Full Name")
    private String fullName;

    @SerializedName("Current Course")
    private int currentCourseNumber;

    @SerializedName("Average Exam Score")
    float avgExamScore;

    public Student() {
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public Student setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "universityId='" + universityId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }
}
