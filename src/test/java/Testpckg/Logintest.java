package Testpckg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Basepckg.Baseclass;
import Pagepckg.Loginpage;
import Utilities.Excelutils;

public class Logintest extends Baseclass{
	
	@Test(priority=1)
	 
	public void login() throws Exception

	{
		
		Loginpage p1=new Loginpage(driver);
		
		String xl="E:\\Book3.xlsx";
		
		String Sheet="Sheet1";
		
		int rowCount=Excelutils.getRowCount(xl, Sheet);
		
		for(int i=1; i<=rowCount; i++)
			
		{
			
			
			String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
			
			System.out.println("username:"+UserName);
			
			String pwd=Excelutils.getCellValue(xl, Sheet, i, 1);
			
			System.out.println("password:"+pwd);
			
			p1.setValues(UserName, pwd);
			
			p1.loginclick();
				
		}
		
	}
	
	
	@Test(priority=2)

	public void addtocart() throws Exception

	{
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[4]/div[3]/button")).click();
			
	}
	
	@Test(priority=3)

	public void cart() throws Exception

	{
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span")).click();	
		
	}
	
	@Test(priority=4)

	public void checkout() throws Exception

	{
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();
		
	}
	
	@Test(priority=5)

	public void checkoutinformaton() throws Exception

	{
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[1]")).sendKeys("Anu");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[2]")).sendKeys("Suresh");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[3]")).sendKeys("596101");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();
		
	}
	
	@Test(priority=6)
	
	public void finish() throws Exception
	
	{
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
		
	}
	
  @Test(priority=7)
	
	public void hamberg() throws Exception
	
	{
	
	  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button")).click(); 
	
	}
  
  @Test(priority=8)
	
	public void logout() throws Exception
	
	{
	
	  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div[1]/nav/a[3]")).click(); 
	
	}
	

}
