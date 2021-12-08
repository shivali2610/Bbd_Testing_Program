package bbd_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class senario_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to yahoo.com
		driver.get(" https://in.yahoo.com/");
		//total number of links 
		//here i used cssSelector 
		List<WebElement> links = driver.findElements(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label"));
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
	      // here i used cssSelector
	      driver.findElement(By.cssSelector("a[title='COVID-19 in India']")).click();
	      //get all content of cases overview like india
	      // here i used Xpath
	      driver.findElement(By.xpath("//span[@class='txt']//b[contains(text(),'India')]")).click();
	      // here i used Xpath
	      driver.findElement(By.xpath("x")).getAttribute(t);
	      //cssSlector
	      List<WebElement> cases=driver.findElements(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)"));
	     for(int i = 0; i< cases.size(); i++) 
	      {
	          
	         String s = cases.get(i).getText();
	         System.out.println("Text is: " + s);
	       }
	     
	      driver.quit();
	   }

	

	}


