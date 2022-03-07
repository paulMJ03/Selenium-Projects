package task1.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		element2.sendKeys("fcuk watch"+Keys.ENTER);Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//a[text()='FK0009 Analog Watch  - For Men'])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		a.contextClick(element).perform();
		Robot r=new Robot();
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
