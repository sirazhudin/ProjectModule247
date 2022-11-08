package ru.skillfactory.Ex2;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        for(University university : universities) {
            System.out.println(university);
        }

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        for(Student student : students) {
            System.out.println(student);
        }
    }
}

      /*  StudyProfile studyProfileMath = StudyProfile.MATHEMATICS;
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
