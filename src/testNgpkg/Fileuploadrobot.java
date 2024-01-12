package testNgpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf/";
	
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	@Test
	public void fileuploadpgm()throws Exception {
		driver.get("https://www.ilovepdf.com/word_to_pdf/");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("E:\\USERS\\HP\\Documents\\objective for resume.docx");
	}
	public void fileupload(String p)throws AWTException {
		StringSelection strSelection= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
		
		
		
		
		
	}


