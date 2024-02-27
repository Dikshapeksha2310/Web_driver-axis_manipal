package Axis.Axis_Manipal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Horizontal {
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				Thread.sleep(500);
				//vertical down scroll upto a particular element Generally we use this
				//creaye javascript obj driver for it
				JavascriptExecutor js=(JavascriptExecutor)driver;
				WebElement ele=driver.findElement(By.xpath(" //span[contains(text(),'Meta © 2024')]"));
				js.executeScript("arguments[0].scrollIntoView(true);", ele);
				Thread.sleep(500);
				
				//this is general scroll in X y bcoz it is vertical so x is o and we give value to y 
				//for upward y is give value in + and for downword give -value
				//Generaaly use scroll by web elemetnt not by this not gud practice
				 js.executeScript("window.scrollBy(0 , 800)", "");
				 Thread.sleep(700);
				 js.executeScript("window.scrollBy(0 , -400)", "");
				 
				//This is for  horizontal down scroll (x and y coordinates)
				 Thread.sleep(700);
				  js.executeScript("window.scrollBy(200 , 0)", "");


}
}