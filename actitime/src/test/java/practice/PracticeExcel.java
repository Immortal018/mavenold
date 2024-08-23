package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeExcel {
	
	
	String filepath;
	
	public PracticeExcel(String filepath) {
		this.filepath=filepath;
	}
	
	public  String[][] mmm(String sheetName) {
		
		try {
			FileInputStream fis=new FileInputStream(filepath);
			Workbook  wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			int lastrow=s.getLastRowNum();
			int pr=s.getPhysicalNumberOfRows();
			int lastcell=s.getRow(0).getLastCellNum();
			
			String[][] data=new String[lastrow][lastcell];
			for (int i = 1; i <=lastrow; i++) {
				Row r = s.getRow(i);
				for (int j = 0; j <lastcell; j++) {
					Cell c = r.getCell(j);
					DataFormatter dt=new DataFormatter();
					String ss=dt.formatCellValue(c);
					//String ret = c.getStringCellValue();
					//System.out.println(ss);
					data[i-1][j]=ss;
					//System.out.println(ss);
				}
				
			}
			fis.close();
			return data;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
