package ducat;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nine {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1-chrome , 2-firefox, 3-Edge:");
		int a = sc.nextInt();
		
		if(a==1) {
		    driver = new ChromeDriver();
		}
		else if(a==2) {
			driver = new FirefoxDriver();
		}
		else if(a==3) {
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		
		driver.navigate().to(driver.getCurrentUrl());

	}

}
