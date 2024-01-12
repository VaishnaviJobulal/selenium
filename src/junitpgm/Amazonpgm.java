package junitpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
 ChromeDriver driver= new ChromeDriver();
 String baseurl="https://www.amazon.in/";
 
 @Before
 public void setup() {
	 driver=new ChromeDriver();
	 driver.get(baseurl);
 }
 @Test
 public void amazontesr() {
	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
	 driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
	 driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
	 driver.navigate().back();
	 driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	 
 }
}
