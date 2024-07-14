package root;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class app {

	@Test
	public void showmessage() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

	}
	
	
	// Learn the Annotations
	// https://testng.org/annotations.html
	

	// Run this method before all test
	@BeforeMethod
	void loginScreen() {
		System.out.println("Login Screen");
	}
	
	
	// Run this method After all test
	@AfterMethod
	void quitScreen() {
		System.out.println("Quit Screen");
	}
	
	
	
	
	// Here run the sequece by the Method name alphabet 
	
	@Test(priority = 1)
	
	public void name() {
//		driver.get("google.com");
//		int a = 5;
//		int b = 6;
//		
//		int actualResult = a+b;
//		
//		int expectedResult = 11;
//		
//		// Use to match similarities 
//		Assert.assertEquals(actualResult, expectedResult);
	
		System.out.println("Test");
		
	}

}
