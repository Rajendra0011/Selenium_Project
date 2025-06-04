package webDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_All_methods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Automations Skills\\Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		String titel = driver.getTitle();
		System.out.println("title of the webpage : " + titel);
		
		String curentURL = driver.getCurrentUrl();
		System.out.println("URL of the webpage : " + curentURL);
		
		Dimension p = new Dimension(1200, 915);
		driver.manage().window().setSize(p);
		Point p1= new Point(250, 150);
		driver.manage().window().setPosition(p1);
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		
		
		
		driver.quit();
		
		 
	}

}
