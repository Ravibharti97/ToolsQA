package application_utility;

import org.openqa.selenium.WebElement;

public interface Common_operations {

	
	public void doubleclick(WebElement ele);
	public void Rightclick(WebElement ele);
	public void mousehover(WebElement ele);
	public void selectbyvalue(WebElement ele, String value);
	public void selectbyvisibletext(WebElement ele, String text);
	public void scrollIntoView(WebElement ele);
	public void jsclick(WebElement ele);
	public void jssenddata(WebElement ele);
	public void Frame(WebElement ele);
	public void ExitFrame();
	public void changewindow(int tabno);
	
	
	
}
