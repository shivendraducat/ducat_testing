package TestCases;
import pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	@Test
	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		// create a loginpage object
		loginpage l = new loginpage(driver);
		
	
		l.username("standard_user");
		l.password("secret_sauce");
		l.signin();
		driver.quit();
		l.username("standard_user");
		l.password("secret_sauce");
		l.signin();
	}
}
