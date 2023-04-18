package ExcelReader;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel8 {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream file=new FileInputStream("F:\\testdata3.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while(itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellitr = row.cellIterator();
				while(cellitr.hasNext()) {
					Cell cell = cellitr.next();
					System.out.println(cell);
				}
			}
			
			
		} catch (Exception e) {
			
		}
	}

}
