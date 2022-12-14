package ru.skillfactory.Ex27.io;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.skillfactory.Ex27.model.Statistics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    private XlsWriter(){}
    public static void wrtStatisticsXls(List<Statistics> statisticsList, String pathToWrt) throws IOException {
        XSSFWorkbook statisticsXxssfWorkbook = new XSSFWorkbook();
        XSSFSheet statisticsXssfSheet = statisticsXxssfWorkbook.createSheet("Statistics");

        int rowNum = 0;
        Row headerRow = statisticsXssfSheet.createRow(rowNum++);
        Cell profileHeaderCell = headerRow.createCell(0);
        profileHeaderCell.setCellValue("Study Profile");

        Cell averageSocoreHeaderCell = headerRow.createCell(1);
        averageSocoreHeaderCell.setCellValue("Average ScoreMark");

        Cell numberOfStudentsHeaderCell = headerRow.createCell(2);
        numberOfStudentsHeaderCell.setCellValue("Number of Students");

        Cell numberOfUniverisitiesHeaderCell = headerRow.createCell(3);
        numberOfUniverisitiesHeaderCell.setCellValue("Number of Universities");

        Cell universityHeaderCell = headerRow.createCell(4);
        universityHeaderCell.setCellValue("University");

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
        }
    }
}
