package allseleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {
	
	public static String  URL="http://demo.guru99.com/test/social-icon.html";
	public static String URL1="http://demo.guru99.com/test/tooltip.html";
	public static String ExpecttedToolTip ="Github";

	public static void main(String[] args) {
		
		//tool tips (when a mouse hovers over an element a text or image is shown
		//method 1-HTML title Attribute 
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(URL);
		WebElement GithubIcon=driver.findElement(By.xpath("//a[@class='github']"));
		String ActualToolTip=GithubIcon.getAttribute("title");
		if(ActualToolTip.equals(ExpecttedToolTip)) {
			System.out.println("Test Pass ");
		}
		else 
			System.out.println("Test fail");
		    System.out.println(ActualToolTip);
		
		//method 2-Jquery plugin 
		    System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1 =new ChromeDriver();
			driver1.get(URL1);
			Actions act =new Actions (driver1);
			act.moveToElement(driver1.findElement(By.id("download_now"))).build().perform();
			
			driver1.findElement(By.linkText("What's new in 3.2")).click();
			
	}

}
