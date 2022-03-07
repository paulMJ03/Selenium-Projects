package js.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search.sendKeys("motorola"+Keys.ENTER);
//		WebElement element = driver.findElement(By.xpath("//*[text()='Baby & Kids']"));
//		element.click();
		Thread.sleep(2000);
		
//TAKES SCREENSHOT
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\sample6.png");
		FileHandler.copy(sourceFile,destFile);
		
//		WebElement pgdwn1 = driver.findElement(By.xpath("//*[text()='Online Classroom']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", pgdwn1);
//		String text = pgdwn1.getText();
//		System.out.println(text);
		
		//SCROLL DOWN
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement pgup = driver.findElement(By.xpath("//*[text()='Selenium Certification Training in Chennai']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", pgup);
//		WebElement pgdwn = driver.findElement(By.xpath("//*[@id='heading302']"));
//		js.executeScript("arguments[0].scrollIntoView(false)", pgdwn);
//		pgdwn.click();Thread.sleep(2000);
//		String text = pgdwn.getText();
//		System.out.println(text);

	}

}
