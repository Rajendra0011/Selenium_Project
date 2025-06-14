package paraMetrization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		FileInputStream file = new FileInputStream("D:\\Automations Skills\\Selenium_Java\\Parametrization\\TT.xlsx");

		Sheet workbook = WorkbookFactory.create(file).getSheet("Sheet1");

		int totalRow = workbook.getLastRowNum();

		for (int i = 0; i < totalRow; i++) {

			Row row = workbook.getRow(i);

			int cell = row.getLastCellNum();

			for (int j = 0; j < cell; j++) {

				String value = row.getCell(j).getStringCellValue();
				System.out.print(value + "  ");
			}

			System.out.println();
		}
	}

}
