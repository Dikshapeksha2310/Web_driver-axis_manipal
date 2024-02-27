package Axis.Axis_Manipal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				driver.manage().window().maximize();
				
				 Thread.sleep(1200);
				  WebElement doubleclickele = driver.findElement(By.xpath("//input[@id='double-click']"));
				  
				  Actions builder = new Actions(driver);
				  
				  
				  builder.doubleClick(doubleclickele).perform();
				  
				
				  org.openqa.selenium.Alert alt = driver.switchTo().alert();
					alt.accept();
				  
					// ContextClick (Right click on double click
					 builder.contextClick(doubleclickele).perform();
			
			
	}

}
