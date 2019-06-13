package allseleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioBtn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		WebElement chkbox1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		chkbox1.click();
		if (chkbox1.isSelected()) {
			System.out.println("done");
		}
		
	}

}
