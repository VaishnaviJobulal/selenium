package junitpgm;


	import java.util.List;
    import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
	
    public class Linkcounts {
	
		ChromeDriver driver;
		String baseurl="https://www.Facebook.com";
		
		@Before
		public void setup() {
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void test() {
			List<WebElement>Linkdetails=driver.findElements(By.tagName("a"));
			System.out.println("total no of links="+Linkdetails.size());
			
    
		for(WebElement element : Linkdetails) 
		{
			String link=element.getAttribute("href");
			String linktext=element.getText();
			System.out.println(link+"---------"+linktext);
		}

}
    }	
