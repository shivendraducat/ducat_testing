package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class first {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		// maximise browser window
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		// double click
//		WebElement btn = driver.findElement(By.id("doubleClickBtn"));
//		action.doubleClick(btn).perform();
		
		// right click
		WebElement btn1 = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(btn1).perform();
		
	}

}
