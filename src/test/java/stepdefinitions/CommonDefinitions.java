package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.CommonPage;
import pages.HomePage;

public class CommonDefinitions {
	
	@Steps
	HomePage hp;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   
		hp.open();
	}
}
