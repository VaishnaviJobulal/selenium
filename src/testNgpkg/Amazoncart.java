package testNgpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

  public class Amazoncart {
	ChromeDriver driver;
	

	@BeforeTest
	public void config() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@Test
	public void windowHandels() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones", Keys.ENTER);
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"))
				.click();

		Set<String> window = driver.getWindowHandles();
		for (String handle : window) {

			if (!handle.equalsIgnoreCase(parent)) {

				driver.switchTo().window(handle);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,300)");
				
				Thread.sleep(2000);
				
				
				driver.findElement(By.id("add-to-cart-button")).click();
				Thread.sleep(2000);
				String text = driver.findElement(By.id("add-to-cart-button")).getAttribute("title");
				System.out.println(text);
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				Thread.sleep(2000);

//				driver.findElement(By.xpath("//div/span[@class='nav-cart-icon nav-sprite'] ")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
//				Thread.sleep(2000);
//				String item=driver.findElement(By.xpath("//*[@id=\"sc-active-32dda389-53fe-4af2-a82d-5674ce757b4d\"]/div[4]/div/div[2]/ul/li/span/a/span[1]/span/span[2]")).getText();
//				Thread.sleep(1000);	
				if (title.contains("Samsung Galaxy M14 5G")) {
					System.out.println("pass");
				} else {
					System.out.println("fail");
				}

			}

			// driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();

			driver.switchTo().window(parent);

		}

	}

}


