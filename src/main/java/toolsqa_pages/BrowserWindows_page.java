package toolsqa_pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BrowserWindows_page  extends Base{
	
	public BrowserWindows_page() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	private WebElement Alertbtn;
	
	@FindBy(xpath="//span[text()='Browser Windows']")
	private WebElement Browserbtn;
	
	
	@FindBy(xpath="//button[text()='New Tab']")
	private WebElement Newtabbtn;
	
	@FindBy(xpath="//button[text()='New Window']")
	private WebElement Newwindowbtn;
	
	@FindBy(xpath="//button[text()='New Window Message']")
	private WebElement WindowMessage;
	
	@FindBy(xpath="//h1[@id='sampleHeading']")
	private WebElement NewwindowMessage;
	
	@FindBy(xpath="//*[contains(text(),'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.')]")
	private WebElement Messagebtn;
	
	public void ClickOnAlert() {
		
		Alertbtn.click();
		Browserbtn.click();
	}
	public void ClickOnNewTab() {
		
		
		Newtabbtn.click();
		changewindow(1);	
		System.out.println(driver.getCurrentUrl() +" "+ "This is Current page Url");
		driver.close();
		changewindow(0);
		System.out.println(driver.getCurrentUrl() +" "+ " This is old  page Url");
		
	}
	public void ClickOnWindow() throws InterruptedException {
		
		
		
		
		Newwindowbtn.click();
		 changewindow(1);
		 driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl() +" "+ "This is Current page Url");
			System.out.println(NewwindowMessage.getText());
			driver.close();
			
	}
public void ClickOnNewWindow() {
	
	
	WindowMessage.click();
	changewindow(1);
	 driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl() +" "+ "This is Current page Url");
		System.out.println(Messagebtn.getText());
		driver.close();
		
	

//		System.out.println(driver.getCurrentUrl());
//			Set<String> ParentWindow = driver.getWindowHandles();
//		ArrayList<String> arr = new ArrayList(ParentWindow);
//		
////		
//		driver.switchTo().window(arr.get(1));
//		driver.manage().window().maximize();
//		System.out.println(Messagebtn.getText());
		
//		System.out.println(driver.getCurrentUrl() +" "+ "This is Current page Url");
		
//		driver.quit();
//		driver.switchTo().window(arr.get(0));
//		System.out.println(driver.getCurrentUrl() +" "+ " This is OldWindow  page Url");
//	
		
		
}
	}
	

