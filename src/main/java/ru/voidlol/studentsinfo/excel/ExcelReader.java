package ru.voidlol.studentsinfo.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.voidlol.studentsinfo.model.Student;
import ru.voidlol.studentsinfo.model.University;
import ru.voidlol.studentsinfo.enums.StudyProfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    private ExcelReader() {}

    public static List<Student> readStudents(String fileName) {
        List<Student> result = new ArrayList<>();
        try (FileInputStream in = new FileInputStream(fileName)) {
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet sheet = workbook.getSheet("Студенты");
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                String universityId = row.getCell(0).getStringCellValue();
                String fullName = row.getCell(1).getStringCellValue();
                int currentCourse = (int) row.getCell(2).getNumericCellValue();
                float avgExamScore = (float) row.getCell(3).getNumericCellValue();
                result.add(new Student()
                        .setUniversityId(universityId)
                        .setFullName(fullName)
                        .setCurrentCourseNumber(currentCourse)
                        .setAvgExamScore(avgExamScore));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<University> readUniversity(String fileName) {
        List<University> result = new ArrayList<>();
        try (FileInputStream in = new FileInputStream(fileName)) {
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet sheet = workbook.getSheet("Университеты");
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                String id = row.getCell(0).getStringCellValue();
                String fullName = row.getCell(1).getStringCellValue();
                String shortName = row.getCell(2).getStringCellValue();
                int yearOfFoundation = (int) row.getCell(3).getNumericCellValue();
                StudyProfile mainProfile = StudyProfile.valueOf(row.getCell(4).getStringCellValue());
                result.add(new University()
                        .setId(id)
                        .setFullName(fullName)
                        .setShortName(shortName)
                        .setYearOfFoundation(yearOfFoundation)
                        .setMainProfile(mainProfile));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
