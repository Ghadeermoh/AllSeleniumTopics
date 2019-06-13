package allseleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select sel =new Select(driver.findElement(By.name("country")));
		sel.selectByVisibleText("ARUBA");*/
		
		//multiple selection at a time 
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get(" http://jsbin.com/osebed/2");
		Select sel1 =new Select (driver1.findElement(By.id("fruits")));
		sel1.selectByVisibleText("Banana");
		sel1.selectByIndex(2);
		

	}

}
