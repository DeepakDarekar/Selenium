package FrameworkUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	protected static Workbook workbook;
	protected static String inputFile;

	public static void main(String[] args) {
		inputFile = "/src/main/resources/accounts_input_data.xlsx";
		try {
			workbook = new XSSFWorkbook();
			// get the Sheet
			Sheet sheet = workbook.getSheet("Sheet");
			// Row row1 = sheet.getRow(0);
			// Cell cell1 = row1.getCell(0);

			Cell cell1 = sheet.getRow(0).getCell(0);
			System.out.println("Value from Cell:" + cell1.getStringCellValue());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
