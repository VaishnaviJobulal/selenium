package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/";
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.getCurrentUrl();
	}
	@Test(priority = 2)
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("vaishnavitj2001@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vaishnavitj123");
		
		 
		 WebElement dayelement= driver.findElement(By.xpath("//*[@id=\"days\"]"));
			Select day =new Select(dayelement);
			day.selectByValue("12");
			
			WebElement monthelement= driver.findElement(By.xpath("//*[@id=\"months\"]"));
			Select month = new Select(monthelement);
			month.selectByValue("5");
			
			WebElement yearelement= driver.findElement(By.xpath("//*[@id=\"years\"]"));
			Select year=new Select(yearelement);
			year.selectByValue("2001");
			
			driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Vaishnavi");
			driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Jobulal");
			driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("thhouse");
			
			WebElement countryelement=driver.findElement(By.xpath("//*[@id=\"country\"]"));
			Select country =new Select(countryelement);
			country.selectByValue("India");
			driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
			
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("aluva");
			driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("683102");
			driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9895401752");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			
			
	}
			@Test(priority = 1)
			public void test1() {
			
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("vaishnavitj2001@gmail.com");
			    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Vaishnavitj123");
			    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")).click();
			    if(driver.getCurrentUrl().equalsIgnoreCase("https://automationexercise.com")) {
			    	System.out.println("pass");
			    }
			    else {
			    	System.out.println("fail");
			    }
			
			}

			
			
			
			
		
	}


