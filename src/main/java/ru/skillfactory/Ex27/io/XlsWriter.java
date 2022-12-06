package ru.skillfactory.Ex27.io;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.skillfactory.Ex27.model.Statistics;

import java.io.IOException;
import java.util.List;

public class XlsWriter {
    private XlsWriter(){}
    public static void wrtStatisticsXls(List<Statistics> statisticsList, String pathToWrt) throws IOException {
        XSSFWorkbook statisticsXxssfWorkbook = new XSSFWorkbook();
        XSSFSheet statisticsXssfSheet = statisticsXxssfWorkbook.createSheet("Statistics");

        int rowNum = 1;
        Row headerRow = statisticsXssfSheet.createRow(rowNum);
        Cell profileHeaderCell = headerRow.createCell(1);
        profileHeaderCell.setCellValue("Study Profile");
        Cell averageSocoreHeaderCell = headerRow.createCell(2);
        averageSocoreHeaderCell.setCellValue("Average Score/Mark");
        Cell numberOfStudentsHeaderCell = headerRow.createCell(3);
        numberOfStudentsHeaderCell.setCellValue("Number of Students");
        Cell numberOfUniverisitiesHeaderCell = headerRow.createCell(4);
        numberOfUniverisitiesHeaderCell.setCellValue("Number of Universities");
        for (Statistics statistics:statisticsList) {
            rowNum++;
            Row rowData = statisticsXssfSheet.createRow(rowNum);
            Cell studyProfileCell = rowData.createCell(1);
            studyProfileCell.setCellValue(statistics.getStudyProfile().getStudyProfileRus());
            Cell avgScoreCell = rowData.createCell(2);
            avgScoreCell.setCellValue(statistics.getAvgExamScore());
            Cell numberOfStudentsCell = rowData.createCell(3);
            numberOfStudentsCell.setCellValue(statistics.getNumberOfStudents());
            Cell numberOfUniversitiesCell = rowData.createCell(4);
            numberOfUniversitiesCell.setCellValue(statistics.getNameOfUniversity());
            Cell universityNameCell = rowData.createCell(5);
            universityNameCell.setCellValue(statistics.getNameOfUniversity());
        }
    }
}
