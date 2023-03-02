package introduction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		
		 String[] items =  {"Cucumber" ,"Beetroot" , "Tomato" };
		 int j = 0;            // just declaring a variable for if statement to break the statement
		
		 List<WebElement> products  =  driver.findElements(By.cssSelector("h4.product-name"));
		 
		 //so we create a loop to iterate through all these elements and return the size elements  // to scan all the elemets present on the index
		 
		     
		 
		 for(int i = 0; i<products.size();i++)
		 {
			 // due to including of -1kg in the names our code won't run so what we need to do is remove the one kg after getTExt() from name.
			   // Broccoli - 1kg;     // use .split method
			 
			String[] name = products.get(i).getText().split("-");             // now the product go (i) and getText , we use the string here so that we use the variable name in if statement that we want so we put the text in contain method to check
		    String formattedname = name[0].trim();                      // at 0 index we get our name and ,trim(0) will clear the extra space
			
					
			//convert the items[] array to array list
			//to check weather the name we extracted is present in arrayList or not
			
			  List itemlist =  Arrays.asList(items);     // by making it as arrayList we can now fetch elements from it now 
			
			// so if we want to add multiple products to add on cart so we don't have to make many loops 
			//we have to create an array of strings in which all the elements that we want to add on cart are present and then we put the string in contain.() method
 			
			
			//click add to cart
			if(itemlist.contains(formattedname))           // check if the name we fetched throug get() is present on itemlist then add to cart
			{
				j++;                                  // j++ will increment inside the if statement and when to break will be given in a new if statement.
				
				//click add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();   // now this will get(i) loop here and click on the button make sure to write findElements with 's' as we are using for the particular cucumber
				// break;  while using arrayList concept we can not use break; as many elements are present if it stop the loop after finding one element it won't find others
				if(j==items.length)          // as our items has 3 elements present then we dont have to run the loop any more when the loop runs in the if condition 
				{
					break;
				}
			
			
			}
		 }
		 
		 
		 // we have to make sure in dynamic elements always choose xpath as the we selected xpath text()
        //	it selects the text to click on add to cart and after clicking it shows added and then it will added but the text changes at the time and our
		 // index of text() add to cart also changes so it will select 0th index again and that position is changed as the text changes so use xpath with
		 //
		 
		 
		 
	}
}


// we can find the product by xpath [] index method but after some time site will change and change the product list so the index will change
// first we have to do is identify at what index product name 'cucumber' is present for that take all the product names and for the index that cucumber is present we 
// click to add the product for the text cucumber is present in the index
//
// cssSelector syntax for converting the className to cssSelector
// cssSelector syntax = tag.className   == h4.product-name 