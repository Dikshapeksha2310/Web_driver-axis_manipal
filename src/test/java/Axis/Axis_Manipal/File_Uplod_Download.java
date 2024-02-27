package Axis.Axis_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uplod_Download {
	
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				 Thread.sleep(1000);
				 WebElement upload =driver.findElement(By.xpath("//input[@name='upload']"));
				 upload.sendKeys("C:\\Users\\Sarvesh\\OneDrive\\Pictures\\Shrimant Dagdusheth.jpg");
				 Thread.sleep(1000);
				 WebElement down =driver.findElement(By.xpath("//input[@name='download']"));
				 down.click();				 
				 
				 
				 
				 
				//input[@name="upload"]
				 
				//input[@name="download"]
				 
				 

			}

}
