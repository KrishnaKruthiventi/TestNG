package testNgParameterization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithCSV {
	
	@DataProvider(name = "csvData")
	public Object[] provideCSVData() throws IOException{
		String csvFile = "src/test/resources/testdata.csv";
		List<Object[]> testCases = new ArrayList<>();
		String[] data;
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			String line;
			while((line = br.readLine()) != null) {
				data = line.split(",");
				testCases.add(data);
			}
		}
		
		return testCases.toArray(new Object[testCases.size()][]);
	}
	
	@Test(dataProvider = "csvData")
	public void testCSV(Object[] name) {
		System.out.println(Arrays.toString(name));
	}
}
