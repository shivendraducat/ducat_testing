package ducat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class eight {

	public static void main(String[] args) {
		
		ChromeOptions handlessl = new ChromeOptions();
		handlessl.setAcceptInsecureCerts(false);
		
		WebDriver driver = new ChromeDriver(handlessl);
		
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());

	}

}
