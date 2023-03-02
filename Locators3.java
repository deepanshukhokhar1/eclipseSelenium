package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {

		// Sibling - child to parent traverse
		
		//syntax for paerent -> child -> sibling
		// = //parenttag/childtag/childtag[1]/following-sibling::tagNameOfSIbling[1]
		
		// syntax for child -> parent
		// = //parenttag/childtag/childtag[1]/parent::tagNameOfParent
		
		
		

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://21motoring.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Cool Things")).click();
		////div[@class='tdb-menu-item-text'][7]
		////body/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/h3[1]
	     // /html[1]/body[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/div[1]	
	}
	
	

}
