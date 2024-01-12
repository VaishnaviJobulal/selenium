package testNgpkg;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
	ChromeDriver driver= new ChromeDriver();
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test() {
		String exptitle="Google";
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	Assert.assertEquals(actualtitle, exptitle);
}

}
