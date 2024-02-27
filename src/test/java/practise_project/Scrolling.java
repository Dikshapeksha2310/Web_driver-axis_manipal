package practise_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://webdriveruniversity.com/Scrolling/index.html");
				  System.out.println("Navigate to  url page ");
				driver.manage().window().maximize();
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("window.scrollBy(0 , 600)", "");
				 System.out.println("Scrolling window down");
				
				 js.executeScript("window.scrollBy(0 , -600)", "");
				 
				 System.out.println("Scrolling window upward");
				 //scroll still web element mention
				 WebElement scroll=driver.findElement(By.xpath("//div[@id='zone4']"));
				 js.executeScript("arguments[0].scrollIntoView(true);", scroll);
				 System.out.println("Scrolling window till the webelement");
				 
	}
}
