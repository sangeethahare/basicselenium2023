package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileRead {
	public static void main(String[] args) throws Throwable {
		//step 1:open the file java readable format
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		//step2:create workbook
		Workbook wb = WorkbookFactory.create(file);
		//step3:navigate sheet
		Sheet sheet = wb.getSheet("sample");
		//step4:navigate to the row
		Row row = sheet.getRow(2);
		//step5:navigate to the cell
		Cell cell = row.getCell(2);
		//step6:capture the data
		String data = cell.getStringCellValue();
		System.out.println("data in row 2&cell2="+data);
		
		
	}

}
