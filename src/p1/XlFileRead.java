package p1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlFileRead {

	public static void main(String[] args) throws Exception {

		Row row;
		Cell cell;
		FileInputStream f = new FileInputStream("F:\\ImranXl.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(f);
		Sheet s = workbook.getSheetAt(0);

		int countRow = s.getPhysicalNumberOfRows();

		for (int i = 0; i < countRow; i++) {

			Row row2 = s.getRow(i);

			int cellCount = row2.getPhysicalNumberOfCells();

			for (int j = 0; j < cellCount; j++) {

				Cell getCell = row2.getCell(j);
				
				String value = getCell.getStringCellValue();
			String value1 = String.valueOf(getCell.getStringCellValue());
			
			System.out.println();
				
				}
				System.out.println();
				}
				
			}


}
