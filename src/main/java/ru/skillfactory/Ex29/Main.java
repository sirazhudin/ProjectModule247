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

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        String loggerPropFilePath = "/logging.properties";
        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream(loggerPropFilePath));
        } catch(IOException e) {
            System.err.println("no logger config " +loggerPropFilePath +" file found "+e.toString());
        }
        logger.log(Level.INFO,"App started succeffully, logging");

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UtilComparator.getUniversityComparatorTypeClass(UniversityTypeComparatorEnum.YEAR_OF_FOUNDATION);


        universities.sort(universityComparator);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                UtilComparator.getStudentComparatorTypeClass(StudentTypeComparatorEnum.AVG_EXAM_SCORE);

        students.sort(studentComparator);


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

