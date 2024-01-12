package junitpgm;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.Facebook.com";
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get(baseurl);
		}
	@org.junit.Test
	public void test() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("df123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
