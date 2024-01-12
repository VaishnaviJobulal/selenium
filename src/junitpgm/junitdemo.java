package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		String exptitle="Google";
		String actltitle= driver.getTitle();
		
		
	    if(actltitle.equals(exptitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}