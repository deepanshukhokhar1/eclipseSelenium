package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://21motoring.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='td-outer-wrap']/div[contains(@class,'td-main-content-wrap td-main-page-wrap td-container-wrap')]/div[contains(@class,'tdc-content-wrap')]/div[@id='tdi_51']/div[1]")).click();
		
	}

}
