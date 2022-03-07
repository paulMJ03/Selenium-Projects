package js.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecuter1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement pgdwn = driver.findElement(By.xpath("//*[@alt='green technology']"));
		js.executeScript("arguments[0].scrollIntoView(true)",pgdwn);
		WebElement pgup = driver.findElement(By.xpath("//*[contains(text(),'Framework Test Papers')]"));
		js.executeScript("arguments[0].scrollIntoView(false)", pgup);Thread.sleep(3000);
		String text = pgup.getText();
		System.out.println(text);
	
	}

}
