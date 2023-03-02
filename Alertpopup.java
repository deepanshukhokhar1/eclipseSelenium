package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		// alert
		
        String name = "deepanshu";
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		// so now the pop up will come on the screen and that pop is not an html element so it wont get us the  inspect element of that element.
		// so there is method in which we can switch from the driver method to alert() and that can handle these popup methods
		// driver.switchTo().alert() by this we can get to the pop and .accept() method will get us to accept the popup
		
	    System.out.println(driver.switchTo().alert().getText());                       // this will get us the text on the pop up and we print that text
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); 
		driver.switchTo().alert().dismiss();
		

	}

}
