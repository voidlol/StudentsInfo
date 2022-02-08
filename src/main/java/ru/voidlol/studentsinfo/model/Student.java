package ru.voidlol.studentsinfo.model;

public class Student {

    private String universityId;
    private String fullName;
    private int currentCourseNumber;
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

    public Student build() {
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
