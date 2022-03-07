package sample.org;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) {
		//1.BROWSER CONFIGURATION
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
	
//2.WEBDRIVER INSTANCIATION
		WebDriver driver=new ChromeDriver();
//3.LAUNCH URL
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("//*[text()='Sign In']"));
		signup.click();
		WebElement signup1 = driver.findElement(By.xpath("//*[text()='login']"));
		signup1.click();
		WebElement ph = driver.findElement(By.xpath("//iframe[@id='loginIframe']"));
		ph.sendKeys("9952834675");
//		WebElement nam = driver.findElement(By.xpath("//input[@id='name']"));
//		nam.sendKeys("paul");
//		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
//		mail.sendKeys("paul789@gmail.com");
//		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
//		pass.sendKeys("paul789");
//		WebElement ph1 = driver.findElement(By.xpath("//*[text()='CONTINUE']"));
//		ph1.click();
		
		
	    //driver.close();
		

	}

}
