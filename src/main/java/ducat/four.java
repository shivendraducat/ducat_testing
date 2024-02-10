package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class four {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		
		driver.manage().getCookieNamed("hello");
		driver.manage().deleteAllCookies();
		
		WebElement a= driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div"));
	    System.out.println(a.getTagName());
	    
	    
	    WebElement b = driver.findElement(By.xpath("//*[@id=\"col2_BmzApPwtUtRGyZ0BtyDHU\"]/div/div/div/div[2]/div[2]/div/div/div[2]/div[9]/div[2]/div/h3/span[2]"));
	    System.out.println(b.getText());
	    
	
	}

}
