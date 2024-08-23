package com.krn.acti.testbase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import taskpage.LoginPage;
import taskpage.TasksPage;


public class BaseClass {
	
	public WebDriver driver;
	public ExcelLibrary xlib;
	public TasksPage tp;
	public LoginPage lp;
	
	
 @BeforeClass
 @Parameters({"browser"})
  public void openbrowser() {
	 xlib=new ExcelLibrary();
	 String browsername=xlib.getExcelData("BrowserName", 1, 0);
	 if (browsername.equals("chrome")) {
		 driver =new ChromeDriver();
		 System.out.println("chrome opened");	
	}
	 else if (browsername.equals("edge")) {
		 driver =new EdgeDriver();
		
	}
	 else if (browsername.equals("firefox")) {
		 driver =new FirefoxDriver();
		
	}else if (browsername.equals("safari")) {
		driver =new SafariDriver();
	
	}
	else {
		System.out.println("Invalid Browser");
		return;
	}
	 
	 
	  
	  driver.manage().window().maximize();
	  driver.get("https://online.actitime.com/self4/login.do");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
 }
 @BeforeMethod
 public void login() throws InterruptedException {
	 
	  String un=xlib.getExcelData("Login", 1, 0);
	  String pw=xlib.getExcelData("Login", 1, 1);
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.name("pwd")).sendKeys(pw);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(3000);
	  
 }
 @AfterMethod
 public void logout() {
	  driver.findElement(By.id("logoutLink")).click();
 }
 @AfterClass
 public void CloseBrowser() {
	  driver.close();
 }
}
