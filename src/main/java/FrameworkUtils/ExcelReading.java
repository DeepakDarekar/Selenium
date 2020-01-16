package FrameworkUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReading {

	private Workbook workbook;

	@DataProvider
	public Object[][] provideTestData() throws InvalidFormatException, IOException {

		int rowCount = 0;
		int colCount = 2;
		List<Object> records = new ArrayList<Object>();

		records= readFromTestDataXls(rowCount, records);
		return generateDataArray(records, rowCount, colCount);

	}

	private List<Object> readFromTestDataXls(int rowCount, List<Object> records) throws IOException, InvalidFormatException {
		File file = new File("testdata.xlsx");
		workbook = new XSSFWorkbook(file);

		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();

		while (rows.hasNext()) {

			Row row = rows.next();
			rowCount++;

			Iterator<Cell> cells = row.iterator();

			while (cells.hasNext()) {

				Cell cell = cells.next();

				String value = cell.getStringCellValue();

				records.add(value);
			}

		}
		return records;
	}

	public static Object[][] generateDataArray(List<Object> records, int rowCount, int columnCount) {
		// columnCount = columnCount / rowCount;
		int k = 0;
		String[][] xlsData = new String[rowCount][columnCount];
		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {
				xlsData[i][j] = (String) records.get(k++);

			}
		}
		return xlsData;
	}

}
