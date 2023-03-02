package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
       
		// its a dynamic elements
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();    // we used x.path with index here.
		
	
		
		// PARENT CHILD RELATION SYNTAX =                         (if we don't want to use the xpath[] index method)
		// = //TAG[@ATTRIBUTE='VALUE'](oneSpace)//TAG[@ATTRIBUTE='VALUE']
	    // //  this is diffrent from //parent/child transverse  
	
	// to select the date in the calender   //  this is for the current date as it is highlighted the only this higlight class will have unique element but for the ohter future date use
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
	
	}
	

}
