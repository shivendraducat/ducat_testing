package ducat;

import org.testng.annotations.Test;

public class thirdTest {
	@Test(dependsOnMethods= {"browser"})
	public void signin() {
		System.out.println("sign in");
	}
	
	@Test
	public void browser() {
		System.out.println("open browser");
	}
	@Test(dependsOnMethods= {"signin"})
	public void signout() {
		System.out.println("close browser");
	}

}
