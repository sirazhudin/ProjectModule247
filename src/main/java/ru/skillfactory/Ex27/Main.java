package ru.skillfactory.Ex27;
import ru.skillfactory.Ex27.comparator.StudentComparator;
import ru.skillfactory.Ex27.comparator.UniversityComparator;
import ru.skillfactory.Ex27.enums.StudentTypeComparatorEnum;
import ru.skillfactory.Ex27.enums.UniversityTypeComparatorEnum;
import ru.skillfactory.Ex27.io.XlsReader;
import ru.skillfactory.Ex27.io.XlsWriter;
import ru.skillfactory.Ex27.model.Statistics;
import ru.skillfactory.Ex27.model.Student;
import ru.skillfactory.Ex27.model.University;
import ru.skillfactory.Ex27.utils.UtilComparator;
import ru.skillfactory.Ex27.utils.UtilJson;
import ru.skillfactory.Ex27.utils.UtilStatistics;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UtilComparator.getUniversityComparatorTypeClass(UniversityTypeComparatorEnum.YEAR_OF_FOUNDATION);
        universities.stream().sorted(universityComparator).forEach(System.out::println);
        System.out.println("To-Json---------------------------------------To-Json");

        universities.sort(universityComparator);
        String universitiesToJson = UtilJson.universityListToJson(universities);
        System.out.println(universitiesToJson);

        System.out.println("End_To-Json------------From-Json--------------End_To-Json");

        List<University> universitiesFromJson = UtilJson.jsonToUniversityList(universitiesToJson);
        System.out.println(universities.size()==universitiesFromJson.size());

        System.out.println("\n__________From-Json_End________________________\n");
        universities.forEach(university -> {String universityToJson = UtilJson.universityToJson(university);
            System.out.println("\nTo_Json_Test_Each----------------To-Json-Test_Each\n");
            System.out.println(universityToJson);
        University universityFromJson = UtilJson.jsonToUniversity(universityToJson);
            System.out.println("\n------To_University_from_Json----------------\n");
            System.out.println(universityFromJson);});
        System.out.println("\n--------To_University_from_Json----------------\n");
        // ----- students
        // ----- students
        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                UtilComparator.getStudentComparatorTypeClass(StudentTypeComparatorEnum.AVG_EXAM_SCORE);
        students.stream().sorted(studentComparator).forEach(System.out::println);
        students.sort(studentComparator);
        String studentsToJson = UtilJson.studentListToJson(students);
        System.out.println(studentsToJson);
        //stdlist
        List<Student> studentsFromJson = UtilJson.jsonToStudentList(studentsToJson);
        System.out.println("\nTest reversing to fromJson is TRUE------ \n");
        System.out.println(students.size() == studentsFromJson.size());
        System.out.println("\nTest reversing to fromJson ------ \n");
        students.forEach(student-> {
            String studentToJsonStr = UtilJson.studentToJson(student);
            System.out.println(studentToJsonStr);
            Student studentFromJsonStud = UtilJson.jsonToStudent(studentToJsonStr);
            System.out.println(studentFromJsonStud);
        });

        //writing
        List<Statistics> statisticsList = UtilStatistics.createStatistics(students,universities);
        XlsWriter.wrtStatisticsXls(statisticsList,"src/main/resources/universityStatistics.xlsx");

    }
}

