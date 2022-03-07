package sample.org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Sample {
	public static void main(String[] args) {
		
		//1.BROWSER CONFIGURATION
		System.setProperty("webdriver.edge.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\msedgedriver.exe");
	
		//2.WEBDRIVER INSTANCIATION
		WebDriver driver=new EdgeDriver();
		//3.LAUNCH URL
		driver.get("http://demo.automationtesting.in/Register.html");
		//4.TO MAXIMIZE
		driver.manage().window().maximize();
		//5.GET CURRENT URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//6.TITLE OF URL
		String title = driver.getTitle();
		System.out.println(title);

}}