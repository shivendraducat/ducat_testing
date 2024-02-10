package ducat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FourthTest {
	public WebDriver driver;
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.get("https://ducatindia.com");
	}
	@Test
	public void title() {
		String expectedtile ="Top Institute for IT Training Courses in Noida – DUCAT";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(expectedtile,actualTitle);
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
