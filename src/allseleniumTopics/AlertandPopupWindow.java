package allseleniumTopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandPopupWindow {

	public static void main(String[] args) {
		// handle Alert messages 
		/*driver.switchTo().alert().dismiss();  //cancel 
		driver.switchTo().alert().accept();   //ok 
		driver.switchTo().alert().getText();  //get text of alert*/
		//*********************************************
		/*System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1123");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.switchTo().alert().accept();
		String alert_text =driver.switchTo().alert().getText();
		System.out.println(alert_text);
		driver.switchTo().alert().dismiss();*/
		
		//*********************************
		//handle pop-up windows 
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get("http://demo.guru99.com/popup.php ");
		driver1.findElement(By.linkText("Click Here")).click();
		
		Set <String> handl = driver1.getWindowHandles();
		Iterator <String> iter =handl.iterator();
		String Parent_window_ID =iter.next();
		String Child_window_ID =iter.next();
		driver1.switchTo().window(Child_window_ID);
		driver1.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ghadeer@yahoo.com");
        driver1.close();
        driver1.switchTo().window(Parent_window_ID);
        
	}

}
