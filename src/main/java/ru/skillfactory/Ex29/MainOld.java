package ru.skillfactory.Ex29;
import ru.skillfactory.Ex29.comparator.StudentComparator;
import ru.skillfactory.Ex29.comparator.UniversityComparator;
import ru.skillfactory.Ex29.enums.StudentTypeComparatorEnum;
import ru.skillfactory.Ex29.enums.UniversityTypeComparatorEnum;
import ru.skillfactory.Ex29.io.XlsReader;
import ru.skillfactory.Ex29.io.XlsWriter;
import ru.skillfactory.Ex29.io.XmlWriter;
import ru.skillfactory.Ex29.model.CompleteInfo;
import ru.skillfactory.Ex29.model.Statistics;
import ru.skillfactory.Ex29.model.Student;
import ru.skillfactory.Ex29.model.University;
import ru.skillfactory.Ex29.utils.UtilComparator;
import ru.skillfactory.Ex29.utils.UtilStatistics;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MainOld {

    private static final Logger logger = Logger.getLogger(MainOld.class.getName());

    public static void main(String[] args) throws IOException {
        String loggerPropFilePath = "/logging.properties";
        try {
            LogManager.getLogManager().readConfiguration(MainOld.class.getResourceAsStream(loggerPropFilePath));
        } catch(IOException e) {
            System.err.println("no logger config " +loggerPropFilePath +" file found "+e.toString());
        }
        logger.log(Level.INFO,"App started succeffully, logging");

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UtilComparator.getUniversityComparatorTypeClass(UniversityTypeComparatorEnum.YEAR_OF_FOUNDATION);
//        universities.stream().sorted(universityComparator).forEach(System.out::println);
//        System.out.println("To-Json---------------------------------------To-Json");

        universities.sort(universityComparator);
//        String universitiesToJson = UtilJson.universityListToJson(universities);
//        System.out.println(universitiesToJson);
//
//        System.out.println("End_To-Json------------From-Json--------------End_To-Json");
//
//        List<University> universitiesFromJson = UtilJson.jsonToUniversityList(universitiesToJson);
//        System.out.println(universities.size()==universitiesFromJson.size());
//
//        System.out.println("\n__________From-Json_End________________________\n");
//        universities.forEach(university -> {String universityToJson = UtilJson.universityToJson(university);
//            System.out.println("\nTo_Json_Test_Each----------------To-Json-Test_Each\n");
//            System.out.println(universityToJson);
//        University universityFromJson = UtilJson.jsonToUniversity(universityToJson);
//            System.out.println("\n------To_University_from_Json----------------\n");
//            System.out.println(universityFromJson);});
//        System.out.println("\n--------To_University_from_Json----------------\n");
        // ----- students
        // ----- students
        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                UtilComparator.getStudentComparatorTypeClass(StudentTypeComparatorEnum.AVG_EXAM_SCORE);
//        students.stream().sorted(studentComparator).forEach(System.out::println);
        students.sort(studentComparator);
//        String studentsToJson = UtilJson.studentListToJson(students);
//        System.out.println(studentsToJson);
//        //stdlist
//        List<Student> studentsFromJson = UtilJson.jsonToStudentList(studentsToJson);
//        System.out.println("\nTest reversing to fromJson is TRUE------ \n");
//        System.out.println(students.size() == studentsFromJson.size());
//        System.out.println("\nTest reversing to fromJson ------ \n");
//        students.forEach(student-> {
//            String studentToJsonStr = UtilJson.studentToJson(student);
//            System.out.println(studentToJsonStr);
//            Student studentFromJsonStud = UtilJson.jsonToStudent(studentToJsonStr);
//            System.out.println(studentFromJsonStud);
//        });

        //writing
        List<Statistics> statisticsList = UtilStatistics.createStatistics(students,universities);
        XlsWriter.wrtStatisticsXls(statisticsList,"src/main/resources/universityStatistics.xlsx");
        CompleteInfo completeInfo = new CompleteInfo();
        completeInfo.setStatisticsList(statisticsList);
        completeInfo.setStudentList(students);
        completeInfo.setUniversityList(universities);
        completeInfo.setTimeStamp(new Date());

        XmlWriter.completeInfoToXml(completeInfo);

        logger.log(Level.INFO, "Main module finished!");
    }
}

