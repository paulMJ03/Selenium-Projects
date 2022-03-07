package win.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String fstWindw = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X"+Keys.ENTER);
		
		WebElement search = driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 11 Pro, 256GB, Midnight Green')]"));
		Actions a=new Actions(driver);
		a.moveToElement(search);
		a.contextClick().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(2000);
		
		Set<String> allWindw = driver.getWindowHandles();
		for (String eachWindw : allWindw) {
			if (!eachWindw.equals(fstWindw)) {
				driver.switchTo().window(eachWindw);
			}
		}
		WebElement element = driver.findElement(By.xpath("(//*[text()='$649.00'])[2]"));
		System.out.println(element.getText());
//		Thread.sleep(2000);
//		driver.close();
	}

}
