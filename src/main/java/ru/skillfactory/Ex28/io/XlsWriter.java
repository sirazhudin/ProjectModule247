package ru.skillfactory.Ex28.io;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.skillfactory.Ex28.model.Statistics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class XlsWriter {
    private static final Logger logger = Logger.getLogger(XlsWriter.class.getName());
    private XlsWriter(){}
    public static void wrtStatisticsXls(List<Statistics> statisticsList, String pathToWrt) throws IOException {

        logger.log(Level.INFO,"Writing to the " + pathToWrt + " file - started!");
        XSSFWorkbook statisticsXxssfWorkbook = new XSSFWorkbook();
        XSSFSheet statisticsXssfSheet = statisticsXxssfWorkbook.createSheet("Statistics");
//setting up fonts

        Font headerFont = statisticsXxssfWorkbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        CellStyle headerStyle = statisticsXxssfWorkbook.createCellStyle();
        headerStyle.setFont(headerFont);
       // headerStyle.setFillBackgroundColor( );
// end of setting up fonts
        int rowNum = 0;
        Row headerRow = statisticsXssfSheet.createRow(rowNum++);
        Cell profileHeaderCell = headerRow.createCell(0);
        profileHeaderCell.setCellValue("Study Profile");
        profileHeaderCell.setCellStyle(headerStyle);

        Cell averageSocoreHeaderCell = headerRow.createCell(1);
        averageSocoreHeaderCell.setCellValue("Average ScoreMark");
        averageSocoreHeaderCell.setCellStyle(headerStyle);

        Cell numberOfStudentsHeaderCell = headerRow.createCell(2);
        numberOfStudentsHeaderCell.setCellValue("Number of Students");
        numberOfStudentsHeaderCell.setCellStyle(headerStyle);

        Cell numberOfUniverisitiesHeaderCell = headerRow.createCell(3);
        numberOfUniverisitiesHeaderCell.setCellValue("Number of Universities");
        numberOfUniverisitiesHeaderCell.setCellStyle(headerStyle);

        Cell universityHeaderCell = headerRow.createCell(4);
        universityHeaderCell.setCellValue("University");
        //set header style
        universityHeaderCell.setCellStyle(headerStyle);

        for (Statistics statistics:statisticsList) {
             Row rowData = statisticsXssfSheet.createRow(rowNum++);
            Cell studyProfileCell = rowData.createCell(0);
            studyProfileCell.setCellValue(statistics.getStudyProfile().getStudyProfileRus());
            Cell avgScoreCell = rowData.createCell(1);
            avgScoreCell.setCellValue(statistics.getAvgExamScore());
            Cell numberOfStudentsCell = rowData.createCell(2);
            numberOfStudentsCell.setCellValue(statistics.getNumberOfStudents());
            Cell numberOfUniversitiesCell = rowData.createCell(3);
            numberOfUniversitiesCell.setCellValue(statistics.getNameOfUniversity());
            Cell universityNameCell = rowData.createCell(4);
            universityNameCell.setCellValue(statistics.getNameOfUniversity());
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToWrt)) {
            statisticsXxssfWorkbook.write(fileOutputStream);
        } catch(IOException e) {
            logger.log(Level.SEVERE, "Writing to   " + pathToWrt + " file failed ",e);
            return;
        }logger.log(Level.INFO,"Write to the " + pathToWrt + " file was successful");
    }
}
