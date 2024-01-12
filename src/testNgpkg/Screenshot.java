package testNgpkg;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	
	@Test
	public void test() throws IOException {
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("D://guru99.png"));
		WebElement ownersequitybutton= driver.findElement(By.xpath("//*[@id=\"credit3\"]/a"));
		File screenshotbutton= ownersequitybutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotbutton, new File("./screenshot/screenshotbutton.png"));
		
	}

}
