package bbd_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefox_scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\krishna\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
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
