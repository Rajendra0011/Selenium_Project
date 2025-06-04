package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1_getMethod {
	
	//WebDriver : WebDriver is an interface used to perform actions on Browser
	
	public static void main(String  args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
//		get() : method is used to enter URL in browser
		
		driver.get("https://www.selenium.com");
		
//		driver.manage().window().maximize();
	}

}
