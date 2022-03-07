package frm.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@placeholder='Search products & brands']"));
		search.sendKeys("hp laptops"+Keys.ENTER);Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='product-title ']"));
		for (WebElement e : elements) {
			System.out.println(e.getText());
		}
	}

}
