package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;
	
	@DataProvider(name="Auth")
	public static Object[][] credentials(){
		Reporter.log("data provider method");
		return new Object[][] {{"standard_user","secret_sauce"},
			{"standard","secret_sauce"},{"standard_user","secret"}};
	}
	
//	@BeforeTest
//	public void setup() {
//		
//		
//	}
	
	@Test(dataProvider="Auth")
	public void test(String u,String p) {
		driver = new ChromeDriver();
		Reporter.log("open browser");
		driver.get("https://www.saucedemo.com/");
		Reporter.log("open saucedemo website");
		WebElement User = driver.findElement(By.id("user-name"));
		WebElement Paaword = driver.findElement(By.id("password"));
		WebElement Signup = driver.findElement(By.id("login-button"));
		//data
		User.sendKeys(u);
		Paaword.sendKeys(p);
		Signup.click();
		//verify
		String expectedurl = "https://www.saucedemo.com/inventory.html";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(expectedurl,actualurl);
		
		driver.quit();
	}

}
