package allseleniumTopics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownloadFiles {

	public static void main(String[] args) {
		// upload file 
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get("http://demo.guru99.com/test/upload/ ");
		driver1.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ghadeermoh\\Desktop\\New Text Document (2).txt");
		driver1.findElement(By.id("terms")).click();
		driver1.findElement(By.id("submitbutton")).click();
		*/
		//download file using Wget 
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/yahoo.html");
		
		WebElement download_Btn =driver.findElement(By.id("messenger-download"));
		String Sourceloc =download_Btn.getAttribute("href");
		String wget_cmd ="cmd /c wget-P D: "+Sourceloc;
		
		try {
			Process exec = Runtime.getRuntime().exec(wget_cmd);
			int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
		} catch (IOException | InterruptedException e) {
			System.out.println(e.toString());
			
		}
		

	}

}
