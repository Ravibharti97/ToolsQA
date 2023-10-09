package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Alearts_page;

public class Alearts_test extends Base {

	Alearts_page alert;

	@BeforeTest
	public void Setupbrowser() {

		driver.get("https://demoqa.com/");
		alert = new Alearts_page();
	}

	@Test(priority = 1)
	public void ClickOnAlert() {

		alert.ClickOnAlert();
	}

	@Test(priority = 2)
	public void ClickOnSeealert() {

		alert.ClickOnSeealert();

	}

	@Test(priority = 3)
	public void ClickOnConfirmalert() {

		alert.ClickOnConfirmalert();

	}

}
