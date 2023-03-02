package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// implicit wait - what this will do is we provide time out in here some seconds then it will wait till for ex we provide 5 sec time out before executing 
		// the .getText() // implicit wait should be defined after defining driver  -> driver.manage().timeOuts().

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));             // if something is not showing up on the page then wait 5 seconds to render don't fail immediately
		
		// find element method will get us the element // with By. function we declare which element we want to find like ID, CSS selector , Class Name. 
		// .sendKeys will help to simulate typing the element we give
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("gdsfsfsgs");
		driver.findElement(By.className("submit")).click();               
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());     // this will fail and show error due to time out issue . // .getText will extract the text from // so we use = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);                 // as there is sliding in webpage so there are some error in reset button because selenium is fast so we use this Thread.sleep() method in java
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("deepanshu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("depanv@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();	
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("deepanshu@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999999999");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();              // the reset button is not getting clicked as selinium is very fast other element is getting clicked ,so we need to put .implicitlyWait() after forgot password.
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		
		
		
		
		
		
		
	}
}
//--->  // xpath = how to get the element with text 
//= //tag[text()='name of text']  , instead of tag we can put* also after // ; like = //*[text()='name of text']
////button[text()='Log Out']


//---> locators with xpath index syntax
     // = (//tag[@attribute='value'])[3]
	

//--->	//to turn id to css selector just put # before id
	//#id

	
//--->	// to turn classname to css selector just put . before class name  ; there should be not any spaces between any classes and replace the spaces with . dot 
	// tagname.classname
//cssSelector syntax for converting the className to cssSelector
//cssSelector syntax = tag.className  == h4.productname
	
//--->	// PARENT CHILD RELATION SYNTAX =                         (if we don't want to use the xpath[] index method)
			// = //TAG[@ATTRIBUTE='VALUE'](oneSpace)//TAG[@ATTRIBUTE='VALUE']
	
	// <input type="text" placeholder="Username" id="inputUsername" value=>
	//here -  Tagname = input , Attribute = placeholder , id = inputUsername , value = Username.
    
	
 //--->   // CSS Selector:-
    // Class Name -> tagname.classname || <p class="error">* Incorrect Username or password </p>|| 
    //  = p.error
    // id -> tagname#id
    // tagname[attribute='value']
	
	
//--->	// XPath :-
	// syntax = //Tagname[@attribute='value']
	// = //input[@placeholder='Username']
	//if the element is dynamic keeps on changing 
	// syntax = //tagname[contains(@attribute,'value')] only first four words of value 
 	
	// <input type="text" placeholder="Name">
	// = //input[@placeholder='Name']
	
	
	// now what to do when same //Tagname[@attribute='value'] has many elements of same name then
	// we will just add index [2]and no. at the end of the xpath and cssSelector = (//Tagname[@attribute='value'])[2]

	
	// XPath with parent to child tag element ; some time we dont have attributes also for that time this is what we should have to do.
	//like any heading<h1> element we want to get then we have to use the Xpath with parent child tag element.
	// = //ParentTagName/childTagName[index no.]
	// 
	
	// PARENT CHILD RELATION SYNTAX =                         (if we don't want to use the xpath[] index method)
			// = //TAG[@ATTRIBUTE='VALUE'](oneSpace)//TAG[@ATTRIBUTE='VALUE']
   //  this is diffrent from //parent/child transverse  

