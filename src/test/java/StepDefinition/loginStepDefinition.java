package StepDefinition;

	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPageObject;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	import pageObject.loginPageObject;

	public class LoginStepDefinition {
		WebDriver driver = null;
		LoginPageObject loginPage;

		@Given("^Open browser and enter (.*) url$")
		public void openUrl(String url) throws IOException {
			driver =  new ChromeDriver();
			driver.manage().window().maximize();
			loginPage = new LoginPageObject(driver);
			String urlToEnter = loginPage.getPropertyData("url");
			System.out.println(urlToEnter);
			driver.get(urlToEnter); 
		}

		@When("^Click on username field and enter (.*) username$") 
		public void enterDataOnUserName(String username) throws IOException {
			loginPage = new LoginPageObject(driver);
			String usernameToEnter = loginPage.getPropertyData("username");
			loginPage.enterUserName(usernameToEnter);
		}

		@When("^Click on password field and enter (.*) password$") 
		public void enterDataOnPassword(String password) throws IOException { 
			loginPage = new LoginPageObject(driver);
			String passwordToEnter = loginPage.getPropertyData("password");
			loginPage.enterPassword(passwordToEnter); }

		@When("^Click on login button$") 
		public void clickLoginButton() {
			loginPage = new LoginPageObject(driver);
			loginPage.clickOnLoginButton(); }

	}

}
