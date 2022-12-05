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

      /*

//        List<University> toSort = new ArrayList<>();
//        for(University university1 : universities) {
//            toSort.add(university1);
//        }
//        toSort.sort(universityComparator);
//        for(University university1 : toSort) {
//            System.out.println(university1);
//        }

       for(Student student : students) {
            System.out.println(student);
        }

      StudyProfile studyProfileMath = StudyProfile.MATHEMATICS;
        StudyProfile studyProfileMathVal = StudyProfile.valueOf("NUCLEAR");
        System.out.println(studyProfileMath + " Mathematics -- ");
        System.out.println(studyProfileMathVal.getStudyProfileValue() + " value of Mathematics");
        System.out.println("___________________________________________\n");
        System.out.println(StudyProfile.NUCLEAR.getStudyProfileRus()+" Nuclear");
        System.out.println(StudyProfile.CHEMISTRY.getStudyProfileRus()+" Chemistry ");
        System.out.println(StudyProfile.ENGINEERING.getStudyProfileRus()+" Engineering");
        System.out.println(StudyProfile.PROGRAMMING.getStudyProfileRus()+" Programming");

    }
}*/
