package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	
	@Test
	public void shot() throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/@sdetpavan/videos");
		
	File firstsrc=	driver.getScreenshotAs(OutputType.FILE);
	File destsrc= new File("../snaps/img.png");
	FileHandler.copy(firstsrc, destsrc);
	driver.quit();
	}

}
