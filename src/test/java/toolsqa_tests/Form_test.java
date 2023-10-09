package toolsqa_tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.Base;
import toolsqa_pages.Buttons_page;
import toolsqa_pages.Form_page;

public class Form_test extends Base {

	ExtentTest test;
	ExtentReports extent = new ExtentReports();
	Form_page ob;

	@BeforeTest
	public void Setupbrowser() {
		ExtentSparkReporter spark = new ExtentSparkReporter("../ToolsQA/Reports/Form_test.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Form_Test");
		extent.attachReporter(spark);
		driver.get(getreaddata("url"));
		ob = new Form_page();
	}

	@Test(priority = 1)
	public void ClickOnFormBtn() {
		test = extent.createTest("Form").assignAuthor("Ravi").assignCategory("Functional Test").assignDevice("Window");
		ob.ClickOnFormBtn();
	}

	@Test(priority = 2)
	public void FillForm() throws InterruptedException {
		test = extent.createTest("Fill Form").assignAuthor("Ravi").assignCategory("Functional Test")
				.assignDevice("Window");
		ob.FillForm();
	}

	@AfterMethod
	public void getanalysis(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "Test Case Fail", ExtentColor.RED));
			test.fail(MediaEntityBuilder
					.createScreenCaptureFromBase64String(getScreenshot(result.getName()), "Failed Screenshot").build());

		} else if (result.getStatus() == ITestResult.SKIP) {
			test.skip(result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			test.pass(MediaEntityBuilder
					.createScreenCaptureFromBase64String(getScreenshot(result.getName()), "Passed Screenshot").build());
		}

		extent.flush();
		// driver.quit();
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}
}
