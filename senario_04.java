package bbd_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class senario_04 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to myntra.com
		driver.get(" https://www.myntra.com/");
		ChromeOptions options=new  ChromeOptions();
        options.addArguments("--disable-notifications");

		//maximize the window
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
        
        // close pop up
       // ChromeOptions options=new  ChromeOptions();
        //options.addArguments("--disable-notifications");

   
       
     
       // apply filter
       WebElement n=driver.findElement(By.className("header-title"));
        Actions a = new Actions(driver);
        a.moveToElement(n).perform();
        WebElement m=driver.
        findElement(By.className("common-customRadio gender-label undefined"));
        a.moveToElement(m).click().perform();
        System.out.println("Page navigated to: " +driver.getTitle());
        //click product to buy
       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/picture[1]/img[1]")).click();
      driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/picture[1]/img[1]")).click();
       //click to add on cart
        driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
        driver.findElement(By.cssSelector(" driver.findElement(By.xpath(\"/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/picture[1]/img[1]\")).click();\r\n"
        		+ "      //click to add on cart\r\n"
        		+ "       driver.findElement(By.cssSelector(\".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center\")).click();\r\n"
        		+ "       driver.findElement(By.xpath(\"  driver.findElement(By.xpath(\\\"//span[@class='header-title']// //div[@class='vertical-filters-filters categories-container']\\\")).click();\")).click();\r\n"
        		+ "       ")).click();
        
	}

}
