package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seliniumintroduction {                                
	
	
	public static void main(String[] args) {
		
	
		
		
		// key -> WebDriver.chrome.driver --> value of path
		// System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		 

	    //	WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		// for microsoft edge 
		 System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
		
		 WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
		
		
		
	}

}


// implement WebDriver //so chrome driver is agreeing to implement 
// all the methods present in this WebDriver


// Invoking Browser
// Chrome -ChromeDriver --> Methods close        // to close the code will be same for all
// Firefox - FirefoxDriver --> Methods close   // methods are all same in the browsers


              // ChromeDriver.exe file is the first to be invoked with Selenium as we can not directly invoke so this is third party.
              // ChromeDriver.exe --> ChromeBrowser

 
          //to hit url on the browser the method is = get & to implement that all the classes use same method  

		// WebDriver close , get    // by implementing WebDriver in class then they(chrome , firefox) are forced to imlement methods that are declared here
		
		// WebDriver methods will be implemented but also their own class methods will be implemented
		// WebDriver + Class methods // but these class methods will not be implemented to others like FireFox. 
		// so our goal is to automate the selenium WebDriver interface methods. so then we use WebDriver methods to implement on all of them. 
		
          //driver.close() will close the only window that we opened
          // driver.quit() will close all the windows that are associated with the window           