package bbd_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class senario_1
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qatechhub.com");
		//maximize the browser window
		driver.manage().window().maximize();
		// print the title of the page	
		System.out.println("Page title is : " + driver.getTitle()); 
	      //print the current URL 
		String strUrl = driver.getCurrentUrl();
	      System.out.println("Current Url is:"+ strUrl);
	      // navigate to facebook page
	      driver.navigate().to("https://www.facebook.com");
	      //navigate back to
	      driver.navigate().back();  
	      //Navigate forward
	      driver.navigate().forward();  
	      //refresh the page
	      driver.navigate().refresh(); 
	      //close the browser
	      driver.close();
	}

}
