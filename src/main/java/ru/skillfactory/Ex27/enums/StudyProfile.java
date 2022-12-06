package ru.skillfactory.Ex27.enums;

public enum StudyProfile {

    MEDICINE(1){ @Override public String getStudyProfileRus() {
            return "Медицина";
        }},
    CHEMISTRY(2){ @Override public String getStudyProfileRus() {
            return "Химия";
        }},
    ENGINEERING(3){@Override public String getStudyProfileRus() { return "Инженер Электрик";}},
    NUCLEAR(4){ @Override public String getStudyProfileRus() { return "Ядерная Физика";}},
    PHYSICS(5){ @Override public String getStudyProfileRus() { return "Общая Физика"; }},
    MATHEMATICS(6){@Override public String getStudyProfileRus() { return "Математический Факультет";}},
    PROGRAMMING(7){@Override public String getStudyProfileRus() {
        return "Програмирование";}},
    LINGUISTICS(8){@Override  public String getStudyProfileRus() { return "Лингвистический"; }},
    JURISPRUDENCE(9){@Override public String getStudyProfileRus(){
        return "Юриспруденция"; }},
    COMPUTER_SCIENCE(10){@Override public String getStudyProfileRus(){ return "Информатика";}};

    private final int studyProfileValue;
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
