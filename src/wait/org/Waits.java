package wait.org;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//old method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//Explicit Wait
		//1.Webdriver wait
		WebDriverWait w =new WebDriverWait(driver,10);
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		WebElement frm = driver.findElement(By.id("6567"));
		w1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frm));
		
		//2.Fluent Waits
		FluentWait <WebDriver> f=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMinutes(2)).pollingEvery(Duration.ofSeconds(20)).ignoring(Exception.class);
		f.until(ExpectedConditions.alertIsPresent());
		
		
		
	}

}
