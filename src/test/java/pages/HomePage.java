package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	By btn_SignIn = By.ByTagName.className("login");
	
	public HomePage(WebDriver driver){
		this.driver= driver;
	}
	public void click_btn_SignIn() {
		driver.findElement(btn_SignIn).click();
	}
	
	
}
