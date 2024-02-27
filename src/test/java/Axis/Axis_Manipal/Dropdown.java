package Axis.Axis_Manipal;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.dummypoint.com/seleniumtemplate.html");
				driver.manage().window().maximize();
				//implicit wait is use to w8 for all elememnt in script it w8 for all el in whole script upto we close
				//browswer session.
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
				WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
				Select sel=new Select(dropdown);
				Thread.sleep(500);
				
				//select by  indexing
				sel.selectByIndex(2);
				Thread.sleep(500);
				//select by vsible text
				sel.selectByVisibleText("Option4");
				Thread.sleep(500);
				//Select by Value
				sel.selectByValue("OptionFive");
				
				
	}

}
