package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class second {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		Actions action = new Actions(driver);
		
		WebElement f1 = driver.findElement(By.id("draggable"));
		WebElement t1 = driver.findElement(By.id("droppable"));
		action.dragAndDrop(f1, t1).perform();
		
		String a = t1.getText();
		
		if(a.equals("Dropped!")) {
			System.out.println("drop success");
		}else {
			System.out.println("drop fail");
		}
		
		
	}

}
