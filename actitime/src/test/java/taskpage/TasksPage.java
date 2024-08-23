package taskpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TasksPage {
	
	public void ClickOnTasks(WebDriver driver) {
		driver.findElement(By.xpath("//a[@href='/self4/tasks/tasklist.do\']")).click();
	}
	
	public void ClickOnAdd(WebDriver driver) {
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	}
	
	public void ClickOnCreate(WebDriver driver) {
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();;
	}
	
	public String checkTitle(WebDriver driver) {
		
		  String act=driver.getTitle();
		  return act;
		 
	}

}
