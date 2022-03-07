import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement> table_row=driver.findElements(By.xpath("//tr"));
		System.out.println("No_of_Row="+table_row.size());
		List<WebElement> coloum=driver.findElements(By.xpath("//th"));
		System.out.println("No_of_coloum="+coloum.size());
		
		for(WebElement head:coloum)
		{
		System.out.println(head.getText());	
		}
		
		List<WebElement> data=driver.findElements(By.xpath("//td"));
		System.out.println("Total_no_of_Data="+data.size());
		for(WebElement d:data)
		{
		System.out.println(d.getText());
		
		}
		
		List<WebElement> chechbox=driver.findElements(By.xpath("//tr//td[3]//input"));
		
		for(WebElement c:chechbox)
		{
		c.click();
		
		}
		driver.findElement(By.xpath("//tr[3]//td[3]//input")).click();
		
	}

}
