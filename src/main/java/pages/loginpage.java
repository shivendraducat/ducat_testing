package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	// all object from login page element
	By user = By.id("user-name");
	By password = By.id("password");
	By Signup = By.id("login-button");
	
	// constructer
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void username(String username) {
		driver.findElement(user).sendKeys(username);
		
	}
	public void password(String passwrd) {
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void signin() {
	driver.findElement(Signup).click();
	}
}
