package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.BrowserWindows_page;

public class BrowserWindows_test extends Base {

	BrowserWindows_page browser;

	@BeforeTest
	public void Setupbrowser() {

		driver.get("https://demoqa.com/");
		browser = new BrowserWindows_page();
	}

	@Test(priority = 1)
	public void ClickOnAlert() {

		browser.ClickOnAlert();
	}

	@Test(priority = 2)
	public void ClickOnNewTab() {

		browser.ClickOnNewTab();
	}

	@Test(priority = 3)
	public void ClickOnWindow() throws InterruptedException {

		browser.ClickOnWindow();
	}
//	@Test(priority=4)
//	public void ClickOnNewWindow() {
//		
//		browser.ClickOnNewWindow();
//	}

}
