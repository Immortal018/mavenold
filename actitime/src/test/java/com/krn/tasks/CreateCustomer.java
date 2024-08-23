package com.krn.tasks;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.krn.acti.testbase.BaseClass;

public class CreateCustomer extends BaseClass {
  @Test
  public void testCreateCustomer() {
	  tp.ClickOnTasks(driver);
	  tp.ClickOnAdd(driver);
	  String nm= xlib.getExcelData("CreateCustomer", 1, 0);
	  String desc=xlib.getExcelData("CreateCustomer", 1, 1);
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(nm);
	  driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
	  tp.ClickOnCreate(driver);
	  String act=tp.checkTitle(driver);
	  Assert.assertEquals(act, true);
	  
  }
}
