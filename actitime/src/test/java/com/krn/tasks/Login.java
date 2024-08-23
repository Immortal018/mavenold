package com.krn.tasks;

import org.testng.annotations.Test;

import com.krn.acti.testbase.ExcelLibrary;

public class Login{
	public ExcelLibrary xlib;
	@Test
	public void signin() {
		xlib=new ExcelLibrary();
		int last=xlib.getLastRowNumber("login");
		for (int i = 1; i <=last ; i++) {
			String ss = xlib.getExcelData("login", i, 0);
			System.out.println(ss);
			//lp.userName(driver, ss);
		}
	
	}

}
