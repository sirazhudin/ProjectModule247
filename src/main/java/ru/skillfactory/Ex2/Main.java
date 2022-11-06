package ru.skillfactory.Ex2;

public class Main {
    public static void main(String[] args)  {
        Student student = new Student(
                "Surname Name SecondName"
                ,"DGPTI"
                ,5
                , 5.0f);
        System.out.println(student);

        University university = new University(
            "DGPTI",
            "State University",
            "DGU",
            1970,
            StudyProfile.PHYSICS);
            university.setMainProfileRus(StudyProfile.PHYSICS.getStudyProfileRus());
        System.out.println(university);
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
