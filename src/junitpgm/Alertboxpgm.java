package junitpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxpgm {
	ChromeDriver driver= new ChromeDriver();
	 String baseurl="file:///E:/USERS/HP/Desktop/alert_eg.html";
	 
	 @Before
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.get(baseurl);
	 }
	 @Test
	 public void alerttest() {
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 Alert a =driver.switchTo().alert();
		 String alerttext=a.getText();
		 if(alerttext.equals("Hello! I am an alert box!!"))
		 {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		 a.accept();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vaishnavi");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("T J");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 }
	

}
