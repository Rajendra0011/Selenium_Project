package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_sendKeys_Methods {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
//		driver.findElement(By.id("email")).sendKeys("karhaleraju@gmail.com");
		
//		alternate way of sendKeys method JavaScriptExecutor interface
		
		WebElement emailId = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
//===============================================================================================================		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='karhaleraju@gmail.com'; arguments[1].value='karhaleraju';", 
//				emailId,password);
//===============================================================================================================		
//		2) Using Actions Class	
		Actions ac = new Actions(driver);
		ac.sendKeys(emailId, "karhaleraju@gmail.com").perform();
		ac.sendKeys(password, "karhaleraju@gmail.com").perform();
		
//     3) Using Robot Class	
		
		Thread.sleep(5000);
		driver.quit();
	}

}
