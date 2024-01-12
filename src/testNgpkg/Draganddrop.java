package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	@Test
	public void test() {
		WebElement Dbank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement Damount= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Daccount = driver.findElement(By.xpath("//*[@id=\"credit3\"]/a"));
		WebElement Damount2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Dbank, Damount).perform();
		act.dragAndDrop(Daccount, Damount2).perform();
		
		WebElement Csales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement Camount1 = driver.findElement(By.xpath("//*[@id=\"credit0\"]/a"));
		WebElement Cloan= driver.findElement(By.xpath("//*[@id=\"credit4\"]/a"));
		WebElement Camount3= driver.findElement(By.xpath("//*[@id=\"credit\"]/a"));
		act.dragAndDrop(Cloan, Camount1).perform();
		act.dragAndDrop(Csales, Camount3).perform();
		act.perform();
		
		
	}

}
