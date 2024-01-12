package testNgpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Justdial {
	ChromeDriver driver;
	String baseurl="https:www.justdial.com";
	
	@BeforeTest
	public void setup() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("----disable-notification");
	driver=new ChromeDriver(op);

	}
	@Test
	public void test() {
		driver.get(baseurl);
	}
	

}
