import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> firstRow = driver.findElements(By.xpath("//tr[2]"));
		for (WebElement frd : firstRow) {
			System.out.println(frd.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> rows = driver.findElements(By.tagName("tr"));
//		System.out.println("No. of Rows:"+rows.size());
//		List<WebElement> col = driver.findElements(By.tagName("th"));
//		System.out.println("No. of Coloumn:"+col.size());
//		
//		for (WebElement headings : col) {
//			System.out.println(headings.getText());
//		}
//		List<WebElement> data = driver.findElements(By.tagName("td"));
//		System.out.println("No.of Data:"+data.size());
//		for (WebElement allData : data) {
//			System.out.println(allData.getText());
//		}
//		List<WebElement> check = driver.findElements(By.xpath("//tr/td[3]/input"));
//		for (WebElement c : check) {
//			c.click();
//		}
//		driver.findElement(By.xpath("//tr[4]/td[3]/input")).click();
	}

}
