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

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

//====================================================================================================================		
		
		FileInputStream file = new FileInputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\DDF.xlsx");
		Workbook workBook = WorkbookFactory.create(file);		
		Sheet sheet = workBook.createSheet("Sheet6");

//====================================================================================================================		
		Object empData[][] = { 
				{ "Emp_ID", "Name", "Job" }, 
				{ "1001", "Akshu", "QA" }, 
				{ "1002", "Diga", "Manager" },
				{ "1003", "Raj", "Analyst" }, 
				{ "1004", "Gopal", "DevLoper" } 
				};
//====================================================================================================================

		int row = empData.length;
		int col = empData[0].length;
		
//====================================================================================================================
		for (int i = 0; i < row; i++) {

			Row row1 = sheet.createRow(i);

			for (int j = 0; j < col; j++) {

				Cell cell1 = row1.createCell(j);

				Object value = empData[i][j];
				
				if (value instanceof String)
					cell1.setCellValue((String) value);
				if (value instanceof Integer)
					cell1.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell1.setCellValue((Boolean) value);
			}

		}
//====================================================================================================================
		FileOutputStream file1 = new FileOutputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\DDF.xlsx");
		workBook.write(file1);
		System.out.println("SuccesssFully write data");
		workBook.close();
		file1.close();
//====================================================================================================================
		
	}

}
