package drp.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement drpDwn1 = driver.findElement(By.id("dropdown1"));
		
		Select select=new Select(drpDwn1);
		select.selectByIndex(4);Thread.sleep(2000);
		select.selectByValue("2");Thread.sleep(2000);
		select.selectByVisibleText("Selenium");
		
		
		List<WebElement> options = select.getOptions();
		String string = options.toString();
		System.out.println(string);
		int size = options.size();
		System.out.println("NUMBR OF OPTIONS:"+size);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		element.sendKeys("UFT/QTP");
		
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectBox=new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
	}

}
