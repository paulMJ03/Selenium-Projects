package js.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//*[@title='Login using User ID and password'])[2]"));
		element.click();Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
//		element.sendKeys("paul123");
		
		driver.findElement(By.xpath("(//*[@title='Log In'])[1]")).click();Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@name='fldPassword']")).sendKeys("paul1234");
		Alert a=driver.switchTo().alert();
		String t=a.getText();
		System.out.println(t);Thread.sleep(2000);
		a.accept();
		

	}

}
