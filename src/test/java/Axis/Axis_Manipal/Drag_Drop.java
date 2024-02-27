package Axis.Axis_Manipal;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/drag_and_drop");
				driver.manage().window().maximize();
				// drab and drop
				 
				
				
				WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
		 
				WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
		 
				Actions builder = new Actions(driver);
		 
				builder.dragAndDrop(src, dest).perform();
		 
				System.out.println("The item dragged and dropped");
	}
}
