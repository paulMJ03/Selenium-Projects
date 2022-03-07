package task.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampl2 {

	public static void main(String[] args) {
		//1.BROWSER CONFIGURATION
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
			
		//2.WEBDRIVER INSTANCIATION
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				WebElement bm = driver.findElement(By.xpath("//input[@name='email']"));
				bm.sendKeys("paul123@mail.com");
				String text = bm.getText();
				System.out.println(text);
				WebElement bm1 = driver.findElement(By.xpath("//input[@name='pass']"));
				bm1.sendKeys("paul123");
				String attribute = bm1.getAttribute("name");
				System.out.println(attribute);
				
				
				
			
	}

}
