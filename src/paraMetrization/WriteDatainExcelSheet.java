package paraMetrization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		FileInputStream file = new FileInputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\DDF.xlsx");
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.createSheet("Sheet3");
		
		Object 
		empData [][] = {
						{"EmpID","Name","Job"},
						{"1001","Gopal","QA"},
						{"1020","Diga","Manager"},
						{"1234","Raju","Analyst"},
						{"5656","Balaji","CEO"},
						};
			int col = empData.length;
			int row = empData[0].length;
			
			for(int i=0;i<col;i++) {
				Row row1=sheet.createRow(i);
				
				for(int j=0;j<row;j++) {
					Cell cell1=row1.createCell(j);				
					Object value = empData[i][j];
					if (value instanceof String)
						cell1.setCellValue((String) value);
					if (value instanceof Integer)
						cell1.setCellValue((Integer) value);
					if (value instanceof Boolean)
						cell1.setCellValue((Boolean) value);
				}
			}
			FileOutputStream file1= new FileOutputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\DDF.xlsx");
			workbook.write(file1);
			System.out.println("empData.xlsx written successfully");
			file1.close();
		

	}
}