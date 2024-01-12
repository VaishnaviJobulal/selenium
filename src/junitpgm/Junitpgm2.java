package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm2 {
	ChromeDriver driver;
	String baseurl="https://www.google.com";

	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		String src=driver.getPageSource();
		if(src.contains("Gmail")) {
			System.out.println("text is present");
		}
		else {
			System.out.println("text is not present");
		}
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
