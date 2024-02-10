package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class third {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		
		// hover example
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]"));
		action.moveToElement(ele).perform();
		
		WebElement b= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/a/div[1]/div/img"));
		action.moveToElement(b).perform();

	}

}
