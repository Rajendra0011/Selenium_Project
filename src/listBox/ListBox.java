package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
//		Step 1: Identify List box
		
		WebElement listBox = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
//		Step 2: Create of Object Select Class
		
		Select s= new Select(listBox);
//		s.selectByIndex(0);
//		s.selectByValue("25");
//		s.selectByVisibleText("15");
		WebElement option = s.getFirstSelectedOption();
		System.out.println(option.getText());
		boolean multi = s.isMultiple();
		System.out.println(multi);
		List<WebElement> allDates = s.getOptions();
		System.out.println("Size of ListBox :"+allDates.size());
		
		for(WebElement op:allDates) {
			String text = op.getText();
			System.out.println(text);
		}
		
	}

}
