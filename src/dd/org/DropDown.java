package dd.org;

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
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Paul03696");
		driver.findElement(By.id("password")).sendKeys("03696MJp@ul");;
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
//		WebElement element1 = driver.findElement(By.name("location"));
//		Select s1=new Select(element1);
//		List<WebElement> options = s1.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getAttribute("value"));
//		}
//		s1.selectByVisibleText("London");
//		WebElement element2 = driver.findElement(By.name("hotels"));
//		Select s2=new Select(element2);
//		s2.selectByIndex(4);
//		WebElement element3 = driver.findElement(By.name("room_type"));
//		Select s3=new Select(element3);
//		List<WebElement> options = s3.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getAttribute("value"));
//		}
		
//		WebElement element4 = driver.findElement(By.name("room_nos"));
//		Select s4=new Select(element4);
//		s4.selectByVisibleText("6 - Six");
		WebElement element5 = driver.findElement(By.id("adult_room"));
		Select s5=new Select(element5);
		List<WebElement> options = s5.getOptions();
		int i = options.size();System.out.println("number of options:"+i);
//		driver.findElement(By.id("Submit")).click();Thread.sleep(2000);
//		driver.findElement(By.id("radiobutton_0")).click();
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("first_name")).sendKeys("paul");
//		driver.findElement(By.id("last_name")).sendKeys("vasanth");
//		driver.findElement(By.id("address")).sendKeys("Chennai,Tamil nadu");
//		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
//		WebElement element6 = driver.findElement(By.id("cc_type"));
//		Select s6=new Select(element6);
//		s6.selectByVisibleText("Master Card");
//		WebElement element7 = driver.findElement(By.id("cc_exp_month"));
//		Select s7=new Select(element7);
//		s7.selectByVisibleText("June");
//		WebElement element8 = driver.findElement(By.id("cc_exp_year"));
//		Select s8=new Select(element8);
//		s8.selectByVisibleText("2022");
//		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
//		driver.findElement(By.id("book_now")).click();
//		Thread.sleep(3000);
////		driver.findElement(By.id("my_itinerary")).click();
//		WebElement ordr = driver.findElement(By.xpath("(//*[@class='disable_text'])[15]"));
//		System.out.println(ordr.getAttribute("value"));
//		List<WebElement> options = s.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getAttribute("value"));
//		}
//		
		
		
//		int i=1;
//		for (WebElement e : options) {
//			if (i%2==0) {
//				System.out.println(i+"-"+e.getText());
//			}
//			i++;
//		}

}}
