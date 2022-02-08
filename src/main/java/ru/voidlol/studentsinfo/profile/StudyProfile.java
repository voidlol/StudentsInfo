package ru.voidlol.studentsinfo.profile;

public enum StudyProfile {
    COMPUTER_SCIENCE(""), MEDICINE("Медицина"), LAYWER("Юрист"), ECONOMIST("Экономист");

    private String ruProfileName;

    StudyProfile(String ruProfileName) {
        this.ruProfileName = ruProfileName;
    }

    public String getRuProfileName() {
        return ruProfileName;
    }
}
