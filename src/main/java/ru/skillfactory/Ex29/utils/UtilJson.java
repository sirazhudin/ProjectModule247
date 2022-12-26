package ru.skillfactory.Ex29.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ru.skillfactory.Ex29.model.Statistics;
import ru.skillfactory.Ex29.model.Student;
import ru.skillfactory.Ex29.model.University;

import java.util.List;

public class UtilJson {
    private UtilJson(){}

    ///universal call
    public static String classListToJson(List<?> list) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(list);
    }
}


//    public static String studentToJson(Student student){
//        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
//    }
//
//    public static Student jsonToStudent(String json) {
//        return new Gson().fromJson(json, Student.class);
//    }
//
//    public static String universityToJson(University university) {
//        return new GsonBuilder().setPrettyPrinting().create().toJson(university);
//    }
//
//    public static University jsonToUniversity(String json) {
//        return new Gson().fromJson(json, University.class);
//    }
//   // lists to/from Json/Gson
//    public static String universityListToJson(List<University> universityList) {
//        return new GsonBuilder().setPrettyPrinting().create().toJson(universityList);
//    }
//
//    public static List<University> jsonToUniversityList(String json) {
//        return new Gson().fromJson(json, new TypeToken<List<University>>() {}.getType());
//    }
//
//    public static String studentListToJson(List<Student> studentList) {
//        return new GsonBuilder().setPrettyPrinting().create().toJson(studentList);
//    }
//
//    public static List<Student> jsonToStudentList(String json) {
//        return new Gson().fromJson(json, new TypeToken<List<Student>>() {}.getType());
//    }
//    public static String statisticsListToJson(List<Statistics> statisticsList){
//        return new GsonBuilder().setPrettyPrinting().create().toJson(statisticsList);
//    }

