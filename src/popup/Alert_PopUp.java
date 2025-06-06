package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Rajendra");
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
//		alt.accept();
//		alt.dismiss();
		
		driver.quit();
	}

}
