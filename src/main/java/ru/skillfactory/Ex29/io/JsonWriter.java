package ru.skillfactory.Ex29.io;



import ru.skillfactory.Ex29.model.CompleteInfo;
import ru.skillfactory.Ex29.utils.UtilJson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonWriter {

private static final Logger logger = Logger.getLogger(JsonWriter.class.getName());
    private JsonWriter() {}


    public static void javaToJson(CompleteInfo completeInfo){
        logger.log(Level.INFO,"To Jason Started");
        try {//create folder
            Files.createDirectory(Paths.get("jsonReqs"));
            logger.log(Level.INFO,"Creating folder jsonReqs");
        } catch(IOException e){
            logger.log(Level.FINE,"Directory exists",e);
        }
        //write ot xml
        studentsToJson(completeInfo);
        universitiesToJson(completeInfo);
        statisticsToJson(completeInfo);
    }
    static void studentsToJson(CompleteInfo completeInfo){
        String studentsJson = UtilJson.studentListToJson(completeInfo.getStudentList());
        try{
            FileOutputStream outputStream = new FileOutputStream("jsonReqs/students"+completeInfo.getTimeStamp().getTime()+".json");
            outputStream.write(studentsJson.getBytes(StandardCharsets.UTF_8));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    static void universitiesToJson(CompleteInfo completeInfo) {
        String universitiesJson = UtilJson.universityListToJson(completeInfo.getUniversityList());
        writeToFile("universities",universitiesJson);

    }

    static void statisticsToJson(CompleteInfo completeInfo) {
        String statisticsJson = UtilJson.statisticsListToJson(completeInfo.getStatisticsList());
        writeToFile("statistics",statisticsJson);
    }

    //write to file
    static void writeToFile(String filename, String classList) {

        try{
            FileOutputStream outputStream = new FileOutputStream("jsonReqs/"+filename+"."+new Date().getTime()+".json");
            outputStream.write(classList.getBytes(StandardCharsets.UTF_8));
        }catch(IOException e) {
            logger.log(Level.SEVERE,"cannot create file "+filename+" !!!!",e);

        }
    }

}
