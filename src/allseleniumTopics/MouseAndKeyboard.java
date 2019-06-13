package allseleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Actions act =new Actions (driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Hotels')]"))).build().perform();
		*/
		//drag and drop 
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get("http://jqueryui.com/droppable/");
		driver1.switchTo().frame(0);
		Actions act1 =new Actions(driver1);
		act1.dragAndDrop(driver1.findElement(By.id("draggable")), driver1.findElement(By.id("droppable"))).build().perform();

	}

}
