package toolsqa_tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import toolsqa_pages.Links_page;

public class Links_test  extends Base{
	
	
	Links_page link;
	@BeforeTest
	public void Setupbrowser() {
		
		driver.get("https://demoqa.com/");
		link = new Links_page();
	}
	@Test(priority=1)
	public void ClickOnElementsbtn() {
		
		link.ClickOnElementsbtn();
	}

	
	@Test(priority=2)
	public void ClickOnHomeLink() {
		
		link.ClickOnHomeLink();
	}
	@Test(priority=3)
	public void ClickOnDynamicLink() {
		
		link.ClickOnDynamicLink();
	}

}
