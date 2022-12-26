package ru.skillfactory.Ex29.model;
import jakarta.xml.bind.annotation.*;

import java.util.Date;
import java.util.List;

@XmlRootElement(name="root")//will be <root></root>
@XmlAccessorType(XmlAccessType.FIELD)
public class CompleteInfo {
    //for Student class List
    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement(name="studentEntry")
    private List<Student> studentList;

    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement(name="universityEntry")
    private List<University> universityList;

    @XmlElementWrapper(name = "statisticsInfo")
    @XmlElement(name = "statisticsEntry")
    private List<Statistics> statisticsList;

    @XmlElement(name = "processedAt")
    private Date timeStamp;//bottom

    public CompleteInfo(){}//constr

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
    }

    public List<Statistics> getStatisticsList() {
        return statisticsList;
    }

    public void setStatisticsList(List<Statistics> statisticsList) {
        this.statisticsList = statisticsList;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public CompleteInfo setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }



//    public CompleteInfo setStatisticsList(List<Statistics> statisticsList) {
//        this.statisticsList= this.statisticsList;
//        return this;
//    }

}
