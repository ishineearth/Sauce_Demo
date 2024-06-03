package PageObject;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class LoginPageObject {
		WebDriver driver ;
		@FindBy(css="input[id='user-name']")
		public WebElement userNameField;
		@FindBy(css="input[id='password']")
		public WebElement passwordField;
		@FindBy(css="input[id='login-button']")
		public WebElement loginButton;

		public LoginPageObject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void enterUserName(String username) {
			if(userNameField.isDisplayed()) {
				userNameField.click();
				userNameField.sendKeys(username);
			}
	
		}
		public void enterPassword(String password) {
			if(passwordField.isDisplayed()) {
				passwordField.click();
				passwordField.sendKeys(password);
			}
		}
		public void clickOnLoginButton() {
			if(loginButton.isDisplayed()) {
				loginButton.click();
			}
		}
		public String getPropertyData(String data) throws IOException {
			FileInputStream file = new FileInputStream("Data.properties");
			Properties property = new Properties();
			property.load(file);
			String dataValue = property.getProperty("data");
			return data;

		}
	}

}
