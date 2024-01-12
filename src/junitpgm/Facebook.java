package junitpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	String baseurl="https://www.Facebook.com";
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc12");
		driver.findElement(By.name("login")).click();
		
	}
     
}
