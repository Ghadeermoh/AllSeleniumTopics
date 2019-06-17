package allseleniumTopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// xpath example for table 
		//(//table/tbody/tr[2]/td[1])****siblings 
		/*-----------------------------------------------*/
		//dynamic web table 
		/*System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("ghadeermoh");
		 driver.findElement(By.name("password")).sendKeys("Ghadeer25");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 driver.switchTo().frame("mainpanel");
		 driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		//for static table we can select the check box of one element in the table like that
		//driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[6]/td[1]/input")).click();
		//for dynamic table we can use one of the following two methods 
		//1-for loop method (count number of columns and rows)
		
		
		//*[@id="vContactsForm"]/table/tbody/tr[3]/td[2]
		//*[@id="vContactsForm"]/table/tbody/tr[11]/td[2]
		
		/*String BeforeXpath ="//*[@id=\"vContactsForm\"]/table/tbody/tr[";
		String AfterXpath="]/td[2]";
		for (int i=4;i<=11;i++)
		{
			String actualxpath =BeforeXpath+i+AfterXpath;
			String Names= driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(Names);
			if (Names.contains("mohamed hamaky")) {
				driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr["+i+"]/td[1]/input")).click(); //to select value in any row
			}
			
	        }

		//2-customize xpath 
		
		//*****************calculate columns and rows 
		List <WebElement> rows =driver.findElements(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr"));
		System.out.println(rows.size());
		
		List <WebElement>columns =driver.findElements(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[3]/td"));
		System.out.println(columns.size());*/

	
	//****************************** Another Example *********************************************
	System.setProperty("webdriver.chrome.driver", "D:\\program file\\selenium programs\\NewChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().deleteAllCookies();
	driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver1.get("http://demo.guru99.com/test/web-table-element.php");
	//number of rows and columns calculation 
	List <WebElement>colNumber= driver1.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	int i =colNumber.size();
	System.out.println(i);
	
	List <WebElement>rowNumber=driver1.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	int j =rowNumber.size();
	System.out.println(j);
	
	//fetch value in particular row and column (3rd row and 2nd col)
	String Value =driver1.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[3]")).getText();
	System.out.println(Value);
	
	//search for value in the table and know col and row , print all values in table
	String BeforeXpath="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
	String MiddleXpath="]/td[";
	String AfterXpath="]";
	for (int x=1 ;x<=j;x++) {
		
		for (int y=1;y<=i;y++) { 
			String CellNames =driver1.findElement(By.xpath(BeforeXpath+x+MiddleXpath+y+AfterXpath)).getText();
			System.out.println(CellNames);
			if(CellNames.contains("IIFL Holdings")) {
				System.out.println("value col number"+x );
				System.out.println("value row number " + y);
			}
		}
	}
	
	}
}

