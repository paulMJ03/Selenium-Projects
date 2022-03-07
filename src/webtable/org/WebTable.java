package webtable.org;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> col = driver.findElements(By.tagName("th"));
		int size = col.size();System.out.println("Number of columns:"+size);
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size2 = rows.size();System.out.println("Number of rows:"+size2);
		
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String text = getPercent.getText();
		System.out.println("Percentage is:"+text);
		
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numbrList=new ArrayList<Integer>();
		
		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%", "");
			numbrList.add(Integer.parseInt(individualValue));
			}
		System.out.println("FinalList"+numbrList);
		int smallVal=Collections.min(numbrList);
		System.out.println(smallVal);
		String string1 = Integer.toString(smallVal)+"%";
		
		String finalXpath="//td[normalize-space()="+"\""+string1+"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		WebElement check = driver.findElement(By.xpath(finalXpath));
		check.click();
		
//		//to find the table
//		WebElement table = driver.findElement(By.id("table_id"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		
//		for (int i = 0; i < rows.size(); i++) {
//			WebElement row = rows.get(i);
//			List<WebElement> headings = row.findElements(By.tagName("th"));
//			for (int j = 0; j < headings.size(); j++) {
//				WebElement head = headings.get(j);
//				String text = head.getText();
//				System.out.println(text);
//			}
//			List<WebElement> data = row.findElements(By.id("td"));
//			for (int j = 0; j < data.size(); j++) {
//				WebElement datas = data.get(j);
//				String text1 = datas.getText();
//				System.out.println(text1);
//			}
//		}
//		
		
		
	}
}
