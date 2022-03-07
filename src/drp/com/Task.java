package drp.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		driver.manage().window().maximize();
		WebElement st = driver.findElement(By.id("country"));
		Select select =new Select(st);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("numbr of countries:"+size);
		int i=1;
		for (WebElement e : options) {
			if (i%2==0) {
				System.out.println(i+"-"+e.getText());
			}
			i++;
		}

	}

}
