package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        //once excel açılır sheete ulaşılır
        //yazma işlemleri eklenir ()hafıza cache bellekte
        //yazma modunda acip ,hafızadaki işlemleri kaydederim
        String path = "src/test/java/ApachePOI/resorce/bosExcel.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        //Hafızadaki işlemelere devam ediyoruz

        Row newRow = sheet.createRow(0);// en son satırın altına yazdı
        Cell newCell = newRow.createCell(0);
        newCell.setCellValue("Merhaba Dünya");

        //Sıra kaydetmeye geldi ama önce okuma modundan çıkıp yazma modunu açmamız lazım
        inputStream.close(); // okuma modu kapatıldı

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream); // Save işlemi yapıldı
        workbook.close();// hafızayı boşalt
        outputStream.close();// hafızayı boşalt
        System.out.println("yazma işlemi gerçekleştirildi");
    }
}
