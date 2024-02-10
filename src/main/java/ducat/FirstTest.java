package ducat;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FirstTest {
	
	@Test(groups= {"login"})
	public void hello() {
		System.out.println("hello method");
	}
	
	@Test(groups= {"login"})
	@Parameters({"val1","val2"})
	public void abc(int a,int b) {
		System.out.println("abc method "+(a+b));
	}
	
	@Test(groups= {"sign"})
	public void karan() {
		System.out.println("karan method");
	}

}
