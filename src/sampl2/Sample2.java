package sampl2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		// 1.BROWSER CONFIGURATION
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");

				// 2.WEBDRIVER INSTANCIATION
				WebDriver driver = new ChromeDriver();

				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				Actions a = new Actions(driver);
				WebElement element = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
				element.sendKeys("Smart Tvs"+Keys.ENTER);
				Thread.sleep(3000);
				WebElement element1 = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]"));
				a.moveToElement(element1).perform();
				element1.click();
				System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//				Thread.sleep(3000);
//				WebElement element2 = driver.findElement(By.xpath("(//*[text()='Air Conditioners'])[1]"));
//				a.moveToElement(element2).perform();
//				Thread.sleep(3000);
//				WebElement element3 = driver.findElement(By.xpath("//*[text()='Portable Air Conditioners']"));
//				element3.click();
				
				
				

	}

}
