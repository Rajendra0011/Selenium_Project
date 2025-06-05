package paraMetrization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataFromSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\DDF.xlsx");
		
		Sheet wbook = WorkbookFactory.create(file).getSheet("Sheet2");
		int totalRow = wbook.getLastRowNum();
		
		for(int i=0;i<totalRow;i++) {
			
			Row row = wbook.getRow(i);
			
			short cell = row.getLastCellNum();
			
			for(int j=0;j<cell;j++) {
				
				String value = row.getCell(j).getStringCellValue();
				System.out.print(value+"   ");
			}
			System.out.println();
		}
		
	}

}
