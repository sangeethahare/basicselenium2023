package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite {
	public static void main(String[] args) throws Throwable {
		//step1:open the file java readable format
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		//step2:create workbook
		Workbook wb = WorkbookFactory.create(fis);
		//step3:navigate to sheet
		Sheet sheet = wb.createSheet("Trial");
		//steP4:navigate to row
		Row row = sheet.createRow(6);
		//step5:navigate to cell
		Cell cell = row.createCell(7);
		//step6:set the data
		cell.setCellValue("sangeetha");
		//open the file as java writable format
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\testdata.xlsx");
		//call write method
	wb.write(fos);
	System.out.println("data added");
	}

}
