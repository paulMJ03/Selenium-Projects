package js.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAttribues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		search.click();Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','paul123')", user);
		WebElement pass = driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
		js.executeScript("arguments[0].setAttribute('value','paul@123')", pass);Thread.sleep(2000);
		Object script = js.executeScript("return arguments[0].getAttribute('value')", user);
		Object script1 = js.executeScript("return arguments[0].getAttribute('value')", pass);
		String string = script.toString();
		System.out.println(string);
		String string1 = script1.toString();
		System.out.println(string1);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//*[text()='Login'])[3]"));
		element.click();
		
	}

}
