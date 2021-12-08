package bbd_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeScenario {

	public static void main(String[] args) {
		// test for edge browser
		
				System.setProperty("webdriver.edge.driver", "C:\\Users\\krishna\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
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
