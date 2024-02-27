package practise_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/IFrame/index.html");
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				 System.out.println("Navigate to url page");
				WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
				driver.switchTo().frame(newFrame);
				 System.out.println("Switch to Iframe");
				
			//driver.findElement(By.xpath("//*[@id='nav-title']")).click();
			driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[3]/a")).click();
			System.out.println("Click the product button of iframe");
			
				//*[@id="nav-title"]
	}				
}
