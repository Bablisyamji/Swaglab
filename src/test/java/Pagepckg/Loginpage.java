package Pagepckg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
ChromeDriver driver;
	
    @FindBy(xpath="/html/body/div[2]/div[1]/div/div/form/input[1]")  
	
	WebElement user;
	
    @FindBy(xpath="/html/body/div[2]/div[1]/div/div/form/input[2]")
	
	WebElement pass;
    
    @FindBy(xpath="/html/body/div[2]/div[1]/div/div/form/input[3]")
	
	WebElement login;
    
    public Loginpage(ChromeDriver driver)
    
    {
    	
    	this.driver=driver;
    	
    	PageFactory.initElements(driver, this);
    	
    }
    
  public void loginclick()
    
    {
    	
    	login.click();
    }
  
  public void setValues(String email, String pswd)
  
  {
	  
	user.clear();
	  
   	user.sendKeys(email);
   	
   	pass.clear();
   	
    pass.sendKeys(pswd);
  	
   }


}
