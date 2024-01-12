package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String exptitle="Google";
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(exptitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
