package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.Base;
import toolsqa_pages.Radiobutton_page;

public class Radiobutton_test extends Base {

	Radiobutton_page Radio;

	ExtentTest test;
	ExtentReports extent = new ExtentReports();

//	ExtentSparkReporter spark = new ExtentSparkReporter("/home/ravi/eclipse-workspace/ToolsQA/Reports/Radiobutton_test.html");
	@BeforeTest
	public void Setupbrowser() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"/home/ravi/eclipse-workspace/ToolsQA/Reports/Radiobutton_test.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Radiobutton_test");
		extent.attachReporter(spark);
		driver.get(getreaddata("url"));
		Radio = new Radiobutton_page();
	}

	@Test(priority = 1)
	public void ClickonRadiobtn() {
		test = extent.createTest("Fill Form").assignAuthor("Ravi").assignCategory("Functional Test")
				.assignDevice("Window");
		Radio.ClickonRadiobtn();
	}
}