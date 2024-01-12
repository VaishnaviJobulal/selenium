package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	 @FindBy(name= "login")
	 WebElement loginbutton;
	
	@FindBy(name= "email")
	 WebElement emailfield;
	 
	 @FindBy(name= "pass")
	 WebElement pswd;
	 
	 
	 public Fbloginpage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void setvalues(String email,String password) {
		 emailfield.sendKeys(email);
		pswd.sendKeys(password);
	 }
	 public void login() {
		 loginbutton.click();
	 }

}
