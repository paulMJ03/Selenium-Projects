package win.org;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class WinHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
//		WebElement srch = driver.findElement(By.xpath("//*[@placeholder='Search for products, brands and more']"));
//		srch.sendKeys("hp laptop"+Keys.ENTER);Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Framework Test Papers')]"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("(//*[@title='Test papers training in chennai'])[28]"));
		element1.click();
		String parWindw = driver.getWindowHandle();
		Set<String> allWindw = driver.getWindowHandles();
		for (String eachWindw : allWindw) {
			if (!eachWindw.equals(parWindw)) {
				driver.switchTo().window(eachWindw);
			}
		}
//		Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[text()='add to cart']")).click();
	Thread.sleep(2000);
	WebElement price = driver.findElement(By.xpath("//*[contains(text(),'QUESTION 1')]"));
	System.out.println(price.getText());
	String string = price.toString();
	System.out.println(string.substring(2, 5));
	
	
	}

}
