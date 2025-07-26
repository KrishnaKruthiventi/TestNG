package testNgParameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderWithExcel {
	
	@DataProvider(name = "excelData")
	public Object[][] provideExcelData() throws IOException{
		String excelFilePath = "src/test/resources/test.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow().getLastCellNum();
		
		Object[][] data = new Object[rowCount - 1][colCount];
		
		for(int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j = 0; j < colCount; j++) {
				data[i - 1][j] = row.getCell(j).toString();
			}
		}
		
		workbook.close();
		fis.close();
		
		return data;  
	}
}
