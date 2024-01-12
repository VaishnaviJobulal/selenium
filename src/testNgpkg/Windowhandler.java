package testNgpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	
	}
	
	@Test
	public void test() {
		driver.get("https://demo.guru99.com/popup.php");
		String Parentwindow= driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindowhandles=driver.getWindowHandles();
		
		for(String handle :allwindowhandles ) {
			if(!handle.equalsIgnoreCase(Parentwindow)) {
				driver.switchTo().window(handle);
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).getText();
				driver.close();
				}
			driver.switchTo().window(Parentwindow);
		}
		
		
		
	}

}
