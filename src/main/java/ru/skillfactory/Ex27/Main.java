package ru.skillfactory.Ex27;
import ru.skillfactory.Ex27.comparator.StudentComparator;
import ru.skillfactory.Ex27.comparator.UniversityComparator;
import ru.skillfactory.Ex27.enums.StudentTypeComparatorEnum;
import ru.skillfactory.Ex27.enums.UniversityTypeComparatorEnum;
import ru.skillfactory.Ex27.io.XlsReader;
import ru.skillfactory.Ex27.model.Student;
import ru.skillfactory.Ex27.model.University;
import ru.skillfactory.Ex27.utils.UtilComparator;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UtilComparator.getUniversityComparatorTypeClass(UniversityTypeComparatorEnum.YEAR_OF_FOUNDATION);
        universities.stream().sorted(universityComparator).forEach(System.out::println);

        System.out.println("___________________________________\n");
        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                UtilComparator.getStudentComparatorTypeClass(StudentTypeComparatorEnum.AVG_EXAM_SCORE);
        students.stream().sorted(studentComparator).forEach(System.out::println);

    }
}

