package introduction;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of testing framework



public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TestNG is one of testin framework
		
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
    	
		// handling checkbox
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    //    Assert.assertFalse(false);
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());     // just to check if it provides the false value or not
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());           // to check if the element is selected or not;
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
 	
	// for the test the round trip enabled or disabled
       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());      // here our test fails as it print true but its because of the ui designed like that any element looks disable but when clicking on it will be enabled so the selenium is confusing
      //  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());                       // to check if the return date is enabled or not after the round trip button is selected , if enabled it will return true if not then it will return false
       
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));               // before clicking on  return date celender button 
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));                // after clicking on return date celender button
        
       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))             //contains() is java method where it will scan entire string if that contains provided value 
      {
    	  System.out.println("Its enabled");
    	  Assert.assertTrue(true);
    	  
      } else
      {
    	  Assert.assertTrue(false);                       // if it does not contains(1) this means the radio button is not enabled so the test will fail and ---       
      }
        
        
		// count the no. of checkboxes        // we just have to find the common element.
	   System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());                  // .getSize will give us the size no.of the elements
        
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        
        
        
        int i = 1;
        while (i<5) // 4 times                    // here we write the() whatever is true. , this loop will work till (i<5) after or equals to 5 it will fail.
        {
        	  driver.findElement(By.id("hrefIncAdt")).click();      // put this inside loop
        	i++;                  // i++ incremetinon increasing i till 5 otherwise it will run infinite times  if we dont give this incremetion as i = 1;
        }
        // we can use the for loop also for the same , no diffrence.
        
    	driver.findElement(By.id("btnclosepaxoption")).click(); 
    	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText() , "5 Adult"); 
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
//if we put * in css selector after attribute then it will find the matching element with our value if we don't want to write the full value name.
//tagName[attribute*='value']


// to turn classname to css selector just put . before class name
// .classname

//to turn id to css selector just put # before class name
//#id
