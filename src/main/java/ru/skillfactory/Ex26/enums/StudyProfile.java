package ru.skillfactory.Ex26.enums;

public enum StudyProfile {

    MEDICINE(1){
        @Override
        public String getStudyProfileRus() {
            return "Медицина";
        }
    },
    CHEMISTRY(2){
        @Override
        public String getStudyProfileRus() {
            return "Химия";
        }
    },//("Химия"),
    ENGINEERING(3){
        @Override
        public String getStudyProfileRus() {
            return "Инженер Электрик";
        }
    },//("Инженер Электрик"),
    NUCLEAR(4){
        @Override
        public String getStudyProfileRus() {
            return "Ядерная Физика";
        }
    },//("Ядерная Физика"),
    PHYSICS(5){
        @Override
        public String getStudyProfileRus() {
            return "Общая Физика";
        }
    },//("Общая Физика"),
    MATHEMATICS(6){
        @Override
        public String getStudyProfileRus() {
            return "Математический Факультет";
        }
    },//("Математический Факультет"),
    PROGRAMMING(7){
        @Override
        public String getStudyProfileRus() {
            return "Програмирование";
        }
    },//("Програмирование");
    LINGUISTICS(8){
        @Override
        public String getStudyProfileRus() {
            return "Лингвистический";
        }
    };//("Програмирование");

    private int studyProfileValue;
    //constructor
    private StudyProfile(int studyProfileValue) {
        this.studyProfileValue=studyProfileValue;
    }
    //getter returns value
    public int getStudyProfileValue() {
        return this.studyProfileValue;
    }
    //getter abstract returns string associated with enum-value
    public abstract String getStudyProfileRus();
}
