package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logopgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() {
		boolean logo =driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo) {
			System.out.println("displayed");
		}
		else {
			System.out.println("not displayed");
		}
	}
	
	
}
