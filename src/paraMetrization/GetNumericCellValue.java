package paraMetrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericCellValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\DDF.xlsx");
		
		Sheet workbookSheet = WorkbookFactory.create(file).getSheet("Sheet1");
//		Row row = workbookSheet.getRow(0);
//		Cell cell = row.getCell(0);
		
		System.out.println(workbookSheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(workbookSheet.getRow(0).getCell(2).getNumericCellValue());
		
		short totalCol = workbookSheet.getRow(0).getLastCellNum();
		System.out.println(totalCol);
		int totalRow = workbookSheet.getLastRowNum()+1;
		System.out.println(totalRow);
		
		
	}

}
