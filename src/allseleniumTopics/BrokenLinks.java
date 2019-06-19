package allseleniumTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.zlti.com");
		
		List <WebElement> AllLinks=driver.findElements(By.tagName("a"));
		Iterator<WebElement> iter =AllLinks.iterator();
		while (iter.hasNext()) {
			String link =iter.next().getAttribute("href");
			System.out.println(link);
			//check if link is empty 
			if (link.equals(null)|| link.isEmpty()) {
				System.out.println("this link is empty" +link);
				
			}
			
			//check if link belong to speific domain 
			if(!link.startsWith("http://www.zlti.com")) {
				System.out.println("link not configured to specific anchor");
			}
			//
			try {
				HttpURLConnection hu =(HttpURLConnection)(new URL(link).openConnection());
				hu.setRequestMethod("HEAD");
				hu.connect();
				int resp=hu.getResponseCode();
				if(resp >=400) {
					System.out.println("broken link ");
				}
				else 
				{
					System.out.println("valid link");
				}
			} catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}*/
		
		/*=============================another example===============================================
		===========================================================================*/
		System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get("http://demo.guru99.com/test/newtours/");
		
		List <WebElement > Links = Driver.findElements(By.tagName("a"));
		//type all links texts and check if link is working or under constructions
		for (int i =1;i< Links.size() ;i++) {
			WebElement LinkText =Links.get(i);
			String TextofLink =LinkText.getText();
			//System.out.println(TextofLink);
			
			if (TextofLink.equals("Under Construction: Mercury Tours")) {
				System.out.println("\"" + TextofLink + "\""								
                        + " is under construction.");
			}
			else {
				System.out.println("\"" + TextofLink + "\""								
                        + " is under construction.");
			}
		}
		
		//
		
		
		
		

	}

}
