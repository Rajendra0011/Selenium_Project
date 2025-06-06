package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
		String mainPge = driver.getWindowHandle();
		
		System.out.println(mainPge);
		
		Set<String> allWinHandle = driver.getWindowHandles();
		
		ArrayList<String>  ar = new ArrayList<String>(allWinHandle);
		
		System.out.println(allWinHandle.size());
		
		driver.switchTo().window(ar.get(1));
		
		String titel = driver.getTitle();
		
		System.out.println(titel);
		
		driver.quit();
	}

}
