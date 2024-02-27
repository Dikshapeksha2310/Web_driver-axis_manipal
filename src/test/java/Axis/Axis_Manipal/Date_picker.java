package Axis.Axis_Manipal;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				 driver.get("https://www.makemytrip.com/");
				 Thread.sleep(1000);
				 driver.manage().window().maximize();
				 WebElement Date = driver.findElement(By.xpath("//label[@for='departure']"));
					Date.click();
					Thread.sleep(2000);	
					WebElement Date2 = driver
							.findElement(By.xpath("//div[@class='DayPicker-Day'][@aria-label=\"Thu Feb 29 2024\"]"));
					Date2.click();
					
					
				
				 

}
}
