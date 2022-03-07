package task.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampl1 {

	public static void main(String[] args) {
		//1.BROWSER CONFIGURATION
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
	
//2.WEBDRIVER INSTANCIATION
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement bm = driver.findElement(By.xpath("//*[@id='autocomplete']"));
		bm.sendKeys("G Shock watches"+Keys.ENTER);
		WebElement bm2 = driver.findElement(By.xpath("//*[contains(text(),'Skmei Round Dail Black Plastic Strapmens')]"));
		bm2.click();
		

		
		

	}

}
