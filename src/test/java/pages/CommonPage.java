package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class CommonPage extends PageObject{
	
	@Step
	public void closeBrowser() {
		
		getDriver().quit(); 
	}

}
