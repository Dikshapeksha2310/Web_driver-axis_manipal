package Axis.Axis_Manipal;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Key {
	public static void main(String[] args) throws InterruptedException, IOException {
	 System.setProperty("webdriver.chrome.driver",
	 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
					//
					Actions builder =new Actions(driver);
				//	Actions class used to perform multiple or seris of task to perform
				org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys(email, "dikSha").build();
				

					seriesofact.perform();
}
}
