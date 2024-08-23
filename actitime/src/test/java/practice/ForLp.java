package practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ForLp {

	public Logger logger;
	public Properties p;

	@Test(  dataProvider = "dp2" ,dataProviderClass = DataUtis.class )

	public void ff(String user, String desc) throws IOException {

		FileReader file = new FileReader("./src/test/resources/config.properties");
		p = new Properties();
		p.load(file);

		logger = LogManager.getLogger(this.getClass());
		logger.info("###prinitng message#####");

		System.out.println(p.getProperty("email"));
		System.out.println(p.getProperty("pass"));
		
		System.out.println(user);
		System.out.println(desc);

	}
}
