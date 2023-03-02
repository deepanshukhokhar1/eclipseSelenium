package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException{
		// auto suggestive are those that are suggested by only writing the few characters of a word and the suggestions show up.
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);                                 // there is some delay in showing the suggestions
		
		//( List<WebElemnts> options = )is the method we use when we are dealing with list of text by .findElements(by.)
		// SYNTAX = List<WebElemnt> options = driver.findElements(By.cssSelector()
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
                                                       // here , options is nothing but list of elements
		for(WebElement option :options)               // loop will perform in options and that search will be stored in option variable
		{                                              // and return type of loop is WebElement
			
			if (option.getText().equalsIgnoreCase("India"))      // here it will get text and check if that is equal to the provided string.
			{
				      option.click();                                    //we used if here so that if the condition is true then it will perform action 
			         break;           // if we found the option before all the searches then it will be break because by that loop don't need to go through all the options 
			}
					
			
			}	
			
		}
		
		
		
	}

// if we put * in css selector after attribute then it will find the matching element with our value if we don't want to write the full value name.
// tagName[attribute*='value']


