package practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListeners implements ITestListener{
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test ;
	
	public void onStart(ITestContext context) {
		sparkreporter= new ExtentSparkReporter("./reports/report.html");
		sparkreporter.config().setDocumentTitle("automation report");
		sparkreporter.config().setReportName("functional testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Testername", "vignesh");
		extent.setSystemInfo("browser", "chrome");
	  }
	
	 public void onTestSuccess(ITestResult result) {
		   test=extent.createTest(result.getName());
		   
		   test.log(Status.PASS,"Test passed is "+result.getName());
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.FAIL, "Test failed is"+result.getName());
		  }
	 public void onFinish(ITestContext context) {
		    extent.flush();
		  }
	


}
