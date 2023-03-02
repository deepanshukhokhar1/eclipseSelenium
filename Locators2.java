package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));       
	    String password = getPassword(driver);                          // we can call this method in the execution by this format 
	   
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
       

		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	    driver.close();
	    
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click(); 
		String passwordtext = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordarray = passwordtext.split("'");        // here after single quote (') the string will break into array also;
		//[0] = Please use temporary password 
		//[1] =  rahulshettyacademy' to Login.
	 //   String[] passwordarray1 = passwordarray[1].split("'");     // here we split the string into array again and we defined new String[] array 
	 //   String password = passwordarray1[0];                          // and created another string for the final text we have.
		String password = passwordarray[1].split("'")[0]; 
	    return password;                                           // we return the passwors so who ever call the password will get the password
		
		
		
	}
	
}

// xpath = how to get the element with text 
// = //tag[text()='name of text']  , instead of tag we can put* also after // ; like = //*[text()='name of text']
//  //button[text()='Log Out']

// now the password that is shown = rahulshettyacademy that can change dynamically so in that case we could run the test so we will make 
//a method to enter password dynamically ; as the password is taken from the text present on webpage so what we will do is copy the text which can
// be regularly changing and put in the password text field.


