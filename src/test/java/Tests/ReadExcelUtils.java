package Tests;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelUtils {

	@Test
	public static void readExcel() throws IOException {

		String file = System.getProperty("user.dir") + "\\testdata\\LoginData.xlsx";
		try (FileInputStream fis = new FileInputStream(file); Workbook workbook = new XSSFWorkbook(fis)) {

			// Get the first sheet from the workbook
			Sheet sheet = workbook.getSheetAt(0);

			// Iterate through rows and columns
			for (Row row : sheet) {
				for (Cell cell : row) {
					System.out.print(cell.getStringCellValue() + "\t");
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
