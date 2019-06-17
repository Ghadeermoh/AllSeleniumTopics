package allseleniumTopics;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DownloadFileChromeAndFx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		String DownloadFilePath="D:\\FileDownload";
		HashMap <String ,Object> chromepref =new HashMap <String ,Object>();
		chromepref.put("profile.default_content_settings.popups", 0); //close download pop-ups 
		chromepref.put("download.default_directory", DownloadFilePath);
		
		ChromeOptions op=new ChromeOptions();
		op.setExperimentalOption("prefs",chromepref);
		WebDriver Driver =new ChromeDriver(op);
		Driver.get("http://the-internet.herokuapp.com/download");
		Driver.findElement(By.xpath("//a[contains(text(),'path.txt')]")).click();
		Thread.sleep(5000);
		Driver.close();
		
		
		//firefox 
		System.setProperty("webdriver.gecko.driver","D:\\program file\\selenium programs/geckodriver.exe");  //give location of the driver we already downloaded 
		FirefoxOptions fxop =new FirefoxOptions();
		HashMap <String ,Object> fxpref =new HashMap<String ,Object>();
		//fxpref.put(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
	}

}
