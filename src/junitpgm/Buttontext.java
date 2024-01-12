package junitpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontext {
	ChromeDriver driver= new ChromeDriver();
	 String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	 
	 @Before
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.get(baseurl);
	 }
	 @Test
	 public void test() {
		String buttontext= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		 if (buttontext.equals("Check availability")) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
	 }

}
