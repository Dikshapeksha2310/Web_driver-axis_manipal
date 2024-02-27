package Axis.Axis_Manipal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_checkbox_selection {
	

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				//go to that page
				driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
				driver.manage().window().maximize();
				//to select multiple checkbox
			List<WebElement>clist= driver.findElements(By.xpath("//input[@class='cb1-element']"));
			
			
			Thread.sleep(900);
			
			for(WebElement wb: clist)
			{
				wb.click();		
				}

}

}
