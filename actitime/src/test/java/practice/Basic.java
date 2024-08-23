package practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Basic {
	
	public Logger logger;
	@Test
	
	
	public void demo() {
		logger=LogManager.getLogger(this.getClass());
		logger.info("Started program");
		
		
		int num=1234;
		int count=0;
		
		while(num>0) {
			
			num=num/10;
			count++;
		}
		
		System.out.println(count);
		logger.info("program ended");
	}

}
