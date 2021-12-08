package bbd_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_05Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// myntra test for Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krishna\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//navigate to myntra.com
		driver.get(" https://www.myntra.com/");
		//maximize the window*/
        driver.manage().window().maximize();
        //choose section
        driver.findElement(By.className("desktop-main")).click();
        //choose men section
        driver.findElement(By.xpath("(//img[contains(@class,'image-image undefined image-hand')])[1]")).click();
        //open sort by parent class to child class
        driver.findElement(By.className("sort-sortBy")).click();
        driver.findElement(By.className("sort-list//.sort-label.sort-selected")).click();
        // check for filter xpath parent to child
        driver.findElement(By.xpath("//span[@class='header-title']// //div[@class='vertical-filters-filters categories-container']")).click();
        driver.findElement(By.cssSelector("div[class='horizontal-filters-sortContainer'] li:nth-child(1) label:nth-child(1)")).click();
        // close pop up
        //driver.switchTo().alert().dismiss();
       
     
       // apply filter
        WebElement n=driver.findElement(By.className("header-title"));
        Actions a = new Actions(driver);
        a.moveToElement(n).perform();
        WebElement m=driver.
        findElement(By.className("common-customRadio gender-label undefined"));
        a.moveToElement(m).click().perform();
        System.out.println("Page navigated to: " +driver.getTitle());
        //click product on product
       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/picture[1]/img[1]")).click();
      //click to add on cart
       driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
       driver.findElement(By.xpath("  driver.findElement(By.xpath(\"//span[@class='header-title']// //div[@class='vertical-filters-filters categories-container']\")).click();")).click();
       
        
	}

}
