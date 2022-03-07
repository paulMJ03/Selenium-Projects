package sample.org;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample1 {

	public static void main(String[] args) {
		//1.BROWSER CONFIGURATION
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
			
		//2.WEBDRIVER INSTANCIATION
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.redbus.in/");
				driver.manage().window().maximize();
				WebElement signin = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
				signin.click();
				WebElement signin1 = driver.findElement(By.xpath("//li[@id='signInLink']"));
				signin1.click();
//				WebElement signin3 = driver.findElement(By.xpath("//body[@style='overflow-y: hidden;']"));
//				signin3.click();
				
				
				WebElement signin2 = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
				signin2.click();
				signin2.sendKeys("9952831675");
//				WebElement signin3 = driver.findElement(By.xpath("//iframe[@src='https://www.google.com/recaptcha/api2/anchor?ar=1&k=6Lclx6UZAAAAAAJPzjIzuni5BEHrRGUzU9Rz87HS&co=aHR0cHM6Ly93d3cucmVkYnVzLmluOjQ0Mw..&hl=en&v=rPvs0Nyx3sANE-ZHUN-0nM85&size=normal&cb=ce9crgcstqji']"));
//				signin3.click();
				
				
		
	}

}
