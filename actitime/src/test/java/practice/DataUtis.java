package practice;

import org.testng.annotations.DataProvider;

public class DataUtis {
	
	PracticeExcel pe=new PracticeExcel("../data/Data.xlsx");
	
	@DataProvider(name= "dp",indices = 5)
	public String[][] logindata(){
		
		
		String[][] newdata=pe.mmm("login");
		
			
		return newdata ;
		
	}

	@DataProvider(name="dp2")
	public String[][] createcustomer(){
		
		String[][] create=pe.mmm("createcustomer");
		return create;
		
	}
	
}
