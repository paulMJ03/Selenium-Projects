package sample.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args) {
		//1.BROWSER CONFIGURATION
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
	
//2.WEBDRIVER INSTANCIATION
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.xpath("//input[@id='firstName']"));
		frm.sendKeys("paul");
		WebElement to = driver.findElement(By.xpath("//input[@id='lastName']"));
		to.sendKeys("vasanth");
		WebElement uesr = driver.findElement(By.xpath("//input[@id='username']"));
		uesr.sendKeys("vasanthp398");
		WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("vasanthp398#");
		WebElement pass1 = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		pass1.sendKeys("vasanthp398#");
		WebElement pass2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		pass2.click();

	}

}
