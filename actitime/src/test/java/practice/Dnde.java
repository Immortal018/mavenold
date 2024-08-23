package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dnde {
	
	@Test(dataProvider = "dp1")
	
	public void ff(String [][]data) {
		
		System.out.println(data[0][1]);
		
		
	}

	@DataProvider(name="dp1")
	public String[][] gg() {
		String[][] data= {
				{"hey","boss"},
				{"bbb","feeef"},
		};
		
		return data;
		
	}
}
