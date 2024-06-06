package Basepckg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	   public static ChromeDriver driver;
		
		String baseurl="https://www.saucedemo.com/v1/index.html";
		
		@BeforeTest
		
		public void setup()
		
		{
			
			driver=new ChromeDriver();
			
			driver.get(baseurl);	
			
			driver.manage().window().maximize();
		
		
	     }

	}


