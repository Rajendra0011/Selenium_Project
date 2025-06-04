package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_Close_quite_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		String titel = driver.getTitle();
		System.out.println("title of the webpage: "+titel);
		
		driver.quit();
//		driver.close();
		
		
	}

}
