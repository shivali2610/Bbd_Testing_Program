package bbd_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class senario_02 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to yahoo.com
		driver.get(" https://in.yahoo.com/");
		//total number of links
		List<WebElement> links = driver.findElements(By.tagName("li"));
	      System.out.println("The number of links is " + links.size());
	  	// verify text "trending Now"
		String t = "Trending Now";
	      if ( driver.getPageSource().contains("Trending Now"))
	      {
	         System.out.println("Text: " + t + " is present. ");
	      } else
	      {
	         System.out.println("Text: " + t + " is not present. ");
	      }
	      //stay on main page of corona virus
	      driver.findElement(By.xpath("//a[normalize-space()='COVID-19 in India']")).click();
	      //get all content of cases overview like india
	      driver.findElement(By.cssSelector("a[title='COVID-19 in India']")).click();
	      driver.findElement(By.className("class=\"td1 pl-16\"")).click();
	      List<WebElement> cases=driver.findElements(By.className("class=\"td1 pl-16\""));
	     for(int i = 0; i< cases.size(); i++) 
	      {
	          
	         String s = cases.get(i).getText();
	         System.out.println("Text is: " + s);
	       }
	     
	      driver.quit();
	   }

	}


