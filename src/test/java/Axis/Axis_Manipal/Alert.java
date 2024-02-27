package Axis.Axis_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				driver.manage().window().maximize();
				
				WebElement inalert=driver.findElement(By.xpath("//input[@name='alert']"));
				Thread.sleep(700);
				inalert.click();
				org.openqa.selenium.Alert alt = driver.switchTo().alert();
				
				alt.accept();
				
				WebElement confirmalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
				confirmalt.click();
				Thread.sleep(700);
				org.openqa.selenium.Alert alt1 = driver.switchTo().alert();
				alt1.dismiss();
				
				

}
}
