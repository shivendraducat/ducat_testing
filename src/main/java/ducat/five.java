package ducat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class five {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/SHIVENDRA/Desktop/table.html");
		
//		WebElement a= driver.findElement(By.xpath("/html/body/table"));
//		System.out.println(a.getText());
//		
//		WebElement b = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]"));
//		System.out.println(b.getText());
		
		List<WebElement> ele = driver.findElements(By.xpath("/html/body/table"));
		
		for(WebElement i:ele) {
			System.out.println(i.getText());
		}

	}

}
