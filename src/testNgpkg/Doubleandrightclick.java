package testNgpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleandrightclick {
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		Actions act=new Actions(driver);
		WebElement right= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		driver.switchTo().alert().accept();
	
		WebElement doubleclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		
		
		
	}

}
