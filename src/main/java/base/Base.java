package base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.io.Files;

import application_utility.Common_operations;
import excel_utility.Excel_utility;
import property_utility.Property_utility;
import screenshot_utility.Screenshot_utility;
import wait_utility.Wait_utility;

public class Base implements Property_utility, Excel_utility, Common_operations, Wait_utility, Screenshot_utility {

	public static WebDriver driver;

	public static String conpath = "/home/ravi/eclipse-workspace/ToolsQA/Config_file/Config_File";

	@Parameters("browser")
	@BeforeSuite
	public void Setupbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else{
			driver = new ChromeDriver();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Override
	public String getreaddata(String key) {

		String value = " ";
		try {

			FileInputStream fis = new FileInputStream(conpath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);

		} catch (Exception e) {
			System.out.println("Issue in getreaddata Method" + e);
		}
		return value;
	}
	@Override
	public String getreaddataexcel(String path, int colno, int rowno) {

		String value = "";
		try {

			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			DataFormatter formatter = new DataFormatter();
			value = formatter.formatCellValue(sheet.getRow(rowno).getCell(colno));

		} catch (Exception e) {
			System.out.println("Issue in Excelreaddata Method" + e);
		}
		return value;
	}

//	@AfterMethod
//	public void getanalysis(ITestResult result)
//	{
//		String Filename = result.getMethod().getMethodName();
//		try {
//			
//		if(result.getStatus()==ITestResult.SUCCESS)
//		{
//			test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
//			test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot(result.getName()), "Passed Screenshot").build());
//		//	getScreenshot("passed", Filename);
//		}
//		else if (result.getStatus()==ITestResult.FAILURE)
//		{
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
//			test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot(result.getName()), "Failed Screenshot").build());
//		//	getScreenshot("failed", Filename);
//		}
//		else if (result.getStatus()==ITestResult.SKIP)
//		{
//			test.skip(result.getName());
//		}
//		} catch (Exception e) {
//			System.out.println("Issue in get analysis method"+e);
//		}
//		extent.flush();
//		driver.quit();
//	
//	}

	@Override
	public void doubleclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	@Override
	public void Rightclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	@Override
	public void mousehover(WebElement ele) {
		driver.quit();
		Actions act = new Actions(driver);
		act.moveToElement(ele);
	}
	@Override
	public void selectbyvalue(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
	@Override
	public void selectbyvisibletext(WebElement ele, String text) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	@Override
	public void elementtobeclickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	@Override
	public void elementtobeselected(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(ele));
	}
	@Override
	public void scrollIntoView(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	@Override
	public void jsclick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	@Override
	public void jssenddata(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='15 Sep 2023';", ele);
	}
	@Override
	public String getScreenshot(String filename) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		String base64code = ts.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot saved successfully");
		return base64code;
	}
	@Override
	public void element(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	@Override
	public void Frame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	@Override
	public void ExitFrame() {
		driver.switchTo().defaultContent();
	}
	@Override
	public void changewindow(int tabno) {
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> li = new ArrayList<String>(set);
		driver.switchTo().window(li.get(tabno));
	}

}
