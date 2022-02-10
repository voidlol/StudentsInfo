package ru.voidlol.studentsinfo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.voidlol.studentsinfo.model.Student;
import ru.voidlol.studentsinfo.model.University;

import java.util.List;

public class JsonUtil {
    private JsonUtil() {}

    private static String objToJson(Object o) {
        return new Gson().newBuilder().setPrettyPrinting().create().toJson(o);
    }

    public static String studentToJson(Student student) {
        return objToJson(student);
    }

    public static String studentsToJson(List<Student> students) {
        return objToJson(students);
    }

    public static String universityToJson(University university) {
        return objToJson(university);
    }

    public static String universitiesToJson(List<University> universities) {
        return objToJson(universities);
    }

    public static Student jsonToStudent(String json) {
        return new Gson().fromJson(json, Student.class);
    }

    public static List<Student> jsonToStudents(String json) {
        return new Gson().fromJson(json, new TypeToken<List<Student>>() {}.getType());
    }

    public static University jsonToUniversity(String json) {
        return new Gson().fromJson(json, University.class);
    }

    public static List<University> jsonToUniversities(String json) {
        return new Gson().fromJson(json, new TypeToken<List<University>>() {}.getType());
    }
}
