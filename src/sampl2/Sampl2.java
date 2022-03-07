package sampl2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampl2 {

	public static void main(String[] args) {
		// 1.BROWSER CONFIGURATION
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");

		// 2.WEBDRIVER INSTANCIATION
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(s, d).perform();
		WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(s1, d1).perform();
		WebElement s2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		WebElement d2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(s2, d2).perform();
		WebElement s3 = driver.findElement(By.xpath(""));
		WebElement d3 = driver.findElement(By.xpath(""));
		a.dragAndDrop(s3, d3).perform();
	}
}